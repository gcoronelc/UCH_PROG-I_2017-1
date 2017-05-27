package pe.egcc.appventa.controller;

import pe.egcc.appventa.service.VentaFactory;

public class VentaController {

  public String[] getTipos() {
    return VentaFactory.getTipos();
  }
  
}
