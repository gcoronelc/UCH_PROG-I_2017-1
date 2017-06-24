package pe.egcc.eurekaapp.prueba;

import java.util.List;
import pe.egcc.eurekaapp.model.Empleado;
import pe.egcc.eurekaapp.service.EmpleadoService;

public class Prueba08 {

    public static void main(String[] args) {

        // Datos
        String usuario = "lcastro";
        String clave = "flacas";

        EmpleadoService service = new EmpleadoService();

        try {

            Empleado bean = service.validate(usuario, clave);

            if (bean == null) {
                throw new RuntimeException("Datos incorrectos.");
            }

            System.out.println(bean.getCodigo()
                    + " - " + bean.getPaterno()
                    + " - " + bean.getMaterno()
                    + " - " + bean.getNombre());

        } catch (Exception e) {

            System.err.println(e.getMessage());

        }

    }

}
