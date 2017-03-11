package pe.egcc.ejemplo03.model;

public class Producto {

  private String serie;
  private String marca;
  private int tamanio;
  private double precioDolares;
  private double precioSoles;

  public Producto() {
  }

  public String getSerie() {
    return serie;
  }

  public void setSerie(String serie) {
    this.serie = serie;
  }

  public String getMarca() {
    return marca;
  }

  public void setMarca(String marca) {
    this.marca = marca;
  }

  public int getTamanio() {
    return tamanio;
  }

  public void setTamanio(int tamanio) {
    this.tamanio = tamanio;
  }

  public double getPrecioDolares() {
    return precioDolares;
  }

  public void setPrecioDolares(double precioDolares) {
    this.precioDolares = precioDolares;
  }

  public double getPrecioSoles() {
    return precioSoles;
  }

  public void setPrecioSoles(double precioSoles) {
    this.precioSoles = precioSoles;
  }
  
  
  
}
