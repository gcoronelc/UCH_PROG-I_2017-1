package pe.egcc.eurekaapp.controller;

import java.util.List;
import java.util.Map;
import pe.egcc.eurekaapp.service.CuentaService;

public class CuentaController {

    private CuentaService service;

    public CuentaController() {
        service = new CuentaService();
    }
    
    public List<Map<String, Object>> getCuentasSucursal(String codigo) {
        return service.getCuentasSucursal(codigo);
    }
    
}
