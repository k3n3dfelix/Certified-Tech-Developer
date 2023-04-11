package com.dh.aulaseguranca.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

import org.hibernate.annotations.Table;
import org.springframework.security.core.userdetails.UserDetails;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name="usuarios")
public class Usuario implements UserDetails {
    
    @Id@GeneratedValue(strategy  = GenerationType.IDENTITY)
    private Long id;
    private String login;
    private String senha;

}
