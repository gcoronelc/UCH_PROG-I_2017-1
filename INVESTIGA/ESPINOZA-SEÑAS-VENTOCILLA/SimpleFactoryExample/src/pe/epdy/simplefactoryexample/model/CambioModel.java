package pe.epdy.simplefactoryexample.model;

public class CambioModel {

  //INPUT
  private String tipoCambio;
  private float soles;

  //OUTPUT
  private float cambio;

  public CambioModel() {
  }

  public CambioModel(String tipoCambio, float soles) {
    this.tipoCambio = tipoCambio;
    this.soles = soles;
  }

  public String getTipoCambio() {
    return tipoCambio;
  }

  public void setTipoCambio(String tipoCambio) {
    this.tipoCambio = tipoCambio;
  }

  public float getSoles() {
    return soles;
  }

  public void setSoles(float soles) {
    this.soles = soles;
  }

  public float getCambio() {
    return cambio;
  }

  public void setCambio(float cambio) {
    this.cambio = cambio;
  }

}
