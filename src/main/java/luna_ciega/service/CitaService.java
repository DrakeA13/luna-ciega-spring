package luna_ciega.service;

import luna_ciega.model.Cita;
import luna_ciega.repository.CitaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CitaService {

    @Autowired
    private CitaRepository repo;

    public List<Cita> listar() {
        return repo.findAll();
    }

    public Cita guardar(Cita c) {
        return repo.save(c);
    }
}