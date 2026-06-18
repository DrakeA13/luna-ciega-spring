package luna_ciega.service;

import luna_ciega.dto.CitaRequest;
import luna_ciega.model.Cita;
import luna_ciega.model.Servicio;
import luna_ciega.model.Usuario;
import luna_ciega.repository.CitaRepository;
import luna_ciega.repository.ServicioRepository;
import luna_ciega.repository.UsuarioRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class CitaService {

    @Autowired
    private CitaRepository repo;

    @Autowired
    private UsuarioRepository usuarioRepo;

    @Autowired
    private ServicioRepository servicioRepo;


    public List<Cita> listar() {

        return repo.findAll();

    }


    public List<Cita> listarPorUsuario(
            Long idUsuario
    ){

        return repo.findByUsuarioIdUsuario(
                idUsuario
        );

    }


    public Cita crearCita(
            CitaRequest req
    ) {

        Usuario usuario =
                usuarioRepo
                        .findById(
                                req.getIdUsuario()
                        )
                        .orElseThrow(() ->
                                new RuntimeException(
                                        "Usuario no existe"
                                )
                        );

        Servicio servicio =
                servicioRepo
                        .findById(
                                Long.valueOf(
                                        req.getIdServicio()
                                )
                        )
                        .orElseThrow(() ->
                                new RuntimeException(
                                        "Servicio no existe"
                                )
                        );

        Cita cita =
                new Cita();

        cita.setUsuario(
                usuario
        );

        cita.setServicio(
                servicio
        );

        cita.setFechaHoraInicio(
                LocalDateTime.parse(
                        req.getFechaHoraInicio()
                )
        );

        cita.setFechaHoraFin(
                LocalDateTime.parse(
                        req.getFechaHoraFin()
                )
        );

        cita.setNotas(
                req.getNotas()
        );

        cita.setEstado(
                "PENDIENTE"
        );

        return repo.save(
                cita
        );

    }


    public void cancelar(
            Long id
    ){

        repo.deleteById(
                id
        );

    }

}