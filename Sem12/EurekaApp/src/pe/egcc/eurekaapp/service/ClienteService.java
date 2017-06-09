package pe.egcc.eurekaapp.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;
import pe.egcc.eurekaapp.db.AccesoDB;

public class ClienteService {

    public Map<String, Object> getCliente(String codigo) {
        Map<String, Object> row = null;
        Connection cn = null;
        try {
            cn = AccesoDB.getConnection();
            String sql = "select "
                    + "chr_cliecodigo      codigo, "
                    + "vch_cliepaterno     paterno, "
                    + "vch_cliematerno     materno, "
                    + "vch_clienombre      nombre, "
                    + "chr_cliedni         dni, "
                    + "vch_clieciudad      ciudad, "
                    + "vch_cliedireccion   direccion, "
                    + "vch_clietelefono    telefono, "
                    + "vch_clieemail       email "
                    + "from cliente "
                    + "where chr_cliecodigo = ?";
            PreparedStatement pstm = cn.prepareStatement(sql);
            pstm.setString(1, codigo);
            ResultSet rs = pstm.executeQuery();
            if(rs.next()){
                row = new HashMap<>();
                row.put("codigo", codigo);
                row.put("paterno", rs.getString("paterno"));
                row.put("materno", rs.getString("materno"));
                row.put("nombre", rs.getString("nombre"));
                row.put("dni", rs.getString("dni"));
                row.put("ciudad", rs.getString("ciudad"));
                row.put("direccion", rs.getString("direccion"));
                row.put("email", rs.getString("email"));
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
        return row;
    }

}
