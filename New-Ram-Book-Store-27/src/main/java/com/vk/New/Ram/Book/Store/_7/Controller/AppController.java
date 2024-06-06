package com.vk.New.Ram.Book.Store._7.Controller;

import com.vk.New.Ram.Book.Store._7.Model.*;
import com.vk.New.Ram.Book.Store._7.Service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class AppController {

    @GetMapping({"/","login"})
    public String login() {
        return "Login";
    }

    @GetMapping("About")
    public String About() {
        return "About";
    }

    @Autowired
    BookService bookService;

    @GetMapping("Books")
    public String Books(Model model) {
        List<Book> Books = bookService.getAllBooks();
        model.addAttribute("Books", Books);
        return "Books";
    }

    @Autowired
    ABookService abookService;

    @GetMapping("Abooks")
    public String Abooks(Model model) {
        List<ABook> Abooks = abookService.getAllABooks();
        model.addAttribute("Abooks", Abooks);
        return "Abooks";
    }

    @Autowired
    EBookService ebookService;

    @GetMapping("Ebooks")
    public String Ebooks(Model model) {
        List<EBook> Ebooks = ebookService.getAllEBooks();
        model.addAttribute("Ebooks", Ebooks);
        return "Ebooks";
    }

    @GetMapping("Cart")
    public String Cart(Model model) {
        List<Cart> Cart = cartService.gatCartItarm();
        model.addAttribute("Cart", Cart);
        return "Cart";
    }

    @Autowired
    CartService cartService;

    @GetMapping("add-to-cart/{bookname}")
    public String addToCart(@PathVariable String bookname) {
        Book book = bookService.getAllBooks().stream().filter(b -> b.getBookname().equals(bookname)).findFirst().orElse(null);
        if (book != null) {
            cartService.AddToCart(book);
        }
        return "redirect:/Cart";
    }

    @GetMapping("removeFromCart/{id}")
    public String removeBook(@PathVariable int id) {
        cartService.removeBook(id);
        return "redirect:/Cart";
    }

    @GetMapping("Checkout")
    public String Checkout() {
        return "Checkout";
    }

    @GetMapping("Contact")
    public String Contact() {
        return "Contact";
    }

    @GetMapping("Home")
    public String Home() {
        return "Home";
    }

    @GetMapping("Signup")
    public String Signup() {
        return "Signup";
    }
}
