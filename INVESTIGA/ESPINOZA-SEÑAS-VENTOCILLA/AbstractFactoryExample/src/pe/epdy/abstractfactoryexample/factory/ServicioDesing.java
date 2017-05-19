package pe.epdy.abstractfactoryexample.factory;

public class ServicioDesing implements ServicioInformatico{

    @Override
    public String asignarTrabajo() {
        return "Ha sido asignado a los empleados de Diseño";
    }

    @Override
    public String indicarFechaEntrega() {
        return "La fecha de entrega es 22/06/2017";
    }

    @Override
    public String informarSobrePago() {
        return "El pago es S/.560.50";
    }
    
}
