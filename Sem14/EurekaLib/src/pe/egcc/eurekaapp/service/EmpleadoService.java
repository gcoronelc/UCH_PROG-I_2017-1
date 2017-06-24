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

  private String SQL_UPDATE = "update empleado "
          + "set vch_emplpaterno=?,vch_emplmaterno=?,"
          + "vch_emplnombre=?,vch_emplciudad=?,"
          + "vch_empldireccion=? "
          + "where chr_emplcodigo=? ";

  public Empleado read(String codigo) {
    Empleado bean = null;
    Connection cn = null;
    try {
      cn = AccesoDB.getConnection();
      String sql = SQL_SELECT + " where chr_emplcodigo = ?";
      PreparedStatement pstm = cn.prepareStatement(sql);
      pstm.setString(1, codigo);
      ResultSet rs = pstm.executeQuery();
      if (rs.next()) {
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
      while (rs.next()) {
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
    Connection cn = null;
    try {
      
      // Acceso al objeto Connection
      cn = AccesoDB.getConnection();
      
      // Inicia Tx
      cn.setAutoCommit(false);
      
      // Proceso
      PreparedStatement pstm = cn.prepareStatement(SQL_UPDATE);
      pstm.setString(1, bean.getPaterno());
      pstm.setString(2, bean.getMaterno());
      pstm.setString(3, bean.getNombre());
      pstm.setString(4, bean.getCiudad());
      pstm.setString(5, bean.getDireccion());
      pstm.setString(6, bean.getCodigo());
      int filas = pstm.executeUpdate();
      System.err.println("Filas: " + filas);
      pstm.close();
      if (filas != 1) {
        throw new Exception("Datos no son correctos.");
      }
      
      // Confirmar Tx
      cn.commit();
      
    } catch (Exception e) {
      try {
        // Cancela Tx
        cn.rollback();
      } catch (Exception e1) {
      }
      String mensaje = "Error en el Proceso, intentelo mas tarde.";
      if (e.getMessage() != null && !e.getMessage().isEmpty()) {
        mensaje += " " + e.getMessage();
      }
      throw new RuntimeException(mensaje);
    } finally {
      try {
        cn.close();
      } catch (Exception e) {
      }
    }
  }

  public void delete(String codigo) {

  }

  public Empleado validate(String usuario, String clave) {
    Empleado bean = null;
    Connection cn = null;
    try {
      cn = AccesoDB.getConnection();
      String sql = SQL_SELECT
              + "where vch_emplusuario = ? "
              + "and vch_emplclave = ? ";
      PreparedStatement pstm = cn.prepareStatement(sql);
      pstm.setString(1, usuario);
      pstm.setString(2, clave);
      ResultSet rs = pstm.executeQuery();
      if (rs.next()) {
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
