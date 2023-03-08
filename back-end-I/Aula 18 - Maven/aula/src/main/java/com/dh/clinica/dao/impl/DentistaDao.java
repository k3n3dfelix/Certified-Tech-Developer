package com.dh.clinica.dao.impl;

import com.dh.clinica.config.ConfiguracaoJDBC;
import com.dh.clinica.dao.IDao;
import com.dh.clinica.model.Dentista;
import com.dh.clinica.model.Endereco;
import org.apache.log4j.Logger;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class DentistaDao implements IDao<Dentista> {

    private ConfiguracaoJDBC configuracaoJDBC;

    private final static Logger logger = Logger.getLogger(DentistaDao.class);
    public DentistaDao() {
        this.configuracaoJDBC = new ConfiguracaoJDBC();
    }

    @Override
    public Dentista salvar(Dentista dentista) {
        Connection connection = configuracaoJDBC.conectarComBancoDeDados();
        Statement statement = null;
        String query = String.format("INSERT INTO dentista(nome, sobrenome,matricula) VALUES('%S', '%S', '%S')", dentista.getNome(), dentista.getSobrenome(), dentista.getMatricula());

        try{
            statement = connection.createStatement();
            statement.executeUpdate(query, Statement.RETURN_GENERATED_KEYS);
            ResultSet keys = statement.getGeneratedKeys();
            if(keys.next()){
                dentista.setId(keys.getInt(1));
                statement.close();
                connection.close();
            }
        }catch(SQLException e){
            e.printStackTrace();
        }
        return dentista;
    }


    @Override
    public List<Dentista> buscarTodos() {
        Connection connection = configuracaoJDBC.conectarComBancoDeDados();
        Statement statement = null;
        String query = String.format("SELECT * FROM dentista");
        List<Dentista>dentistas = new ArrayList<>();
        try{
            statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(query);

            while (resultSet.next()){
                dentistas.add(criarDentista(resultSet));
            }
            statement.close();
            connection.close();

        }catch(SQLException e){
            e.printStackTrace();
        }
        return dentistas;
    }

    @Override
    public void deletar(int id) {
        logger.debug("Excluindo dentista com id: + id");

        Connection connection = configuracaoJDBC.conectarComBancoDeDados();
        Statement statement = null;
        String query = String.format("DELETE FROM dentista WHERE id = '%s'", id);

        try{
            statement = connection.createStatement();
            statement.executeUpdate(query);
            statement.close();
            connection.close();

        }catch(SQLException e){
            e.printStackTrace();
        }
    }

    @Override
    public Dentista buscarPorId(int id) {
        logger.debug("Buscando dentista por id: " +id);

        Connection connection = configuracaoJDBC.conectarComBancoDeDados();
        Statement statement = null;
        String query = String.format("SELECT * FROM dentista WHERE id = '%s'", id);
        Dentista dentista = null;

        try{
            statement = connection.createStatement();
            ResultSet resultSet  = statement.executeQuery(query);

            dentista = criarDentista(resultSet);

            statement.close();
            connection.close();

        }catch(SQLException e){
            e.printStackTrace();
        }

         return dentista;
    }

    @Override
    public Dentista atualizar(Dentista dentista) {
        return null;
    }


    public Dentista criarDentista(ResultSet resultSet) throws SQLException{
        int id = resultSet.getInt("id") ;
        String nome  = resultSet.getString("nome");
        String sobrenome = resultSet.getString("sobrenome");
        String matricula = resultSet.getString("matricula");

        Dentista dentista = new Dentista(id, nome, sobrenome, matricula);

        return dentista;

    }
}
