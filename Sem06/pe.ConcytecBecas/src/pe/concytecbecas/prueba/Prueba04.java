package pe.concytecbecas.prueba;

import pe.concytecbecas.model.BecaModel;
import pe.concytecbecas.service.BecaService;

public class Prueba04 {

    public static void main(String[] args) {
        BecaService service = new BecaService();
        //datos
        BecaModel model = new BecaModel();
        model.setCategoria(service.getCategorias()[1]);
        model.setProducto(service.getProductos()[2]);
        model.setMeses(12);
        //proceso
        model=service.procesarPrestamo(model);         
        //reporte
        System.out.println("categoria: " + model.getCategoria());
        System.out.println("producto: " + model.getProducto());
        System.out.println("importe: " + model.getImporte());
        System.out.println("meses: " + model.getMeses());
        System.out.println("porcentaje: " + model.getPorcentaje());
        System.out.println("valor cuota: " + model.getCuota());
       
    }
}
