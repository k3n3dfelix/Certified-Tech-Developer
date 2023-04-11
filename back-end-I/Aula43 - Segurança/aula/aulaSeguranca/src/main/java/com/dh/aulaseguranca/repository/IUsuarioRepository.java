package com.dh.aulaseguranca.repository;

import com.dh.aulaseguranca.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Repository;

@Repository
public interface IUsuarioRepository extends JpaRepository<Usuario, Long> {
    UserDetails findByLogin(String username);
}
