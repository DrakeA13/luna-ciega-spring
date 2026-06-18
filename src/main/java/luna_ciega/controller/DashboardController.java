package luna_ciega.controller;

import luna_ciega.dto.DashboardDTO;

import luna_ciega.model.Cita;

import luna_ciega.service.DashboardService;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DashboardController {

    @Autowired
    DashboardService service;

    @GetMapping(
            "/api/dashboard"
    )
    public DashboardDTO obtener(){

        return service.obtener();

    }

    @GetMapping(
            "/api/dashboard/citas"
    )

    public List<Cita> citas(){

        return

                service
                        .ultimasCitas();

    }

}