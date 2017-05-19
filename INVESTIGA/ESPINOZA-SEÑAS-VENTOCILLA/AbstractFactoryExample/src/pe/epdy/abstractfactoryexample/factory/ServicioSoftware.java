package pe.epdy.abstractfactoryexample.factory;

public class ServicioSoftware implements ServicioInformatico{

    @Override
    public String asignarTrabajo() {
        return "Ha sido asignado a los empleados de Software";
    }

    @Override
    public String indicarFechaEntrega() {
        return "La fecha de entrega es 12/08/2017";
    }

    @Override
    public String informarSobrePago() {
        return "El pago es S/.205.50";
    }
    
}
