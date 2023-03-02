import java.sql.*;

public class Main {

    private static final String sqlCreateTable = "DROP TABLE IF EXISTS CONTA; CREATE TABLE CONTA"
            +"("
            + "Id INT PRIMARY KEY,"
            + "Nome VARCHAR(100) NOT NULL,"
            + "Conta VARCHAR(100) NOT NULL,"
            + "Saldo NUMERIC (15, 2) NOT NULL"
            + ")";

    private static final String sqlInsert = "INSERT INTO CONTA (Id, Nome, Conta, Saldo) VALUES (?, ?, ?, ?)";
    private static final String sqlUpdate = "UPDATE CONTA SET Saldo=? WHERE Conta=?";


    public static void main(String[] args) throws Exception{

        Conta conta = new Conta("Adriano", "123456", 10d);

        Connection connection = null;

        try {
            connection = getConnection();
            Statement statement = connection.createStatement();
            statement.execute(sqlCreateTable);

            PreparedStatement psInsert = connection.prepareStatement(sqlInsert);
            psInsert.setInt(1,1);
            psInsert.setString(2,conta.getNome());
            psInsert.setString(3,conta.getConta());
            psInsert.setDouble(4,conta.getSaldo());

            psInsert.execute();

            String sql = "SELECT * FROM CONTA";


            statement = connection.createStatement();
            ResultSet rs = statement.executeQuery(sql);

            while (rs.next()){
                System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getString(3) + " " + rs.getDouble(4)
                );
            }

            connection.setAutoCommit(false);

            PreparedStatement psUpdate = connection.prepareStatement(sqlUpdate);
            psUpdate.setDouble(1,conta.depositar(15));
            psUpdate.setString(2,conta.getConta());

            psUpdate.execute();
            connection.commit();

            connection.setAutoCommit(true);

            statement = connection.createStatement();
            rs = statement.executeQuery(sql);

            while (rs.next()){
                System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getString(3) + " " + rs.getDouble(4)
                );
            }

        }catch (Exception e){
            e.printStackTrace();
            connection.rollback();
        } finally {
            connection.close();
        }

    }

    private static Connection getConnection() throws Exception{
        Class.forName("org.h2.Driver").newInstance();
        return DriverManager.getConnection("jdbc:h2:~/test", "sa", "");
    }
}