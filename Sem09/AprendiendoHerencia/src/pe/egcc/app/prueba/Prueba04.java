package pe.egcc.app.prueba;

import pe.egcc.app.service.Clase1;
import pe.egcc.app.service.Clase2;
import pe.egcc.app.service.Clase3;
import pe.egcc.app.service.Clase4;

public class Prueba04 {

  public static void main(String[] args) {
    Clase2 a1 = new Clase2();
    
    System.out.println("Compatible con:");
    System.out.println("Object: " + ((a1 instanceof Object)?"SI":"NO"));
    System.out.println("Clase1: " + ((a1 instanceof Clase1)?"SI":"NO"));
    System.out.println("Clase2: " + ((a1 instanceof Clase2)?"SI":"NO"));
    System.out.println("Clase3: " + ((a1 instanceof Clase3)?"SI":"NO"));
    System.out.println("Clase4: " + ((a1 instanceof Clase4)?"SI":"NO"));
  }
  
}
