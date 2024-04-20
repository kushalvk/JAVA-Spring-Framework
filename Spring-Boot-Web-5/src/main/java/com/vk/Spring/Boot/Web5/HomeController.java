package com.vk.Spring.Boot.Web5;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

    @RequestMapping("/")
    public String home() {
        System.out.println("Home Method Called");
        return "index"; // (index.jsp) extension (prefix and suffix) is mention in -> resources/application.properties
    }

    @RequestMapping("add") // form url start from "add"
//    public String add(HttpServletRequest req, HttpSession ses) {
//        int num1 = Integer.parseInt(req.getParameter("num1"));
//        int num2 = Integer.parseInt(req.getParameter("num2"));
//        int result = num1 + num2;
//        ses.setAttribute("result",result); // 'HttpSession' is use to add attributes in this
//
//        return "result.jsp";
//    }

//    public String add(int num1,int num2, HttpSession ses) { // 'num1' and 'num2' is same name as a url parameter name
//        int result = num1 + num2;
//        ses.setAttribute("result",result); // 'HttpSession' is use to add attributes in this
//
//        return "result.jsp";
//    }

//    public String add(@RequestParam("num1") int n1,@RequestParam("num2") int n2, HttpSession ses) { // if you change a variable name
//        int result = n1 + n2;
//        ses.setAttribute("result",result); // 'HttpSession' is use to add attributes in this
//
//        return "result.jsp";
//    }

//    public String add(@RequestParam("num1") int n1,@RequestParam("num2") int n2, Model model) { // Model
//        int result = n1 + n2;
//        model.addAttribute("result", result);
//
//        return "result"; // (result.jsp) extension (prefix and suffix) is mention in -> resources/application.properties
//    }

    public ModelAndView add(@RequestParam("num1") int n1,@RequestParam("num2") int n2, ModelAndView mv) { // ModelAndView
        int result = n1 + n2;
        mv.addObject("result", result);
        mv.setViewName("result");

        return mv;
    }

//  Alian class
    @RequestMapping("addAlian")
//    public ModelAndView addAlian(@RequestParam("aid") int n1,@RequestParam("aname") String s2, ModelAndView mv) { // ModelAndView
//
//        Alien alien = new Alien();
//        alien.setAid(n1);
//        alien.setAname(s2);
//
//        mv.addObject("alien", alien);
//        mv.setViewName("result");
//
//        return mv;
//    }

    public String addAlian(Alien alien) { // this Alien object is same name in result file 'alien'
        return "result";
    }

    @ModelAttribute("cources")
    public String courcesname() {
        return "JAVA";
    }
}
