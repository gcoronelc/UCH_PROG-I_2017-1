package pe.egcc.eurekaapp.prueba;

import java.util.List;
import java.util.Map;
import pe.egcc.eurekaapp.service.CuentaService;

public class Prueba03 {

    public static void main(String[] args) {
        try {
            CuentaService service = new CuentaService();
            List<Map<String, Object>> lista = service.getCuentasSucursal("001");

            for (Map<String, Object> row : lista) {
                System.out.println("Cuenta Codigo\t: "+row.get("chr_cuencodigo"));
                System.out.println("Codigo moneda\t; "+row.get("chr_monecodigo"));
                System.out.println("Codigo sucursal\t: "+row.get("chr_sucucodigo"));
                System.out.println("Empl. crea\t: "+row.get("chr_emplcreacuenta"));
                System.out.println("Codigo cliente\t: "+row.get("chr_cliecodigo"));
                System.out.println("Saldo\t\t: "+row.get("dec_cuensaldo"));
                System.out.println("Fecha creacion\t: "+row.get("dtt_cuenfechacreacion"));
                System.out.println("Estado\t\t: "+row.get("vch_cuenestado"));
                System.out.println("Movimiento\t: "+row.get("int_cuencontmov"));
                System.out.println("Cuenta clave\t: "+row.get("chr_cuenclave"));
                System.out.println("");
            }

        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }

}
