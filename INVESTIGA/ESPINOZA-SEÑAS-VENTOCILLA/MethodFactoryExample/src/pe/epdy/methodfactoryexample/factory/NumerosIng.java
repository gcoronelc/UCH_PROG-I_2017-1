package pe.epdy.methodfactoryexample.factory;

import pe.epdy.methodfactoryexample.model.NombresNumeros;

public class NumerosIng extends NombresNumeros{
    
    private final String numberIng[]={"ZERO","ONE","TWO","THREE","FOUR","FIVE"};
    
    @Override
    public String[] getNumeros() {
        return numberIng;
    }

    @Override
    public String getNombreNumeros(int p) {
        return numberIng[p];
    }
}
