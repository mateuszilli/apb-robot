package model.dao;

import model.bean.Reservas;
import model.bean.Locais;
import model.bean.Paletes;
import connection.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class ReservasDAO {

    private Connection con = null;

    public ReservasDAO() {

        con = ConnectionFactory.getConnection();
    }

    public boolean save(Reservas reservas) {

        String sql = "INSERT INTO reservas (id_reserva,id_local,id_palete) VALUES (?,?,?)";

        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement(sql);
            stmt.setInt(1, reservas.getIdReserva());
            stmt.setInt(2, reservas.getLocais().getIdLocal());
            stmt.setInt(3, reservas.getPaletes().getIdPalete());
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

    public List<Reservas> findAll() {

//        String sql = "select lin.id_linha as ID_LINHA,\n"
//                + "lin.ordem_linha, lin.sentido_linha, lin.descricao_linha, loc.id_local, loc.ordem_local, loc.tipo_local,\n"
//                + "loc.descricao_local, loc.hash_local from linhas lin inner join locais loc on lin.id_linha = loc.id_linha";
        String sql = "SELECT * FROM RESERVAS";

        PreparedStatement stmt = null;
        ResultSet rs = null;

        List<Reservas> arrayReservas = new ArrayList<>();
        try {
            stmt = con.prepareStatement(sql);
            rs = stmt.executeQuery();

            while (rs.next()) {
                Reservas reservas = new Reservas();
                Locais locais = new Locais();
                Paletes paletes = new Paletes();

                reservas.setIdReserva(rs.getInt("ID_RESERVA"));
                locais.setIdLocal(rs.getInt("ID_LOCAL"));
                paletes.setIdPalete(rs.getInt("ID_PALETE"));

                reservas.setLocais(locais);
                reservas.setPaletes(paletes);

                arrayReservas.add(reservas);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        return arrayReservas;
    }

    public List<Reservas> findID(Reservas reservas) {

//        String sql = "select lin.id_linha as ID_LINHA,\n"
//                + "lin.ordem_linha, lin.sentido_linha, lin.descricao_linha, loc.id_local, loc.ordem_local, loc.tipo_local,\n"
//                + "loc.descricao_local, loc.hash_local from linhas lin inner join locais loc on lin.id_linha = loc.id_linha";
        String sql = "SELECT * FROM RESERVAS WHERE ID_RESERVA = ?";

        PreparedStatement stmt = null;
        ResultSet rs = null;

        List<Reservas> arrayReservas = new ArrayList<>();
        try {
            stmt = con.prepareStatement(sql);
            stmt.setInt(1, reservas.getBuscarReserva());
            rs = stmt.executeQuery();

            while (rs.next()) {
                Reservas reservasR = new Reservas();
                Locais locais = new Locais();
                Paletes paletes = new Paletes();

                reservasR.setIdReserva(rs.getInt("ID_RESERVA"));
                locais.setIdLocal(rs.getInt("ID_LOCAL"));
                paletes.setIdPalete(rs.getInt("ID_PALETE"));

                reservasR.setLocais(locais);
                reservasR.setPaletes(paletes);

                arrayReservas.add(reservasR);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        return arrayReservas;
    }

        public boolean update(Reservas reservas) {

        String sql = "UPDATE RESERVAS SET ID_LOCAL=?,ID_PALETE=? WHERE ID_RESERVA=?";

        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement(sql);
            stmt.setInt(1, reservas.getLocais().getIdLocal());
            stmt.setInt(2, reservas.getPaletes().getIdPalete());
            stmt.setInt(3, reservas.getIdReserva());
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
    
    public boolean delete(Reservas reservas) {

        String sql = "DELETE FROM RESERVAS WHERE ID_RESERVA = ?";

        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement(sql);
            stmt.setInt(1, reservas.getIdReserva());
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
