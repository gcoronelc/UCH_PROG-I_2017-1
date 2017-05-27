package pe.egcc.appventa.prueba;

import pe.egcc.appventa.model.Item;
import pe.egcc.appventa.service.VentaFactory;

public class Prueba02 {

  public static void main(String[] args) {
    // Dato
    String tipo = VentaFactory.TIPO_BOLETA;
    double total= 2580.0;
    // Proceso
    Item[] repo = VentaFactory.get(tipo).procesarVenta(total);
    // Reporte
    for (Item r : repo) {
      System.out.println(r.getConcepto() + " -  " + r.getValor());
    }
  }
  
}
