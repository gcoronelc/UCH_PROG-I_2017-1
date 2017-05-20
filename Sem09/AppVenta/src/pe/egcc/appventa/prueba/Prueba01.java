package pe.egcc.appventa.prueba;

import pe.egcc.appventa.model.Item;
import pe.egcc.appventa.service.BoletaService;
import pe.egcc.appventa.service.FacturaService;
import pe.egcc.appventa.service.VentaAbstract;

public class Prueba01 {

  public static void main(String[] args) {
    // Dato
    double total= 2580.0;
    // Proceso
    VentaAbstract venta = new BoletaService();
    Item[] repo = venta.procesarVenta(total);
    // Reporte
    for (Item r : repo) {
      System.out.println(r.getConcepto() + " -  " + r.getValor());
    }
  }
  
}
