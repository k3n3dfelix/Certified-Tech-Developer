package com.dh.clinica.dao.impl;

import com.dh.clinica.dao.ConfiguracaoJDBC;
import com.dh.clinica.dao.IDao;
import com.dh.clinica.model.Endereco;
import com.dh.clinica.model.Paciente;
import org.apache.log4j.Logger;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

public class PacienteDao  implements IDao<Paciente> {

    private ConfiguracaoJDBC configuracaoJDBC;

    private EnderecoDao enderecoDao;

    public PacienteDao(EnderecoDao enderecoDao){
        this.configuracaoJDBC = new ConfiguracaoJDBC();
        this.enderecoDao = enderecoDao;
    }

    private final static Logger logger = Logger.getLogger(EnderecoDao.class);

    @Override
    public Paciente salvar(Paciente paciente) {
        Connection connection = configuracaoJDBC.conectarComBancoDeDados();
        Statement statement = null;
        paciente.setEndereco(enderecoDao.salvar(paciente.getEndereco()));
        String query = String.format("INSERT INTO paciente(nome, sobrenome,rg,data_nascimento, endereco_id) VALUES('%S', '%S', '%S', '%S', '%S')", paciente.getNome(), paciente.getRg(), paciente.getDataNascimento(), paciente.getEndereco().getId());
        try{
            statement = connection.createStatement();
            statement.executeUpdate(query, Statement.RETURN_GENERATED_KEYS);
            ResultSet keys = statement.getGeneratedKeys();
            if(keys.next()){
                paciente.setId(keys.getInt(1));
                statement.close();
                connection.close();
            }
        }catch(SQLException e){
            e.printStackTrace();
        }
        return paciente;
    }

    @Override
    public List<Paciente> buscarTodos() {
        return null;
    }

    @Override
    public void deletar(int id) {

    }

    @Override
    public Paciente buscarPorId(int id) {
        return null;
    }

    @Override
    public Paciente atualizar(Paciente paciente) {
        return null;
    }
}
