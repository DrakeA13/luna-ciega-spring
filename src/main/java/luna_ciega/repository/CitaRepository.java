package luna_ciega.repository;

import luna_ciega.model.Cita;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface CitaRepository extends JpaRepository<Cita, Long> {

    List<Cita> findByUsuarioIdUsuario(
            Long idUsuario
    );


    List<Cita> findTop5ByOrderByIdCitaDesc();

}