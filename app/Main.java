import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Main {

    public static void main(String[] args) {
        Connection connection = null;
        //MenuInicio formulario = new MenuInicio();

        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost/prueba", "previotto", "38449500");

            Statement statement = connection.createStatement();
            //statement.executeUpdate("INSERT INTO usuario VALUES ('0', 'Bruno', '38449500')");
            ResultSet resultSet = statement.executeQuery("SELECT * FROM usuario");
            while (resultSet.next()) {
                System.out.println(resultSet.getObject("nombreUsuario"));
            }
        } catch (Exception e) {
            e.printStackTrace();

        }
    }
}
