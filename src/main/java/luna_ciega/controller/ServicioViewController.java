package luna_ciega.controller;

import luna_ciega.repository.ServicioRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ServicioViewController {

    @Autowired
    private ServicioRepository servicioRepo;

    @GetMapping("/servicios")
    public String verServicios(
            Model model
    ){

        model.addAttribute(
                "servicios",
                servicioRepo.findAll()
        );

        return "servicios";
    }

}