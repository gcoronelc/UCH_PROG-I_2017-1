package pe.egcc.pagoapp.model;

public class PagoModel {

  // Input
  private int horasDia;
  private int dias;
  private double pagoHora;
  // Output
  private double ingreso;
  private double renta;
  private double neto;

  /**
   * Constructor por defecto.
   */
  public PagoModel() {
  }

  /**
   * Constructor adicional
   *
   * @param horasDia Horas trabajadas por día.
   * @param dias Dias trabajados en el mes.
   * @param pagoHora Pago por hora.
   */
  public PagoModel(int horasDia, int dias, double pagoHora) {
    this.horasDia = horasDia;
    this.dias = dias;
    this.pagoHora = pagoHora;
  }

  public int getHorasDia() {
    return horasDia;
  }

  public void setHorasDia(int horasDia) {
    this.horasDia = horasDia;
  }

  public int getDias() {
    return dias;
  }

  public void setDias(int dias) {
    this.dias = dias;
  }

  public double getPagoHora() {
    return pagoHora;
  }

  public void setPagoHora(double pagoHora) {
    this.pagoHora = pagoHora;
  }

  public double getIngreso() {
    return ingreso;
  }

  public void setIngreso(double ingreso) {
    this.ingreso = ingreso;
  }

  public double getRenta() {
    return renta;
  }

  public void setRenta(double renta) {
    this.renta = renta;
  }

  public double getNeto() {
    return neto;
  }

  public void setNeto(double neto) {
    this.neto = neto;
  }

}
