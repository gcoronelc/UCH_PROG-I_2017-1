package pe.epdy.abstractfactoryexample.factory;

public class DesingFactory implements ServicioFactory{

    @Override
    public ServicioInformatico crearServicio() {
        return new ServicioDesing();
    }
    
}
