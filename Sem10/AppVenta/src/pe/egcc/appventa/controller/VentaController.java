package pe.egcc.appventa.controller;

import pe.egcc.appventa.model.Item;
import pe.egcc.appventa.service.VentaFactory;

public class VentaController {

  public String[] getTipos() {
    return VentaFactory.getTipos();
  }

  public Item[] procesarVenta(String tipo, double total) {
    return VentaFactory.get(tipo).procesarVenta(total);
  }
  
}
