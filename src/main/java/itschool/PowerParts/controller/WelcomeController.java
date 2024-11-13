package itschool.PowerParts.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WelcomeController {

    // This method maps the root URL ("/") to the welcome page
    @GetMapping("/")
    public String welcomePage() {
        return "welcome"; // This returns the "welcome.html" Thymeleaf template
    }
}
