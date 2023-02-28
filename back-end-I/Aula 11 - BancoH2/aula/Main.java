import java.sql.*;
import java.sql.DriverManager;

public class Main {
    public static void main(String[] args) throws SQLException {

        Connection connection = null;

        try{
            connection = getConnection();

            Statement statement = connection.createStatement();
            statement.execute(sqlCreateTable);
            statement.execute(sqlInsert1);
            statement.execute(sqlInsert2);
            statement.execute(sqlInsert3);
            statement.execute(sqlInsert4);
            statement.execute(sqlInsert5);

            mostrarFiguraVermelho(connection);
            System.out.println("---------------------------------");
            mostrarFiguras(connection);


        }catch(Exception e){
            e.printStackTrace();
        }

        if(connection == null) {
            return;
        }
        connection.close();

    }

    private static void mostrarFiguraVermelho(Connection connection) throws SQLException {
        String sqlConsulta = "SELECT * FROM Figura WHERE Cor = 'Vermelho'";

        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(sqlConsulta);

        while(resultSet.next()){
            System.out.println(resultSet.getInt(1) + " - " + resultSet.getString(2) + " - " + resultSet.getString(3));
        }

    }

    private static void mostrarFiguras(Connection connection) throws SQLException {
        String sqlConsulta = "SELECT * FROM Figura";

        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(sqlConsulta);

        while(resultSet.next()){
            System.out.println(resultSet.getInt(1) + " - " + resultSet.getString(2) + " - " + resultSet.getString(3));
        }

    }

    private static final String sqlCreateTable = "DROP TABLE IF EXISTS Figura; CREATE TABLE Figura"
            + "("
            + "Id INT PRIMARY KEY,"
            + "Nome VARCHAR(100) NOT NULL,"
            + "Cor VARCHAR(100) NOT NULL"
            + ")";

    private static final String sqlInsert1 = "INSERT INTO Figura (Id, Nome, Cor) VALUES (1, 'Circulo', 'Vermelho')";
    private static final String sqlInsert2 = "INSERT INTO Figura (Id, Nome, Cor) VALUES (2, 'Circulo', 'Verde')";
    private static final String sqlInsert3 = "INSERT INTO Figura (Id, Nome, Cor) VALUES (3, 'Quadrado', 'Vermelho')";
    private static final String sqlInsert4 = "INSERT INTO Figura (Id, Nome, Cor) VALUES (4, 'Quadrado', 'Azul')";
    private static final String sqlInsert5 = "INSERT INTO Figura (Id, Nome, Cor) VALUES (5, 'Quadrado', 'Roxo')";



    public static Connection getConnection() throws Exception{
        Class.forName("org.h2.Driver").newInstance();
        return DriverManager.getConnection("jdbc:h2:~/test", "sa", "");
    }
}