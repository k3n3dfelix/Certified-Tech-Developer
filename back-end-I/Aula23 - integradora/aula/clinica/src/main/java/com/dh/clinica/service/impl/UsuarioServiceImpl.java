package com.dh.clinica.service.impl;

import com.dh.clinica.config.ConfiguracaoJDBC;
import com.dh.clinica.model.Usuario;
import com.dh.clinica.service.IService;
import org.springframework.stereotype.Service;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

@Service
public class UsuarioServiceImpl implements IService<Usuario> {

    private ConfiguracaoJDBC configuracaoJDBC ;

    public UsuarioServiceImpl() {
        this.configuracaoJDBC = new ConfiguracaoJDBC();
    }

    @Override
    public Usuario salvar(Usuario usuario) {
        Connection conexao = configuracaoJDBC.conectarComBancoDeDados();
        Statement stmt = null;
        String query = String.format("INSERT INTO usuario (nome ,email, senha, nivel_acesso) " +
                        "VALUES ('%s','%s','%s','%s')", usuario.getNome(),
                usuario.getEmail(), usuario.getSenha(), usuario.getNivelAcesso());
        try {
            stmt = conexao.createStatement();
            stmt.executeUpdate(query, Statement.RETURN_GENERATED_KEYS);
            ResultSet keys = stmt.getGeneratedKeys();
            if (keys.next())
                usuario.setId(keys.getInt(1));
            stmt.close();
            conexao.close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return usuario;
    }


    @Override
    public List<Usuario> buscarTodos() {
        Connection conexao = configuracaoJDBC.conectarComBancoDeDados();
        Statement stmt = null;
        String query = "SELECT * FROM USUARIO";
        List<Usuario> usuarios = new ArrayList<>();
        try {
            stmt = conexao.createStatement();
            ResultSet result = stmt.executeQuery(query);
            while (result.next()) {
                usuarios.add(criarObjetoUsuario(result));
            }
            stmt.close();
            conexao.close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return usuarios;
    }


    @Override
    public void excluir(Integer id) {
        Connection conexao = configuracaoJDBC.conectarComBancoDeDados();
        Statement stmt = null;
        String query = String.format("DELETE FROM USUARIO WHERE ID = %s", id);
        try {
            stmt = conexao.createStatement();
            stmt.executeUpdate(query);
            stmt.close();
            conexao.close();
        } catch (SQLException throwables) {

        }
    }


    private Usuario criarObjetoUsuario(ResultSet resultado) throws SQLException {
        Integer id = resultado.getInt("ID");
        String nome = resultado.getString("NOME");
        String email = resultado.getString("EMAIL");
        String senha = resultado.getString("SENHA");
        String nivelAcesso = resultado.getString("NIVEL_ACESSO");
        Usuario usuario = new Usuario(id, nome, email, senha, nivelAcesso);
        return usuario;
    }

}
