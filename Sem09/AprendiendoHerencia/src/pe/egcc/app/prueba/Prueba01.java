package pe.egcc.app.prueba;

import pe.egcc.app.service.Clase3;

public class Prueba01 {

  public static void main(String[] args) {
    
    Clase3 service = new Clase3();
    
    System.out.println("9 + 7 = " + service.sumar(9, 7));
    System.out.println("9 * 7 = " + service.multiplica(9, 7));
  }
  
}
