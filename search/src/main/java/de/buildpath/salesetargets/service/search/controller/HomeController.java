package de.buildpath.salesetargets.service.search.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
    @RequestMapping("/")
    public String home() {
        return "redirect:swagger-ui.html";
    }

    @RequestMapping("/info")
    public String info() {
        return "redirect:swagger-ui.html";
    }
}