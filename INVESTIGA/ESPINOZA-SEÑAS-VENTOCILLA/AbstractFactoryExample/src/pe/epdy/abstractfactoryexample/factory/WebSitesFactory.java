package pe.epdy.abstractfactoryexample.factory;

public class WebSitesFactory implements ServicioFactory{

    @Override
    public ServicioInformatico crearServicio() {
        return new ServicioWebSites();
    }
    
}
