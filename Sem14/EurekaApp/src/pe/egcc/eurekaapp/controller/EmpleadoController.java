package pe.egcc.eurekaapp.controller;

import java.util.List;
import pe.egcc.eurekaapp.model.Empleado;
import pe.egcc.eurekaapp.service.EmpleadoService;

public class EmpleadoController {

  private EmpleadoService empleadoService;

  public EmpleadoController() {
    empleadoService = new EmpleadoService();
  }
  
  public List<Empleado> leer(String paterno, String materno, String nombre) {
    return empleadoService.read(paterno, materno, nombre);
  }
  
}
