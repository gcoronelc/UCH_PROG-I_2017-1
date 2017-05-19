package pe.epdy.simplefactoryexample.service;

import pe.epdy.simplefactoryexample.model.CambioModel;

public class Dolar implements CambioService {

    private static final float dolar=3;
    
    @Override
    public CambioModel getCambio(float soles) {
        CambioModel cm=new CambioModel();
        cm.setTipoCambio("Dolares");
        cm.setSoles(soles);
        cm.setCambio(soles/dolar);
        return cm;
    }
}






