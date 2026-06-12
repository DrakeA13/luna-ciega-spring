package luna_ciega.controller;

import luna_ciega.dto.CitaRequest;
import luna_ciega.model.Cita;
import luna_ciega.service.CitaService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/citas")
public class CitaController {

    @Autowired
    private CitaService service;

    @GetMapping
    public List<Cita> listar() {
        return service.listar();
    }

    @PostMapping
    public Cita crear(
            @RequestBody CitaRequest req
    ) {
        return service.crearCita(req);
    }
}