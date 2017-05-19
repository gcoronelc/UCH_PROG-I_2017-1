package pe.epdy.simplefactoryexample.prueba;

import pe.epdy.simplefactoryexample.model.CambioModel;
import pe.epdy.simplefactoryexample.service.CambioFactory;

public class Prueba {

    public static void main(String[] args) {
        CambioModel cm = CambioFactory.getCambio(36, "Dolar");
        System.out.println("Usted a cambiado soles a " +cm.getTipoCambio());
        System.out.println("Valor en soles : "+cm.getSoles());
        System.out.println("Usted tiene "+cm.getCambio()+" "+cm.getTipoCambio());
    }
    
}









