package luna_ciega.service;

import luna_ciega.dto.LoginRequest;
import luna_ciega.model.Usuario;
import luna_ciega.repository.UsuarioRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthService {

    @Autowired
    private UsuarioRepository repo;

    public Usuario login(
            LoginRequest req
    ){

        Usuario u=

                repo.findByCorreo(
                                req.getCorreo()
                        )

                        .orElseThrow(
                                ()->new RuntimeException(
                                        "Correo incorrecto"
                                )
                        );

        if(
                !u.getContrasena()
                        .equals(
                                req.getContrasena()
                        )
        ){

            throw new RuntimeException(
                    "Contraseña incorrecta"
            );

        }

        return u;

    }

}