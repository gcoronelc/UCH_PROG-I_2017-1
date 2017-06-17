
package pe.egcc.eurekaapp.controller;

import java.util.Map;
import pe.egcc.eurekaapp.service.ClienteService;


public class ClienteController {
    
    private ClienteService service;

    public ClienteController() {
        service = new ClienteService();
    }
    
    public Map<String, Object> getcliente(String codigo) {
        return service.getCliente(codigo);
    }
    
}
