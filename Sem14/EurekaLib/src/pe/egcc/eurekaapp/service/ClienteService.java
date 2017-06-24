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
                    + "chr_cliecodigo, "
                    + "vch_cliepaterno, "
                    + "vch_cliematerno, "
                    + "vch_clienombre, "
                    + "chr_cliedni, "
                    + "vch_clieciudad, "
                    + "vch_cliedireccion, "
                    + "vch_clietelefono, "
                    + "vch_clieemail "
                    + "from cliente "
                    + "where chr_cliecodigo = ?";
            PreparedStatement pstm = cn.prepareStatement(sql);
            pstm.setString(1, codigo);
            ResultSet rs = pstm.executeQuery();
            if(rs.next()){
                row = new HashMap<>();
                row.put("codigo", codigo);
                row.put("vch_cliepaterno", rs.getString("vch_cliepaterno"));
                row.put("vch_cliematerno", rs.getString("vch_cliematerno"));
                row.put("vch_clienombre", rs.getString("vch_clienombre"));
                row.put("chr_cliedni", rs.getString("chr_cliedni"));
                row.put("vch_clieciudad", rs.getString("vch_clieciudad"));
                row.put("vch_cliedireccion", rs.getString("vch_cliedireccion"));
                row.put("vch_clietelefono", rs.getString("vch_clietelefono"));
                row.put("vch_clieemail", rs.getString("vch_clieemail"));
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
