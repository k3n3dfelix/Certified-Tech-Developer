package com.dh.aulaseguranca.service.impl;

import com.dh.aulaseguranca.model.Usuario;
import com.dh.aulaseguranca.model.dto.UsuarioDTO;
import com.dh.aulaseguranca.repository.IUsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService {

    @Autowired
    private IUsuarioRepository usuarioRepository;

    public  UsuarioDTO salvar(UsuarioDTO usuarioDTO){
        Usuario usuario = toUsuario(usuarioDTO);
        BCryptPasswordEncoder
        Usuario usuarioSalvo = usuarioRepository.save(usuario);
        UsuarioDTO usuarioResponse = toUsuarioDTO(usuarioSalvo);
        return usuarioResponse;
    }

    public Usuario toUsuario(UsuarioDTO usuarioDTO){
        return Usuario.builder()
                .login(usuarioDTO.getLogin())
                .senha(usuarioDTO.getSenha())
                .build();
    }

    public Usuario toUsuarioDTO(Usuario usuario){
        return Usuario.builder()
                .login(usuario.getLogin())
                .senha(usuario.getSenha())
                .build();
    }
}
