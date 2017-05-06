package pe.concytecbecas.controller;

import pe.concytecbecas.model.BecaModel;
import pe.concytecbecas.service.BecaService;

public class BecaController {

  private final BecaService service;

  public BecaController() {
    service = new BecaService();
  }

  public double getImporte(String categoria, String producto) {
    return service.getImporte(categoria, producto);
  }

  public String[] getCategorias() {
    return service.getCategorias();
  }

  public String[] getProductos() {
      return service.getProductos();
  }

  public BecaModel procesarBeca(BecaModel model) {
    return service.procesarPrestamo(model);
  }

}
