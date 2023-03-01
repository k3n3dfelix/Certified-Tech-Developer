import org.apache.log4j.Logger;
import org.h2.Driver;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {

    private static final String sqlCreateTable = "DROP TABLE IF EXISTS Usuario; CREATE TABLE Usuario"
            + "("
            + "Id INT PRIMARY KEY,"
            + "Nome VARCHAR(100) NOT NULL,"
            + "Sobrenome VARCHAR(100) NOT NULL,"
            + "Idade INT NOT NULL"
            + ")";

    private static final String sqlInsert1 = "INSERT INTO Usuario (Id, Nome, Sobrenome, Idade) VALUES (1, 'Everton', 'Alves', 25)";
    private static final String sqlInsert2 = "INSERT INTO Usuario (Id, Nome, Sobrenome, Idade) VALUES (2, 'Ueber', 'James', 23)";
    private static final String sqlInsert3 = "INSERT INTO Usuario (Id, Nome, Sobrenome, Idade) VALUES (3, 'Pablo', 'Haleson', 26)";
    private static final String sqlDelete = "DELETE FROM Usuario WHERE Id=1";

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

            statement.execute(sqlDelete);

            logger.info("Excluindo o usuario de id 1");

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