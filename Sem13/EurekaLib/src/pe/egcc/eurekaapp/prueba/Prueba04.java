package pe.egcc.eurekaapp.prueba;

import java.util.List;
import java.util.Map;
import pe.egcc.eurekaapp.service.CuentaService;

public class Prueba04 {

    public static void main(String[] args) {
        try {
            CuentaService service = new CuentaService();
            List<Map<String, Object>> lista = service.getMovimientosCuenta("00100001");

            for (Map<String, Object> row : lista) {
                System.out.println("Cuenta Codigo\t: "+row.get("codigo"));
                System.out.println("Movimiento\t; "+row.get("movnro"));
                System.out.println("Fecha\t\t: "+row.get("fecha"));
                System.out.println("Codigo Empleado\t: "+row.get("empleado"));
                System.out.println("Tipo codigo\t: "+row.get("tipo"));
                System.out.println("Importe\t\t: "+row.get("importe"));
                System.out.println("Referencia\t: "+row.get("referencia"));
                System.out.println("");
            }

        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
    
}
