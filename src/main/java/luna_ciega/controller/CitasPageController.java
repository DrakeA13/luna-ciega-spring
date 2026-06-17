package luna_ciega.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CitasPageController {

    @GetMapping("/mis-citas")
    public String citas() {

        return "mis-citas";

    }

}