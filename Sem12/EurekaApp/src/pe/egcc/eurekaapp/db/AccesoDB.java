package pe.egcc.eurekaapp.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public final class AccesoDB {

    private AccesoDB() {
    }

    public static Connection getConnection() throws SQLException{
        Connection cn = null;

        // Parametros
        String driver = "com.mysql.jdbc.Driver";
        String url = "jdbc:mysql://localhost:3306/eurekabank";
        String user = "eureka";
        String pass = "admin";
        try {
            // Paso 1
            Class.forName(driver).newInstance();
            // Crear Conexion
            cn = DriverManager.getConnection(url, user, pass);
        } catch (ClassNotFoundException e) {
            throw new SQLException("No se ha encontrado el driver.");
        } catch (SQLException e) {
            throw e;
        } catch (Exception e) {
            throw new SQLException("No se puede establecer la conexión con la BD.");
        }
        return cn;
    }

}
