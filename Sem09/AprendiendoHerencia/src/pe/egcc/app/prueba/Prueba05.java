package pe.egcc.app.prueba;

import pe.egcc.app.service.AbstractMate;
import pe.egcc.app.service.MateCaso1;
import pe.egcc.app.service.MateCaso2;

public class Prueba05 {

  public static void main(String[] args) {
    
    AbstractMate bean = new MateCaso2();
    
    System.out.println("9 + 6 = " + bean.sumar(9, 6));
    
  }
  
}
