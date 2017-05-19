package pe.epdy.abstractfactoryexample.factory;

public class ServicioWebSites implements ServicioInformatico{

    @Override
    public String asignarTrabajo() {
        return "Ha sido asignado a los empleados de Paginas Web";
    }

    @Override
    public String indicarFechaEntrega() {
        return "La fecha de entrega es 30/12/2017";
    }

    @Override
    public String informarSobrePago() {
        return "El pago es S/.980.50";
    }
    
}
