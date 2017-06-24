package pe.egcc.eurekaapp.controller;

import pe.egcc.eurekaapp.model.Empleado;
import pe.egcc.eurekaapp.service.EmpleadoService;
import pe.egcc.eurekaapp.util.Session;

public class LogonController {

    public void validar(String usuario, String clave) {
    
        EmpleadoService service = new EmpleadoService();
        Empleado bean = service.validate(usuario, clave);
        
        if( bean == null){
            throw new RuntimeException("Datos incorrectos.");
        }
        
        Session.put("usuario", bean);
        
    }
    
}
