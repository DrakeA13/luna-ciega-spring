package luna_ciega.controller;

import luna_ciega.model.Servicio;
import luna_ciega.service.ServicioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/servicios")
public class ServicioController {

    @Autowired
    private ServicioService service;

    @GetMapping
    public List<Servicio> listar() {
        return service.listar();
    }

    @PostMapping
    public Servicio guardar(@RequestBody Servicio s) {
        return service.guardar(s);
    }
}
