package pe.epdy.methodfactoryexample.prueba;

import pe.epdy.methodfactoryexample.factory.NumerosIngFactory;
import pe.epdy.methodfactoryexample.model.ElijeIdiomaNumero;

public class Prueba {

    public static void main(String[] args) {
        ElijeIdiomaNumero h=new ElijeIdiomaNumero();
        h.setIdioma("Ingles");
        h.setnNum(new NumerosIngFactory().create());
        System.out.println(h.getnNum().getNombreNumeros(3));
    }
}
