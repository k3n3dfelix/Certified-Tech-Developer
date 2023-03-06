package com.dao.materias.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConfiguracaoJDBC {

    private String jdbcDriver;
    private String dbUrl;
    private String nomeUsuario;
    private String senha;

    public ConfiguracaoJDBC() {
        this.jdbcDriver = "org.h2.driver";
        this.dbUrl = "jdbc:h2:~/materias;DB_CLOSE_DELAY=-1;INIT=RUNSCRIPT FROM 'create.sql'";
        this.nomeUsuario = "sa";
        this.senha = "";
    }

    public Connection conectarComBancoDeDados() {
        Connection connection = null;

        try {
            connection = DriverManager.getConnection(dbUrl, nomeUsuario,senha);
        }catch (SQLException e){
            e.printStackTrace();
        }finally {
            return connection;
        }
    }
}
