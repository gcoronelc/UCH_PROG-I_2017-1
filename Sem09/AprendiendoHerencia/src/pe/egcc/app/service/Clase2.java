package pe.egcc.app.service;

public class Clase2 extends Clase1 {

  public Clase2() {
    super("Claudia");
  }

  @Override
  public int sumar(int n1, int n2) {
    int suma = (n1 + n2) * (n1 - n2);
    return suma;
  }

  public int multiplica(int n1, int n2){
    return (n1 * n2);
  }
  
}
