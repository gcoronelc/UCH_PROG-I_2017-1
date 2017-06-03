package aprendiendojdbc.prueba;

import java.sql.Connection;
import java.sql.DriverManager;

public class Prueba01 {


  public static void main(String[] args) {
    
    // Parametros
    String driver = "com.mysql.jdbc.Driver";
    String url = "jdbc:mysql://localhost:3306/eurekabank";
    String user = "eureka";
    String pass = "admin";
    
    try {
      // Paso 1
      Class.forName(driver).newInstance();
      // Crear Conexion
      Connection cn = DriverManager.getConnection(url, user, pass);
      System.out.println("Conexión ok");
      cn.close();
    } catch (Exception e) {
      System.err.println(e.getMessage());
    }
    
  }
  

  
}
