package pe.egcc.appventa.service;

import pe.egcc.appventa.model.Item;

public abstract class VentaAbstract {
  
  public  abstract Item[] procesarVenta(double total);
  
}
