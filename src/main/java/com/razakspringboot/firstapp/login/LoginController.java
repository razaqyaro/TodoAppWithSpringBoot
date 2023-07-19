package com.razakspringboot.firstapp.login;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping
public class LoginController
{
    @GetMapping("login")
    public String goToLoginPage()
    {
        return "login";
    }
    @PostMapping("login")
    public String gotToWelcomePage(@RequestParam String name, @RequestParam String password, ModelMap model)
    {
        model.put("name", name);
        model.put("password", password);
        return "welcome";
    }
}
