package pe.egcc.appventa.service;

import pe.egcc.appventa.model.Item;

public abstract class VentaAbstract {
  
  public  abstract Item[] procesarVenta(double total);
   
  public void validaTotal(double total){
    if(total <= 0){
      throw new RuntimeException("El importe total debe ser positivo.");
    }
  }
}
