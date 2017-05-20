package pe.egcc.app.service;

public class Clase1 {

  public Clase1() {
    System.out.println("Hola Gustavo.");
  }
  
  public Clase1(String nombre) {
    System.out.println("Hola " + nombre + ".");
  }

  /**
   * Método que permite sumar dos números.
   *
   * @param n1 Número 1.
   * @param n2 Múmero 2.
   * @return Retorna la suma de los dos números.
   */
  public int sumar(int n1, int n2) {
    return (n1 + n2);
  }

}
