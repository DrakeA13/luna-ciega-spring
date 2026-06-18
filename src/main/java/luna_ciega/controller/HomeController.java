package luna_ciega.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String inicio(){

        return "index";

    }

    @GetMapping("/login")
    public String login(){

        return "login";

    }

    @GetMapping("/agendar")
    public String agendar(){

        return "agendar";

    }

    @GetMapping("/admin")
    public String admin(){

        return "admin-dashboard";

    }

    @GetMapping("/calendario")
    public String calendario() {

        return "calendario";

    }

    @GetMapping("/dashboard")
    public String dashboard(){

        return "mis-citas";

    }

    @GetMapping("/empleado")
    public String empleado(){

        return "empleado-dashboard";

    }

}
