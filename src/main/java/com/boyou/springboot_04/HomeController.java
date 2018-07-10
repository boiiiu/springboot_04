package com.boyou.springboot_04;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {

    @RequestMapping("/loadform")
    public String loadFormPage()
    {
        return"formtemplate";
    }

    @RequestMapping("proccesform")
    public String loadFormPage(@RequestParam("login") String login, Model model)
    {
        model.addAttribute("login",login);
        return "confirm";
    }
}
