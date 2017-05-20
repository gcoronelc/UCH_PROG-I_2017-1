package pe.egcc.app.prueba;

import pe.egcc.app.service.AbstractMate;

public class Prueba03 {

  public static void main(String[] args) {
    
    // Clase anónima
    
    AbstractMate obj = new AbstractMate() {
      @Override
      public int sumar(int n1, int n2) {
        return n1 + n2;
      }
    };
    
    System.out.println("7 + 8 = " + obj.sumar(7, 8));
    
  }
  
}
