package pe.egcc.eurekaapp.prueba;

import java.util.Map;
import pe.egcc.eurekaapp.service.ClienteService;

public class Prueba02 {

    public static void main(String[] args) {
        try {
            ClienteService service = new ClienteService();
            Map<String,Object> row = service.getCliente("00001");
            
            System.out.println("Codigo\t\t: " + row.get("codigo"));
            System.out.println("Paterno\t\t: " + row.get("vch_cliepaterno"));
            System.out.println("Materno\t\t: " + row.get("vch_cliematerno"));
            System.out.println("Nombre\t\t: " + row.get("vch_clienombre"));
            System.out.println("DNI\t\t: " + row.get("vch_cliedni"));
            System.out.println("Ciudad\t\t: " + row.get("vch_clieciudad"));
            System.out.println("Direccion\t: " + row.get("vch_cliedireccion"));
            System.out.println("Telefono\t: " + row.get("vch_clietelefono"));
            System.out.println("Email\t\t: " + row.get("vch_clieemail"));
            
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
    
}
