package pe.egcc.eurekaapp.prueba;

import java.util.List;
import pe.egcc.eurekaapp.model.Empleado;
import pe.egcc.eurekaapp.service.EmpleadoService;

public class Prueba07 {
  
  public static void main(String[] args) {
    
    EmpleadoService service = new EmpleadoService();
    
    try {
      
      List<Empleado> lista = service.read("CO","","");
       
      for (Empleado emp : lista) {
        System.out.println(emp.getCodigo() 
                + " - " + emp.getPaterno()
                + " - " + emp.getMaterno()
                + " - " + emp.getNombre());
      }
      
      
    } catch (Exception e) {
      
      System.err.println(e.getMessage());
      
    }
    
  }
  
}
