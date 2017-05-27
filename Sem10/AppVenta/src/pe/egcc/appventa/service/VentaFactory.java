package pe.egcc.appventa.service;

public final class VentaFactory {

  private VentaFactory() {
  }

  public static final String TIPO_FACTURA = "Factura";
  public static final String TIPO_BOLETA = "Boleta";
  
  public static final String[] getTipos(){
    String[] tipos = {TIPO_FACTURA, TIPO_BOLETA};
    return tipos;
  }
  
  public static final VentaAbstract get(String tipo){
    VentaAbstract bean = null;
    switch(tipo){
      case TIPO_FACTURA:
        bean = new FacturaService();
        break;
      case TIPO_BOLETA:
        bean = new BoletaService();
        break;
    }
    return bean;
  }
  
}
