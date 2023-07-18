package com.razakspringboot.firstapp.hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping
public class SayHelloController
{
    @GetMapping ("say-hello")
    public String sayHello()
    {
        return "Hello! What are you learning today?";
    }

   @GetMapping("say-hello-html")
    public String sayHelloHtml()
    {
        StringBuffer sb = new StringBuffer();

        sb.append("<html>");
        sb.append("<head>");
        sb.append("<title>My first HTML Page</title>");
        sb.append("</head>");
        sb.append("<body>");
        sb.append("My first html page with body");
        sb.append("</body>");
        sb.append("</html>");

        return sb.toString();

    }

    @GetMapping("say-hello-jsp")
    public String sayHelloJsp()
    {
        return "sayHello";
    }
}
