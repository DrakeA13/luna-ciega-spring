package luna_ciega.controller;

import luna_ciega.dto.LoginRequest;
import luna_ciega.model.Usuario;
import luna_ciega.service.AuthService;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;

@RestController

@RequestMapping(
        "/api/auth"
)

public class AuthController {

    @Autowired
    private AuthService service;

    @PostMapping(
            "/login"
    )

    public Usuario login(

            @RequestBody
            LoginRequest req

    ){

        return service.login(
                req
        );

    }

}
