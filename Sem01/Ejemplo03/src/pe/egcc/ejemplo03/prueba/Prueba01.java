package pe.egcc.ejemplo03.prueba;

import pe.egcc.ejemplo03.service.CambioService;

public class Prueba01 {

  public static void main(String[] args) {
    
    // Variables
    double dolares, soles;
    
    // Dato
    dolares = 5680.0;
    
    // Proceso
    CambioService service = new CambioService();
    soles = service.dolaresToSoles(dolares);
    
    // Reporte
    System.out.println("Dolares: " + dolares);
    System.out.println("Soles: " + soles);
    
  }
}
