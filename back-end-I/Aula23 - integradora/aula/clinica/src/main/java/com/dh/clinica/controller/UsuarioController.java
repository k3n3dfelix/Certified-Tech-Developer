package com.dh.clinica.controller;

import com.dh.clinica.model.Usuario;
import com.dh.clinica.service.impl.UsuarioServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {

    @Autowired
    private UsuarioServiceImpl usuarioService;

    @GetMapping("/buscar")
    public List<Usuario> listarTodos() {
        return usuarioService.buscarTodos();
    }

    @DeleteMapping("{id}")
    public void deletarUsuario( @PathVariable Integer id) {
        usuarioService.excluir(id);
    }

    @PostMapping
    public Usuario cadastrar(@RequestBody Usuario usuario){
        return usuarioService.salvar(usuario);
    }


}
