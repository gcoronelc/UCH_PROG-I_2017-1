package pe.epdy.methodfactoryexample.factory;

import pe.epdy.methodfactoryexample.model.NombresNumeros;

public class NumerosIngFactory implements NumerosFactoryMetodo{

    @Override
    public NombresNumeros create() {
        return new NumerosIng();
    }
    
}
