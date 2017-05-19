package pe.epdy.simplefactoryexample.service;

import pe.epdy.simplefactoryexample.model.CambioModel;

public class Pesos implements CambioService {

    private static final float pesos = 2;

    @Override
    public CambioModel getCambio(float soles) {
        CambioModel cm = new CambioModel();
        cm.setTipoCambio("Pesos");
        cm.setSoles(soles);
        cm.setCambio(soles / pesos);
        return cm;
    }

}
