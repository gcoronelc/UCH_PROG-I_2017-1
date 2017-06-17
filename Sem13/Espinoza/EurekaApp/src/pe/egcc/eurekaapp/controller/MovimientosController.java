package pe.egcc.eurekaapp.controller;

import java.util.List;
import java.util.Map;
import pe.egcc.eurekaapp.service.MovimientoService;

public class MovimientosController {
    
    private MovimientoService service;

    public MovimientosController() {
        service = new MovimientoService();
    }

    public List<Map<String, Object>> getMoveCuenta(String codigo) {
        return service.getMovimientosCuenta(codigo);
    }

    public List<Map<String, Object>> getMoveEmpleado(String codigo) {
        return service.getMovimientosEmpleado(codigo);
    }
    
    
}
