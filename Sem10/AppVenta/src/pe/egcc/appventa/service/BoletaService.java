package pe.egcc.appventa.service;

import pe.egcc.appventa.model.Item;

public class BoletaService extends VentaAbstract{

  @Override
  public Item[] procesarVenta(double total) {
    // Variables
    double servicio, totalGeneral;
    // validar
    validaTotal(total);
    // Proceso
    servicio = total * 0.10;
    totalGeneral = total + servicio;
    // Reporte
    Item[] repo = {
      new Item("Total", total),
      new Item("Servicio", servicio),
      new Item("Total General", totalGeneral)
    };
    return repo;
  }
  
}
