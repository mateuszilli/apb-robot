package model.dao;

import model.bean.Paletes;
import connection.ConnectionFactory;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import model.bean.Linhas;
import view.PaletesView;

public class PaletesDAO {

    private Connection con = null;

    public PaletesDAO() {

        con = ConnectionFactory.getConnection();

    }

    public boolean save(Paletes paletes) {

        String sql = "INSERT INTO paletes (id_palete,descricao_palete,dh_validade_palete) VALUES (?,?,to_date(?,'dd-mm-yyyy'))";

        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement(sql);
            stmt.setInt(1, paletes.getIdPalete());
            stmt.setString(2, paletes.getDescricaoPalete());
            stmt.setString(3, paletes.getValidadePalete());
            stmt.executeUpdate();
            con.commit();
            return true;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
            return false;
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }
    }

    public List<Paletes> findAll() {

        String sql = "SELECT ID_PALETE, DESCRICAO_PALETE, to_char(dh_validade_palete,'dd-mm-yyyy') as DH_VALIDADE_PALETE FROM PALETES order by id_palete";

        PreparedStatement stmt = null;
        ResultSet rs = null;

        List<Paletes> arrayPaletes = new ArrayList<>();
        try {
            stmt = con.prepareStatement(sql);
            rs = stmt.executeQuery();

            while (rs.next()) {
                Paletes paletes = new Paletes();

                paletes.setIdPalete(rs.getInt("ID_PALETE"));
                paletes.setDescricaoPalete(rs.getString("DESCRICAO_PALETE"));
                paletes.setValidadePalete(rs.getString("DH_VALIDADE_PALETE"));
                arrayPaletes.add(paletes);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        return arrayPaletes;
    }

    public List<Paletes> findID(Paletes paletes) {

        String sql = "SELECT id_palete, descricao_palete, to_char(dh_validade_palete,'dd-mm-yyyy') as "
                + "DH_VALIDADE_PALETE FROM PALETES where ID_PALETE=?";

        PreparedStatement stmt = null;
        ResultSet rs = null;

        List<Paletes> arrayPaletes = new ArrayList<>();
        try {
            stmt = con.prepareStatement(sql);
            stmt.setInt(1, paletes.getBuscarPalete());
            rs = stmt.executeQuery();

            while (rs.next()) {
                Paletes paletesR = new Paletes();

                paletesR.setIdPalete(rs.getInt("ID_PALETE"));
                paletesR.setDescricaoPalete(rs.getString("DESCRICAO_PALETE"));
                paletesR.setValidadePalete(rs.getString("DH_VALIDADE_PALETE"));
                arrayPaletes.add(paletesR);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        return arrayPaletes;
    }

    public boolean update(Paletes paletes) {
        
        String sql = "UPDATE paletes SET descricao_palete=?,dh_validade_palete=(to_date(?,'dd-mm-yyyy')) WHERE id_palete = ?";

        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement(sql);
            stmt.setString(1, paletes.getDescricaoPalete());
            stmt.setString(2, paletes.getValidadePalete());
            stmt.setInt(3, paletes.getIdPalete());
            stmt.executeUpdate();
            con.commit();
            return true;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
            return false;
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }
    }

    public boolean delete(Paletes paletes) {

        String sql = "DELETE FROM paletes WHERE id_palete = ?";

        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement(sql);
            stmt.setInt(1, paletes.getIdPalete());
            stmt.executeUpdate();
            con.commit();
            return true;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
            return false;
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }

    }
}
