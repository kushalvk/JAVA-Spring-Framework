package com.example.SpringAI;

// for running this all you need API Key of Openai

import org.springframework.ai.chat.client.ChatClient;
import org.springframework.ai.chat.client.advisor.MessageChatMemoryAdvisor;
import org.springframework.ai.chat.memory.ChatMemory;
import org.springframework.ai.chat.memory.MessageWindowChatMemory;
import org.springframework.ai.chat.model.ChatResponse;
import org.springframework.ai.chat.prompt.Prompt;
import org.springframework.ai.chat.prompt.PromptTemplate;
import org.springframework.ai.document.Document;
import org.springframework.ai.embedding.EmbeddingModel;
import org.springframework.ai.openai.OpenAiChatModel;
import org.springframework.ai.vectorstore.SearchRequest;
import org.springframework.ai.vectorstore.VectorStore;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
public class OpenAiController {

    private ChatClient chatClient;

    public OpenAiController(OpenAiChatModel chatModel) {
        this.chatClient = ChatClient.create(chatModel);
    }

//    ChatMemory chatMemory = MessageWindowChatMemory.builder().build();

//    public OpenAiController(ChatClient.Builder builder) {
//        this.chatClient = builder
//                .defaultAdvisors(MessageChatMemoryAdvisor
//                        .builder(chatMemory)
//                        .build())
//                .build();
//    }

    @GetMapping("/api/message/{message}")
    public ResponseEntity<String> getAnswer(@PathVariable String message) {

        ChatResponse chatResponse = chatClient
                .prompt(message)
                .call()
                .chatResponse();

        System.out.println(chatResponse.getMetadata().getModel());

        String response = chatResponse.getResult().getOutput().getText();

        return ResponseEntity.ok(response);
    }

    @PostMapping("/api/recommend")
    public String recommend(@RequestParam String type, @RequestParam String year, @RequestParam String language) {

        String temp = """
                I want to watch a {type} move tonight with good rating,
                looking for movie around this year {year}.
                The Language im looking for is {lang}
                Suggest One Specific movie and tell me the cast and length of the movie.
                
                Response format should be
                1. Movie name
                2. basic plot
                3. cast
                4. length
                5. IMDB rating
                """;

        PromptTemplate proptTemplate = new PromptTemplate(temp);
        Prompt prompt = proptTemplate.create(Map.of("type", type, "year", year, "lang", language));

        String response = chatClient
                .prompt(prompt)
                .call()
                .content();

        return  response;
    }

    @Autowired
    @Qualifier("openAiEmbeddingModel")
    private EmbeddingModel embeddingModel;

    @PostMapping("/api/embedding")
    public float[] embedding(@RequestParam String text) {
        return embeddingModel.embed(text); // it's return float value which we can show in graph
    }

    @PostMapping("/api/similarity")
    public double getSimilarity(@RequestParam String text1, @RequestParam String text2) {

        float[] embadding1 = embeddingModel.embed(text1);
        float[] embadding2 = embeddingModel.embed(text2);

        double dotProduct = 0;
        double norm1 = 0;
        double norm2 = 0;

        for (int i = 0; i < embadding1.length; i++) {
            dotProduct += embadding1[i] * embadding2[i];
            norm1 += Math.pow(embadding1[i], 2);
            norm2 += Math.pow(embadding2[i], 2);
        }

        return dotProduct / (Math.sqrt(norm1) * Math.sqrt(norm2));
    }

    @Autowired
    private VectorStore vectorStore;

    @PostMapping("/api/product")
    public List<Document> getProducts(@RequestParam String text) {
//        return vectorStore.similaritySearch(text);
        return vectorStore.similaritySearch(SearchRequest.builder().query(text).topK(2).build());
    }
}
