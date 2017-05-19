package pe.epdy.abstractfactoryexample.factory;

public class SoftwareFactory implements ServicioFactory{

    @Override
    public ServicioInformatico crearServicio() {
        return new ServicioSoftware();
    }
    
}
