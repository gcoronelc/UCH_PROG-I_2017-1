package pe.egcc.eurekaapp.prueba;

import pe.egcc.eurekaapp.model.Empleado;
import pe.egcc.eurekaapp.service.EmpleadoService;

public class Prueba06 {
  
  public static void main(String[] args) {
    
    EmpleadoService service = new EmpleadoService();
    
    try {
      
      Empleado emp = service.read("00001");
      
      if(emp == null){
        throw new Exception("No existe el codigo.");
      }
      
      System.out.println("Código: " + emp.getCodigo());
      System.out.println("Paterno: " + emp.getPaterno());
      System.out.println("Materno: " + emp.getMaterno());
      System.out.println("Nombres: " + emp.getNombre());
      
    } catch (Exception e) {
      
      System.err.println(e.getMessage());
      
    }
    
  }
  
}
