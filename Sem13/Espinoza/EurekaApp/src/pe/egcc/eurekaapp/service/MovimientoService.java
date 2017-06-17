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

public class MovimientoService {

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

}
