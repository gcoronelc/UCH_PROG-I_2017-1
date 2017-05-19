package pe.epdy.abstractfactoryexample.prueba;

import pe.epdy.abstractfactoryexample.factory.DesingFactory;
import pe.epdy.abstractfactoryexample.factory.ServicioInformatico;
import pe.epdy.abstractfactoryexample.factory.SoftwareFactory;

public class Prueba {

    public static void main(String[] args) {
        
        ServicioInformatico servicio= new SoftwareFactory().crearServicio(); 
        System.out.println(servicio.asignarTrabajo());
        System.out.println(servicio.indicarFechaEntrega());
        System.out.println(servicio.informarSobrePago());
    }
    
}
