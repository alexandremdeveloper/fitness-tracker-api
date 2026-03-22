package br.com.alexandre.fitnessbackend.controller;

import br.com.alexandre.fitnessbackend.security.JwtUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/auth")
public class AuthController {

    @Autowired
    private JwtUtil jwtUtil;

    @PostMapping("/login")
    public Map<String, String> login(@RequestBody Map<String, String> body) {

        String username = body.get("username");
        String password = body.get("password");

        // Simples (depois podemos melhorar com banco)
        if ("admin".equals(username) && "123".equals(password)) {
            String token = jwtUtil.generateToken(username);
            return Map.of("token", token);
        }

        throw new RuntimeException("Usuário ou senha inválidos");
    }
}