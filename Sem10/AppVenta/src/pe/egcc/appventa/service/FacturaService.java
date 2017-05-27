package pe.egcc.appventa.service;

import pe.egcc.appventa.model.Item;

public class FacturaService extends VentaAbstract{

  @Override
  public Item[] procesarVenta(double total) {
    // Variables
    double importe, impuesto, servicio, totalGeneral;
    // Proceso
    importe = total / 1.18;
    impuesto = total - importe;
    servicio = total * 0.10;
    totalGeneral = total + servicio;
    // Reporte
    Item[] repo = {
      new Item("Importe", importe),
      new Item("Impuesto", impuesto),
      new Item("Total", total),
      new Item("Servicio", servicio),
      new Item("Total General", totalGeneral)
    };
    return repo;
  }
  
}
