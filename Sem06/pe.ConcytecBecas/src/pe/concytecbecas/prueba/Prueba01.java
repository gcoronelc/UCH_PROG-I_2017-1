package pe.concytecbecas.prueba;

import pe.concytecbecas.service.BecaService;

public class Prueba01 {

    public static void main(String[] args) {
        BecaService service = new BecaService();
        String[] categorias = service.getCategorias();
        for (String valor : categorias) {
            System.out.println(valor);
        }
    }
}
