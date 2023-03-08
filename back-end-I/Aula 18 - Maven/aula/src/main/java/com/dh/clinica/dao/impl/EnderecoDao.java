package com.dh.clinica.dao.impl;

import com.dh.clinica.config.ConfiguracaoJDBC;
import com.dh.clinica.dao.IDao;
import com.dh.clinica.model.Endereco;
import org.apache.log4j.Logger;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class EnderecoDao implements IDao<Endereco> {

    private ConfiguracaoJDBC configuracaoJDBC;

    private final static Logger logger = Logger.getLogger(EnderecoDao.class);
    public EnderecoDao() {
        this.configuracaoJDBC = new ConfiguracaoJDBC();
    }

    @Override
    public Endereco salvar(Endereco endereco) {
        Connection connection = configuracaoJDBC.conectarComBancoDeDados();
        Statement statement = null;
        String query = String.format("INSERT INTO endereco(rua, numero,cidade,bairro) VALUES('%S', '%S', '%S', '%S')", endereco.getRua(), endereco.getNumero(), endereco.getCidade(), endereco.getBairro());

        try{
            statement = connection.createStatement();
            statement.executeUpdate(query, Statement.RETURN_GENERATED_KEYS);
            ResultSet keys = statement.getGeneratedKeys();
            if(keys.next()){
                endereco.setId(keys.getInt(1));
                statement.close();
                connection.close();
            }
        }catch(SQLException e){
            e.printStackTrace();
        }
        return endereco;
    }


    @Override
    public List<Endereco> buscarTodos() {
        Connection connection = configuracaoJDBC.conectarComBancoDeDados();
        Statement statement = null;
        String query = String.format("SELECT * FROM endereco");
        List<Endereco>enderecos = new ArrayList<>();
        try{
            statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(query);

            while (resultSet.next()){
                enderecos.add(criarEndereco(resultSet));
            }
            statement.close();
            connection.close();

        }catch(SQLException e){
            e.printStackTrace();
        }
        return enderecos;
    }

    @Override
    public void deletar(int id) {
        logger.debug("Excluindo endereco comid: + id");

        Connection connection = configuracaoJDBC.conectarComBancoDeDados();
        Statement statement = null;
        String query = String.format("DELETE FROM endereco WHERE id = '%s'", id);

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
    public Endereco buscarPorId(int id) {
        logger.debug("Buscando endereco por id: " +id);

        Connection connection = configuracaoJDBC.conectarComBancoDeDados();
        Statement statement = null;
        String query = String.format("SELECT * FROM endereco WHERE id = '%s'", id);
        Endereco endereco = null;

        try{
            statement = connection.createStatement();
            ResultSet resultSet  = statement.executeQuery(query);

            endereco = criarEndereco(resultSet);

            statement.close();
            connection.close();

        }catch(SQLException e){
            e.printStackTrace();
        }

         return endereco;
    }


    @Override
    public Endereco atualizar(Endereco endereco) {
        return null;
    }

    public Endereco criarEndereco(ResultSet resultSet) throws SQLException{
        int id = resultSet.getInt("id") ;
        String rua  = resultSet.getString("rua");
        String numero = resultSet.getString("numero");
        String cidade = resultSet.getString("cidade");
        String bairro = resultSet.getString("bairro");

        Endereco endereco = new Endereco(id, rua, numero, cidade, bairro);

        return endereco;

    }
}
