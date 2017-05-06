package pe.concytecbecas.prueba;

import pe.concytecbecas.service.BecaService;

public class Prueba03 {

    public static void main(String[] args) {
        BecaService service = new BecaService();
        //datos
        String categoria = service.getCategorias()[0];
        String producto = service.getProductos()[2];
        //proceso
        double importe = service.getImporte(categoria, producto);
        //reporte
        System.out.println("categoria: " + categoria);
        System.out.println("producto: " + producto);
        System.out.println("importe: " + importe);
    }
}
