package luna_ciega.service;

import luna_ciega.dto.DashboardDTO;

import luna_ciega.model.Cita;

import luna_ciega.repository.UsuarioRepository;

import luna_ciega.repository.CitaRepository;

import luna_ciega.repository.ServicioRepository;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DashboardService {

    @Autowired
    UsuarioRepository usuarioRepo;

    @Autowired
    CitaRepository citaRepo;

    @Autowired
    ServicioRepository servicioRepo;

    public DashboardDTO obtener(){

        DashboardDTO d=
                new DashboardDTO();

        d.setUsuarios(
                usuarioRepo.count()
        );

        d.setCitas(
                citaRepo.count()
        );

        d.setServicios(
                servicioRepo.count()
        );

        d.setPendientes(
                citaRepo.count()
        );

        return d;

    }

    public List<Cita> ultimasCitas(){

        return

                citaRepo
                        .findTop5ByOrderByIdCitaDesc();

    }

}