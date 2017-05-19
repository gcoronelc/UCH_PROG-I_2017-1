package pe.epdy.methodfactoryexample.factory;

import pe.epdy.methodfactoryexample.model.NombresNumeros;

public class NumerosEsp extends NombresNumeros {

    private final String numberEsp[]={"CERO","UNO","DOS","TRES","CUATRO","CINCO"};
    
    @Override
    public String[] getNumeros() {
        return numberEsp;
    }

    @Override
    public String getNombreNumeros(int p) {
        return numberEsp[p];
    }

}
