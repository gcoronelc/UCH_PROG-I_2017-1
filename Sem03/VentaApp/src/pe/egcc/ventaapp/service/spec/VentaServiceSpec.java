package pe.egcc.ventaapp.service.spec;

import java.util.List;
import pe.egcc.ventaapp.model.VentaModel;

public interface VentaServiceSpec {
  
  public List<String> getCategorias();

  public VentaModel calcVenta(VentaModel venta);
  
  public void regVenta(VentaModel venta);
  
  public List<VentaModel> calcVenta(String categoria);
  
}
