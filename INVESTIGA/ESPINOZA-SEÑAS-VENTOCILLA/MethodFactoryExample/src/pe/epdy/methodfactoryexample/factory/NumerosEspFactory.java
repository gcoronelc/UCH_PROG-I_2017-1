package pe.epdy.methodfactoryexample.factory;

import pe.epdy.methodfactoryexample.model.NombresNumeros;

public class NumerosEspFactory implements NumerosFactoryMetodo{

    @Override
    public NombresNumeros create() {
        return new NumerosEsp();
    }
    
}
