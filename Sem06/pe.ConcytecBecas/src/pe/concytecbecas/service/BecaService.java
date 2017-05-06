package pe.concytecbecas.service;
import pe.concytecbecas.model.BecaModel;
import pe.concytecbecas.util.MateUtil;

public class BecaService {

    //CATEGORIA
    private final String CATE_ESTUDIOS = "ESTUDIOS";
    private final String CATE_TESIS = "TESIS";
    
    //PRODUCTOS
    private final String PRO_PREGRADO = "PREGRADO";
    private final String PRO_MAESTRIA = "MAESTRIA";
    private final String PRO_DOCTORADO = "DOCTORADO";

    public String[] getCategorias() {
        String[] categorias = {CATE_ESTUDIOS, CATE_TESIS};
        return categorias;
    }

    public String[] getProductos() {
        String[] productos = {PRO_PREGRADO, PRO_MAESTRIA, PRO_DOCTORADO};
        return productos;
    }
    public double getImporte(String categoria, String producto) {
        double importe = 0.0;
        // ---------------------------------------------------------  
        switch (categoria) {
            case CATE_ESTUDIOS:
                switch (producto) {
                    case PRO_PREGRADO:
                        importe = 10000.0;
                        break;
                    case PRO_MAESTRIA:
                        importe = 15000.0;
                        break;
                    case PRO_DOCTORADO:
                        importe = 25000.0;
                        break;
                }
                break;
            case CATE_TESIS:
                switch (producto) {
                    case PRO_PREGRADO:
                        importe = 5000.0;
                        break;
                    case PRO_MAESTRIA:
                        importe = 8000.0;
                        break;
                    case PRO_DOCTORADO:
                        importe = 12000.0;
                        break;
                }
                break;
        }
        // ---------------------------------------------------------    
        return importe;
    }

    public BecaModel procesarPrestamo(BecaModel model) {
        //VARIABLES
        double porcentaje, importe, cuota, factor = 0;
        //PROCESO
        importe = getImporte(model.getCategoria(), model.getProducto());
        switch (model.getMeses()) {
            case 6:
                factor = 0.07;
                break;
            case 12:
                factor = 0.12;
                break;
            case 18:
                factor = 0.17;
                break;
        }
        porcentaje = factor * 100;
        cuota = importe * (1 + factor) / model.getMeses();
        //REPORTE
        model.setPorcentaje(porcentaje);
        model.setFactor(factor);
        model.setCuota(MateUtil.roundTo2Dec(cuota));
        model.setImporte(importe);
        return model;
    }

}
