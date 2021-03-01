package BaseDeDatos;

import java.sql.*;

public class OperarSobreBaseDeDatos {
    Connection connection = null;
    Statement statement = null;
    ResultSet resultSet = null;
    PreparedStatement preparedStatement = null;

    public void buscarUsuario(String nombreUsuario, String contraseña){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost/prueba", "previotto", "38449500");
            statement = connection.createStatement();
            resultSet = statement.executeQuery("SELECT * FROM usuario WHERE nommbreUsuario LIKE '" + nombreUsuario +
                    "' AND contraseña LIKE '" + contraseña + "'");
            if(resultSet.getObject("nombreUsuario") == nombreUsuario){
                System.out.println("Existe");
            }
            connection.close();
        }catch(Exception e){

        }
    }

    public void crearUsuario(String nombreUsuario, String contraseña){
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost/prueba", "previotto", "38449500");
            preparedStatement = connection.prepareStatement("INSERT INTO usuario VALUES(null,?,?)");
            preparedStatement.setString(1,nombreUsuario);
            preparedStatement.setString(2, contraseña);
            preparedStatement.executeUpdate();
            connection.close();
        }catch (Exception e){

        }
    }


    /*
    try{


    Statement statement = connection.createStatement();
    //statement.executeUpdate("INSERT INTO usuario VALUES ('0', 'Bruno', '38449500')");
    ResultSet resultSet = statement.executeQuery("SELECT * FROM usuario");
    while (resultSet.next())
    {
        System.out.println(resultSet.getObject("nombreUsuario"));
    }
    }catch (Exception e){
    e.printStackTrace();
    }*/

}
