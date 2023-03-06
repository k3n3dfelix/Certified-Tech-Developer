//Criar uma entidade chamada Dentista
//no banco de dados H2 que deverá ter os seguintes campos:
//Sobrenome
//Nome
//Matrícula
//Para isso, você deverá criar uma conexão com o banco
//de dados e inserir um registro na tabela Dentista, e depois
//atualizar a matrícula da linha inserida. Por último,
//verifique se a inserção e modificação foi realizada
//corretamente efetuando uma consulta.

import java.sql.*;


public class Main {
    public static void main(String[] args) throws SQLException {
        Dentista dentista = new Dentista("Kened ", "Felix");

        Connection connection = null;

        try {
            connection = getConnection();
            Statement statement = connection.createStatement();
            statement.execute(sqlCreateTable);

            PreparedStatement preparedStatementInsert = connection.prepareStatement(sqlInsert);

            preparedStatementInsert.setString(1, dentista.getNome());
            preparedStatementInsert.setString(2, dentista.getSobrenome());
            preparedStatementInsert.setLong(3, dentista.setMatriculaTest());

            preparedStatementInsert.execute();

            String sql = "SELECT * FROM DENTISTA";

            statement = connection.createStatement();
            ResultSet rs = statement.executeQuery(sql);

            while (rs.next()){
                System.out.println(rs.getString(1) + " " + rs.getString(2) + " " + rs.getInt(3) + " ");
            }

            connection.setAutoCommit(false);

            PreparedStatement preparedStatementUpdate = connection.prepareStatement(sqlUpdate);
            preparedStatementUpdate.setString(1, "Update");
            preparedStatementUpdate.setInt(2, 1);


            preparedStatementUpdate.execute();

            connection.commit();

            connection.setAutoCommit(true);

            statement = connection.createStatement();
            rs = statement.executeQuery(sql);

            while (rs.next()){
                System.out.println(rs.getString(1) + " " + rs.getString(2) + " " + rs.getInt(3) + " ");
            }

        } catch (Exception e) {
            e.printStackTrace();
            connection.rollback();
        }finally {
            connection.close();
        }
    }

    private static final String sqlCreateTable = """
            DROP TABLE IF EXISTS DENTISTA; CREATE TABLE DENTISTA
            (
            Nome VARCHAR(100) NOT NULL,
            Sobrenome VARCHAR(100) NOT NULL,
            Matricula INT PRIMARY KEY
            )
            """;

    private static final String sqlInsert = """
            INSERT INTO DENTISTA
            ( Nome, Sobrenome, Matricula) 
            VALUES(?, ?, ?)
            """;

    private static final String sqlUpdate = """
            UPDATE DENTISTA
            SET Sobrenome=?
            WHERE Matricula=?
            """;

    private static Connection getConnection() throws Exception {
        Class.forName("org.h2.Driver").newInstance();
        return DriverManager.getConnection("jdbc:h2:~/test", "sa", "");
    }
}

