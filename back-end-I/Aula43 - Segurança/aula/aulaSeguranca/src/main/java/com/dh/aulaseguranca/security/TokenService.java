package com.dh.aulaseguranca.security;

import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.exceptions.JWTCreationException;
import com.dh.aulaseguranca.model.Usuario;
import org.springframework.stereotype.Service;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneOffset;

@Service
public class TokenService {
    public String gerarToken(Usuario usuario) {
        try {
            Algorithm algorithm = Algorithm.HMAC256("2313246546");
            return JWT.create()
                    .withIssuer("API Loja")
                    .withSubject(usuario.getLogin())
                    .withExpiresAt(dataExpiracao())
                    .sign(algorithm);
        } catch (JWTCreationException exception){
            throw new RuntimeException("Token JWT invalidou ou expirado");
        }

        private Instant dataExpiracao() {
            return LocalDateTime.now().plusHours(2).toInstant(ZoneOffset.of("-03:00"));
        }
    }

    public String getSubject(String tokenJWT) {
        try {
            Algorithm algorithm = Algorithm.HMAC256("2313246546");
            return JWT.require(algorithm)
                    .withIssuer("API Loja")
                    .build()
                    .verify(tokenJWT)
                    .getSubject();

        } catch (JWTCreationException exception){
            throw new RuntimeException("Token JWT invalidou ou expirado");
        }
    }
}
