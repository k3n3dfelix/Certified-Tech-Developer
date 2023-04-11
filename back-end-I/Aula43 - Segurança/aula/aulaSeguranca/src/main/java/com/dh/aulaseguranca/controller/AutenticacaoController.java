package com.dh.aulaseguranca.controller;

import com.dh.aulaseguranca.model.Usuario;
import com.dh.aulaseguranca.model.dto.UsuarioDTO;
import com.dh.aulaseguranca.security.TokenService;
import com.dh.aulaseguranca.service.impl.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/usuarios")
public class AutenticacaoController {

    @Autowired
    private AuthenticationManager manager;

    @Autowired
    private UsuarioService usuarioService;

    @Autowired
    private TokenService tokenService;

    @PostMapping("/logar")
    public ResponseEntity logar(@RequestBody UsuarioDTO usuarioDTO){
        UsernamePasswordAuthenticationToken token = new UsernamePasswordAuthenticationToken(usuarioDTO.getLogin(), usuarioDTO.getSenha());
        Authentication authenticate = manager.authenticate(token);
        String tokenJWT = tokenService.gerarToken((Usuario) authenticate.getPrincipal());
        return ResponseEntity.ok();
    }

    @PostMapping("/cadastrar")
    public ResponseEntity cadastrar(@RequestBody UsuarioDTO usuarioDTO){

    }
}
