package model.dao;

import java.sql.Connection;
import connection.ConnectionFactory;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import model.bean.Linhas;

public class LinhasDAO {

    private Connection con = null;

    public LinhasDAO() {
        con = ConnectionFactory.getConnection();
    }

    public boolean save(Linhas linhas) {

        String sql = "INSERT INTO linhas (id_linha,ordem_linha,sentido_linha,descricao_linha) VALUES (?,?,?,?)";

        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement(sql);
            stmt.setInt(1, linhas.getIdLinha());
            stmt.setInt(2, linhas.getOrdemLinha());
            stmt.setString(3, linhas.getSentidoLinha());
            stmt.setString(4, linhas.getDescricaoLinha());
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

    public List<Linhas> findAll() {

        String sql = "SELECT * FROM LINHAS";

        PreparedStatement stmt = null;
        ResultSet rs = null;

        List<Linhas> arrayLinhas = new ArrayList<>();
        try {
            stmt = con.prepareStatement(sql);
            rs = stmt.executeQuery();

            while (rs.next()) {
                Linhas linhas = new Linhas();

                linhas.setIdLinha(rs.getInt("ID_LINHA"));
                linhas.setOrdemLinha(rs.getInt("ORDEM_LINHA"));
                linhas.setSentidoLinha(rs.getString("SENTIDO_LINHA"));
                linhas.setDescricaoLinha(rs.getString("DESCRICAO_LINHA"));
                arrayLinhas.add(linhas);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        return arrayLinhas;
    }

    public List<Linhas> findID(Linhas linhas) {

        String sql = "SELECT * FROM LINHAS WHERE ID_LINHA=?";

        PreparedStatement stmt = null;
        ResultSet rs = null;

        List<Linhas> arrayLinhas = new ArrayList<>();
        try {
            stmt = con.prepareStatement(sql);
            stmt.setInt(1, linhas.getBuscarLinha());
            rs = stmt.executeQuery();

            while (rs.next()) {
                Linhas linhasR = new Linhas();

                linhasR.setIdLinha(rs.getInt("ID_LINHA"));
                linhasR.setOrdemLinha(rs.getInt("ORDEM_LINHA"));
                linhasR.setSentidoLinha(rs.getString("SENTIDO_LINHA"));
                linhasR.setDescricaoLinha(rs.getString("DESCRICAO_LINHA"));
                arrayLinhas.add(linhasR);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        return arrayLinhas;
    }

    public boolean update(Linhas linhas) {

        String sql = "UPDATE LINHAS SET ORDEM_LINHA=?,SENTIDO_LINHA=?,DESCRICAO_LINHA = ? WHERE ID_LINHA = ?";

        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement(sql);
            stmt.setInt(1, linhas.getOrdemLinha());
            stmt.setString(2, linhas.getSentidoLinha());
            stmt.setString(3, linhas.getDescricaoLinha());
            stmt.setInt(4, linhas.getIdLinha());
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

    public boolean delete(Linhas linhas) {

        String sql = "DELETE FROM linhas WHERE id_linha = ?";

        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement(sql);
            stmt.setInt(1, linhas.getIdLinha());
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
