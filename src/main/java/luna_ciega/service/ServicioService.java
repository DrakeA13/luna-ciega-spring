package luna_ciega.service;

import luna_ciega.model.Servicio;
import luna_ciega.repository.ServicioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServicioService {

    @Autowired
    private ServicioRepository repo;

    public List<Servicio> listar() {
        return repo.findAll();
    }

    public Servicio guardar(Servicio s) {
        return repo.save(s);
    }
}
