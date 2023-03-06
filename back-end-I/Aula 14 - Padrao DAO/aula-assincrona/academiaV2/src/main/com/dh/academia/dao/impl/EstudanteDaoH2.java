package main.com.dh.academia.dao.impl;

import main.com.dh.academia.dao.ConfiguracaoJDBC;
import main.com.dh.academia.dao.IDao;
import main.com.dh.academia.model.Estudante;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class EstudanteDaoH2 implements IDao<Estudante> {

    private ConfiguracaoJDBC configuracaoJDBC;

    public EstudanteDaoH2(ConfiguracaoJDBC configuracaoJDBC) {
        this.configuracaoJDBC = configuracaoJDBC;
    }

    @Override
    public Estudante salvar(Estudante estudante) {
        Connection connection = configuracaoJDBC.conectarComBancoDeDados();
        Statement stmt = null;
        String query = String.format("INSERT INTO ESTUDANTES VALUES('%s','%s','%s')", estudante.getId(), estudante.getNome(), estudante.getSobrenome());
        try {
            stmt = connection.createStatement();
            stmt.executeUpdate(query);
            stmt.close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return estudante;
    }

    @Override
    public void eliminar(String id) {
        Connection connection = configuracaoJDBC.conectarComBancoDeDados();
        Statement stmt = null;
        String query = String.format("DELETE FROM ESTUDANTES where id = %s", id);
        try {
            stmt = connection.createStatement();
            stmt.executeUpdate(query);
            stmt.close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }


    }

    @Override
    public Estudante buscar(String id) {
        Connection connection = configuracaoJDBC.conectarComBancoDeDados();
        Statement stmt = null;
        String query = String.format("SELECT id,nome, sobrenome FROM ESTUDANTES where ID = '%s'", id);
        Estudante estudante = null;
        try {
            stmt = connection.createStatement();
            ResultSet result = stmt.executeQuery(query);
            while (result.next()) {
                String idEstudante = result.getString("id");
                String nome = result.getString("nome");
                String sobrenome = result.getString("sobrenome");
                estudante = new Estudante(idEstudante, nome, sobrenome);
            }

            stmt.close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

        return estudante;
    }

    @Override
    public List<Estudante> buscarTodos() {
        Connection connection = configuracaoJDBC.conectarComBancoDeDados();
        Statement stmt = null;
        String query = "SELECT *  FROM ESTUDANTES";
        List<Estudante> estudantes = new ArrayList<>();
        try {
            stmt = connection.createStatement();
            ResultSet result = stmt.executeQuery(query);
            while (result.next()) {
                String id = result.getString("id");
                String nome = result.getString("nome");
                String sobrenome = result.getString("sobrenome");
                estudantes.add(new Estudante(id, nome, sobrenome));

            }

            stmt.close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

        return estudantes;
    }
}
