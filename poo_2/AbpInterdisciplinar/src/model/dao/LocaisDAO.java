package model.dao;

import connection.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import model.bean.Linhas;
import model.bean.Locais;
import model.bean.Paletes;

public class LocaisDAO {

    private Connection con = null;

    public LocaisDAO() {
        con = ConnectionFactory.getConnection();
    }

    public boolean save(Locais locais) {

        String sql = "INSERT INTO LOCAIS (ID_LOCAL,ID_LINHA,ORDEM_LOCAL,TIPO_LOCAL,DESCRICAO_LOCAL,HASH_LOCAL) VALUES (?,?,?,?,?,?)";

        PreparedStatement stmt = null;
        System.out.println(locais.getLinhas().getIdLinha());
        try {
            stmt = con.prepareStatement(sql);
            stmt.setInt(1, locais.getIdLocal());
            stmt.setInt(2, locais.getLinhas().getIdLinha());
            stmt.setInt(3, locais.getOrdemLocal());
            stmt.setString(4, locais.getTipoLocal());
            stmt.setString(5, locais.getDescricaoLocal());
            stmt.setString(6, locais.getHashLocal());

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

    public List<Locais> findAll() {

        String sql = "select lin.id_linha as ID_LINHA,\n"
                + "loc.id_local, loc.ordem_local, loc.tipo_local,\n"
                + "loc.descricao_local, loc.hash_local from linhas lin inner join locais loc on lin.id_linha = loc.id_linha order by loc.id_local";

        PreparedStatement stmt = null;
        ResultSet rs = null;

        List<Locais> arrayLocais = new ArrayList<>();
        try {
            stmt = con.prepareStatement(sql);
            rs = stmt.executeQuery();

            while (rs.next()) {
                Locais locais = new Locais();
                Linhas linhas = new Linhas();

                locais.setIdLocal(rs.getInt("ID_LOCAL"));
                linhas.setIdLinha(rs.getInt("ID_LINHA"));
                locais.setOrdemLocal(rs.getInt("ORDEM_LOCAL"));
                locais.setTipoLocal(rs.getString("TIPO_LOCAL"));
                locais.setDescricaoLocal(rs.getString("DESCRICAO_LOCAL"));
                locais.setHashLocal(rs.getString("HASH_LOCAL"));

                locais.setLinhas(linhas);

                arrayLocais.add(locais);
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        return arrayLocais;
    }

    public List<Locais> findPos() {

        String sql = "SELECT RESERVAS.ID_LOCAL AS ID_LOCAL_ATUAL, PALETES.ID_PALETE, PALETES.DESCRICAO_PALETE, PALETES.DH_VALIDADE_PALETE\n"
                + "FROM RESERVAS\n"
                + "JOIN PALETES ON PALETES.ID_PALETE = RESERVAS.ID_PALETE\n"
                + "WHERE RESERVAS.ID_RESERVA = 1\n"
                + "ORDER BY PALETES.DH_VALIDADE_PALETE ASC";

        String sql1 = "SELECT LOCAIS.ID_LOCAL AS ID_LOCAL_MUDANCA, LOCAIS.DESCRICAO_LOCAL, LOCAIS.HASH_LOCAL, RESERVAS.ID_PALETE\n"
                + "FROM LOCAIS\n"
                + "JOIN RESERVAS ON RESERVAS.ID_LOCAL = LOCAIS.ID_LOCAL AND RESERVAS.ID_RESERVA = 1\n"
                + "WHERE LOCAIS.TIPO_LOCAL = 'E'\n"
                + "ORDER BY LOCAIS.ID_LINHA, LOCAIS.ORDEM_LOCAL ASC";

        PreparedStatement stmt = null;
        ResultSet rs = null;

        List<Locais> arrayLocais = new ArrayList<>();
        try {
            stmt = con.prepareStatement(sql);
            rs = stmt.executeQuery();

            while (rs.next()) {
                Paletes paletes = new Paletes();
                Locais locais = new Locais();
                locais.setIdLocalAtual(rs.getInt("ID_LOCAL_ATUAL"));
                paletes.setIdPalete(rs.getInt("ID_PALETE"));

                locais.setPaletes(paletes);
                arrayLocais.add(locais);
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        return arrayLocais;
    }

    public List<Locais> findID(Locais locais) {

        String sql = "SELECT * FROM LOCAIS WHERE ID_LOCAL=?";

        PreparedStatement stmt = null;
        ResultSet rs = null;

        List<Locais> arrayLocais = new ArrayList<>();
        try {
            stmt = con.prepareStatement(sql);
            stmt.setInt(1, locais.getBuscarLocal());
            rs = stmt.executeQuery();

            while (rs.next()) {
                Locais locaisR = new Locais();
                Linhas linhas = new Linhas();

                locaisR.setIdLocal(rs.getInt("ID_LOCAL"));
                linhas.setIdLinha(rs.getInt("ID_LINHA"));
                locaisR.setOrdemLocal(rs.getInt("ORDEM_LOCAL"));
                locaisR.setTipoLocal(rs.getString("TIPO_LOCAL"));
                locaisR.setDescricaoLocal(rs.getString("DESCRICAO_LOCAL"));
                locaisR.setHashLocal(rs.getString("HASH_LOCAL"));

                locaisR.setLinhas(linhas);
                arrayLocais.add(locaisR);
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        return arrayLocais;
    }

    public boolean delete(Locais locais) {

        String sql = "DELETE FROM LOCAIS WHERE ID_LOCAL = ?";

        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement(sql);
            stmt.setInt(1, locais.getIdLocal());
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

    public boolean update(Locais locais) {

        String sql = "UPDATE LOCAIS SET ID_LINHA=?,ORDEM_LOCAL=?,TIPO_LOCAL=?,DESCRICAO_LOCAL=?,HASH_LOCAL=? WHERE ID_LOCAL = ?";

        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement(sql);
            stmt.setInt(1, locais.getLinhas().getIdLinha());
            stmt.setInt(2, locais.getOrdemLocal());
            stmt.setString(3, locais.getTipoLocal());
            stmt.setString(4, locais.getDescricaoLocal());
            stmt.setString(5, locais.getHashLocal());
            stmt.setInt(6, locais.getIdLocal());
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
