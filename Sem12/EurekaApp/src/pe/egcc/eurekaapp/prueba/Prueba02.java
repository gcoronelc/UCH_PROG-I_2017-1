package pe.egcc.eurekaapp.prueba;

import java.util.Map;
import pe.egcc.eurekaapp.service.ClienteService;

public class Prueba02 {

    public static void main(String[] args) {
        try {
            ClienteService service = new ClienteService();
            Map<String,Object> row = service.getCliente("00001");
            
            System.out.println("Codigo: " + row.get("codigo"));
            System.out.println("Paterno: " + row.get("paterno"));
            System.out.println("Materno: " + row.get("materno"));
            
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
    
}
