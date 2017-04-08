package pe.egcc.ventaapp.service.impl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import pe.egcc.ventaapp.model.VentaModel;
import pe.egcc.ventaapp.service.spec.VentaServiceSpec;

public class VentaService implements VentaServiceSpec{

  @Override
  public List<String> getCategorias() {
    String[] categorias = {
        Data.LAPTOPS,    
        Data.CELULARES,
        Data.TABLE,
        Data.TELEVISORES,
        Data.IMPRESORAS,
        Data.ACCESORIOS};
    List<String> lista = Arrays.asList(categorias);
    return lista;
  }

  @Override
  public VentaModel calcVenta(VentaModel venta) {
      
  }

  @Override
  public void regVenta(VentaModel venta) {
    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
  }

  @Override
  public List<VentaModel> calcVenta(String categoria) {
    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
  }
  
}
