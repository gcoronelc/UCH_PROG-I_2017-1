package pe.epdy.simplefactoryexample.service;

import pe.epdy.simplefactoryexample.model.CambioModel;

public class CambioFactory {
    
    public static CambioModel getCambio(float soles, String tipo) {
        CambioModel model = null;
        if(tipo.equals("Dolar")) {
            model = new Dolar().getCambio(soles);
        }
        if(tipo.equals("Euro")) {
            model = new Euro().getCambio(soles);
        }
        if(tipo.equals("Peso")) {
            model = new Pesos().getCambio(soles);
        }
        return model;
    }
}


