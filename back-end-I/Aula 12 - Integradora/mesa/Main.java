package mesa;

import org.apache.log4j.Logger;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {

    private static final String sqlCreateTable = "DROP TABLE IF EXISTS Funcionarios; CREATE TABLE Funcionarios"
            + "("
            + "Id INT PRIMARY KEY,"
            + "Nome VARCHAR(100) NOT NULL,"
            + "Sobrenome VARCHAR(100) ,"
            + "Idade INT ,"
            + "Genero VARCHAR(100) "
            + ")";

    private static final String sqlInsert1 = "INSERT INTO Funcionarios (Id, Nome, Sobrenome, Idade, Genero) VALUES (1, 'Everton', 'Alves', 25, 'Masculino')";
    private static final String sqlInsert2 = "INSERT INTO Funcionarios (Id, Nome, Sobrenome, Idade, Genero) VALUES (2, 'Ueber', 'James', 23, 'Masculino')";
    private static final String sqlInsert3 = "INSERT INTO Funcionarios (Id, Nome, Sobrenome, Idade, Genero) VALUES (3, 'Pablo', 'Haleson', 26, 'Masculino')";
    private static final String sqlInsert4 = "INSERT INTO Funcionarios (Id, Nome, Sobrenome, Idade, Genero) VALUES (3, 'Pablo', 'Haleson', 26, 'Masculino')";
    private static final String sqlDelete = "DELETE FROM Funcionarios WHERE Id=1";
    private static final String sqlDelete2 = "DELETE FROM Funcionarios WHERE Nome='Pablo'";

    private static final String sqlUpdate= "Update Funcionarios SET Nome = 'Roberto' WHERE Id = 2";
    private static final Logger logger = Logger.getLogger(Main.class);

    public static void main(String[] args) {

        Connection connection = null;

        try {

            connection = getConnection();

            Statement statement = connection.createStatement();

            statement.execute(sqlCreateTable);

            statement.execute(sqlInsert1);
            statement.execute(sqlInsert2);
            statement.execute(sqlInsert3);
           // statement.execute(sqlInsert4);

            statement.execute(sqlDelete);

            logger.info("Excluindo o usuario de id 1");

            statement.execute(sqlUpdate);

            statement.execute(sqlDelete2);

            logger.info("Excluindo o usuario de nome Pablo");


            connection.close();


        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static Connection getConnection() throws ClassNotFoundException, SQLException, InstantiationException, IllegalAccessException {
        Class.forName("org.h2.Driver").newInstance();
        return DriverManager.getConnection("jdbc:h2:~/test", "sa", "");
    }
}
