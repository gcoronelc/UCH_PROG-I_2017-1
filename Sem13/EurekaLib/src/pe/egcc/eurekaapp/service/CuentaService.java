package pe.egcc.eurekaapp.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import pe.egcc.eurekaapp.db.AccesoDB;

public class CuentaService {

    private final String SELECT_01 = "select "
            + "chr_cuencodigo codigo, "
            + "int_movinumero movnro, "
            + "dtt_movifecha  fecha, "
            + "chr_emplcodigo empleado, "
            + "chr_tipocodigo tipo, "
            + "dec_moviimporte importe, "
            + "chr_cuenreferencia referencia "
            + "from movimiento ";
    
    private final String SELECT_01_CUENTA = SELECT_01 + " where chr_cuencodigo = ?";
    
    private final String SELECT_01_EMPLEADO = SELECT_01 + " where chr_emplcodigo = ?";

    public List<Map<String, Object>> getMovimientosCuenta(String codigo) {
        return getMovimientos("cuenta", codigo);
    }

    public List<Map<String, Object>> getMovimientosEmpleado(String codigo) {
        return getMovimientos("empleado", codigo);
    }

    private List<Map<String, Object>> getMovimientos(String busca, String codigo) {
        List<Map<String, Object>> lista = new ArrayList<>();
        Connection cn = null;
        try {
            cn = AccesoDB.getConnection();
            String sql = "";
            switch (busca) {
                case "cuenta":
                    sql = SELECT_01_CUENTA;
                    break;
                case "empleado":
                    sql = SELECT_01_EMPLEADO;
                    break;
            }

            PreparedStatement pstm = cn.prepareStatement(sql);
            pstm.setString(1, codigo);
            ResultSet rs = pstm.executeQuery();
            while (rs.next()) {
                Map<String, Object> row = new HashMap<>();
                row.put("codigo", rs.getString("codigo"));
                row.put("movnro", rs.getInt("movnro"));
                row.put("fecha", rs.getDate("fecha"));
                row.put("empleado", rs.getString("empleado"));
                row.put("tipo", rs.getString("tipo"));
                row.put("importe", rs.getDouble("importe"));
                row.put("referencia", rs.getString("referencia"));
                lista.add(row);
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

    public List<Map<String, Object>> getCuentasSucursal(String codigo) {
        List<Map<String, Object>> lista = new ArrayList<>();
        Connection cn = null;
        try {
            cn = AccesoDB.getConnection();
            String sql = "select "
                    + "chr_cuencodigo, "
                    + "chr_monecodigo, "
                    + "chr_sucucodigo, "
                    + "chr_emplcreacuenta, "
                    + "chr_cliecodigo, "
                    + "dec_cuensaldo, "
                    + "dtt_cuenfechacreacion, "
                    + "vch_cuenestado, "
                    + "int_cuencontmov, "
                    + "chr_cuenclave "
                    + "from cuenta "
                    + "where chr_sucucodigo = ?";
            PreparedStatement pstm = cn.prepareStatement(sql);
            pstm.setString(1, codigo);
            ResultSet rs = pstm.executeQuery();
            while (rs.next()) {
                Map<String, Object> row = new HashMap<>();
                row.put("chr_cuencodigo", rs.getString("chr_cuencodigo"));
                row.put("chr_monecodigo", rs.getString("chr_monecodigo"));
                row.put("chr_sucucodigo", rs.getString("chr_sucucodigo"));
                row.put("chr_emplcreacuenta", rs.getString("chr_emplcreacuenta"));
                row.put("chr_cliecodigo", rs.getString("chr_cliecodigo"));
                row.put("dec_cuensaldo", rs.getDouble("dec_cuensaldo"));
                row.put("dtt_cuenfechacreacion", rs.getString("dtt_cuenfechacreacion"));
                row.put("vch_cuenestado", rs.getString("vch_cuenestado"));
                row.put("int_cuencontmov", rs.getInt("int_cuencontmov"));
                row.put("chr_cuenclave", rs.getString("chr_cuenclave"));
                lista.add(row);
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

}
