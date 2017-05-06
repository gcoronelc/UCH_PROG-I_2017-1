package pe.concytecbecas.prueba;

import pe.concytecbecas.service.BecaService;

public class Prueba02 {

    public static void main(String[] args) {
        BecaService service = new BecaService();
        String[] productos = service.getProductos();
        for (String valor : productos) {
            System.out.println(valor);
        }
    }
}
