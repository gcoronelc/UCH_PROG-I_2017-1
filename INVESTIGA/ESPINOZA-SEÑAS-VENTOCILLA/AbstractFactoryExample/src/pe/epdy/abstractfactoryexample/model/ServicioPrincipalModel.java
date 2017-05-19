package pe.epdy.abstractfactoryexample.model;

import pe.epdy.abstractfactoryexample.factory.ServicioInformatico;

public class ServicioPrincipalModel {
    
    String categoria;
    ServicioInformatico servicio;

    public ServicioPrincipalModel() {
        
    }
    
    public ServicioPrincipalModel(String categoria, ServicioInformatico servicio) {
        this.categoria = categoria;
        this.servicio = servicio;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public ServicioInformatico getServicio() {
        return servicio;
    }

    public void setServicio(ServicioInformatico servicio) {
        this.servicio = servicio;
    }
    
    
}
