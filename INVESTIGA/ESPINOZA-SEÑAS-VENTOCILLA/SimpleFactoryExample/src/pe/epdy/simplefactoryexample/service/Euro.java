package pe.epdy.simplefactoryexample.service;

import pe.epdy.simplefactoryexample.model.CambioModel;

public class Euro implements CambioService {

    private static final float euros = 5;

    @Override
    public CambioModel getCambio(float soles) {
        CambioModel cm = new CambioModel();
        cm.setTipoCambio("Euros");
        cm.setSoles(soles);
        cm.setCambio(soles/euros);
        return cm;
    }

}
