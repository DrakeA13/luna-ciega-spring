package luna_ciega.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String inicio() {
        return "index";
    }

    @GetMapping("/agendar")
    public String agendar(){

        return "agendar";

    }

}