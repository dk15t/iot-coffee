package me.dkist.iot.web.pages;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PagesController {
    
    @RequestMapping("/")
    public String index() {
        return "index";
    }
    
}
