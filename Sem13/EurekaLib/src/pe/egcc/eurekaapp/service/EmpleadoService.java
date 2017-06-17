package pe.egcc.eurekaapp.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import pe.egcc.eurekaapp.db.AccesoDB;
import pe.egcc.eurekaapp.model.Empleado;
import pe.egcc.eurekaapp.service.spec.RowMapper;

public class EmpleadoService implements RowMapper<Empleado> {

  private final String SQL_SELECT = "select "
          + "chr_emplcodigo, "
          + "vch_emplpaterno, "
          + "vch_emplmaterno, "
          + "vch_emplnombre, "
          + "vch_emplciudad, "
          + "vch_empldireccion "
          + "from empleado ";

  public Empleado read(String codigo) {
    Empleado bean = null;
    Connection cn = null;
    try {
      cn = AccesoDB.getConnection();
      String sql = SQL_SELECT + " where chr_emplcodigo = ?";
      PreparedStatement pstm = cn.prepareStatement(sql);
      pstm.setString(1, codigo);
      ResultSet rs = pstm.executeQuery();
      if(rs.next()){
        bean = mapRow(rs);
      }
      rs.close();
      pstm.close();
    } catch (SQLException e) {
      throw new RuntimeException(e.getMessage());
    } catch (Exception e) {
      throw new RuntimeException("No se puede ejecutar la consulta");
    } finally {
      try {
        cn.close();
      } catch (Exception e) {
      }
    }
    return bean;
  }

  public List<Empleado> read(String paterno, String materno, String nombre) {
    List<Empleado> lista = new ArrayList<>();
    Connection cn = null;
    try {
      cn = AccesoDB.getConnection();
      String sql = SQL_SELECT 
              + " where vch_emplpaterno like concat('%',?,'%') "
              + " and vch_emplmaterno like concat('%',?,'%') "
              + " and vch_emplnombre like concat('%',?,'%') ";
      PreparedStatement pstm = cn.prepareStatement(sql);
      pstm.setString(1, paterno);
      pstm.setString(2, materno);
      pstm.setString(3, nombre);
      ResultSet rs = pstm.executeQuery();
      while(rs.next()){
        Empleado bean = mapRow(rs);
        lista.add(bean);
      }
      rs.close();
      pstm.close();
    } catch (SQLException e) {
      throw new RuntimeException(e.getMessage());
    } catch (Exception e) {
      throw new RuntimeException("No se puede ejecutar la consulta");
    } finally {
      try {
        cn.close();
      } catch (Exception e) {
      }
    }    
    return lista;
  }

  public void create(Empleado bean) {

  }

  public void update(Empleado bean) {

  }

  public void delete(String codigo) {

  }

  @Override
  public Empleado mapRow(ResultSet rs) throws SQLException {
    Empleado bean = new Empleado();
    bean.setCodigo(rs.getString("chr_emplcodigo"));
    bean.setPaterno(rs.getString("vch_emplpaterno"));
    bean.setMaterno(rs.getString("vch_emplmaterno"));
    bean.setNombre(rs.getString("vch_emplnombre"));
    bean.setCiudad(rs.getString("vch_emplciudad"));
    bean.setDireccion(rs.getString("vch_empldireccion"));
    return bean;
  }

}
