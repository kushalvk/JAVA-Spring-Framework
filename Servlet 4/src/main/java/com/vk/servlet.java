package com.vk;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class servlet extends HttpServlet {
    public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {

//        doGet :- Method is use to the Request data from the server
//        doPost :- Method is use to the Response data from the server
//        doPut :- Method is use to the Update data from the server
//        doDelete :- Method is use to the Delete data from the server

        System.out.println("In service");

        res.setContentType("text/html"); // to write html tags.

        PrintWriter out = res.getWriter(); // to write in web page
        out.println("<h1><b>Hello world</b></h1>");

    }
}
