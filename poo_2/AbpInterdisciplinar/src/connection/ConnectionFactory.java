package connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class ConnectionFactory {

    private static final String SERVER = "localhost";
    private static final String PORT = "1521";
    private static final String DATABASE = "xe";
    private static final String USER = "abp";
    private static final String PASSWORD = "abp";
    private static final String URL = "jdbc:oracle:thin:@" + SERVER + ":" + PORT + ":" + DATABASE;
    
    public static Connection getConnection(){
        try {
            return DriverManager.getConnection(URL,USER,PASSWORD);
        } catch (SQLException ex) {
            throw new RuntimeException("Erro na conexão", ex);
        }
    }
    
    public static void closeConnection(Connection con){
        if(con!=null){
            try {
                con.close();
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, ex);
            }
        }
    }
    public static void closeConnection(Connection con,PreparedStatement stmt){
        if(stmt!=null){
            try {
                stmt.close();
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, ex);
            }
        }
        closeConnection(con);
    }
    public static void closeConnection(Connection con,PreparedStatement stmt,ResultSet rs){
        if(rs!=null){
            try {
                rs.close();
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, ex);
            }
        }
        closeConnection(con,stmt);
    }
    
//    Connection con = null;
//    String comandoSql = null;
//
//    public void conectar() {
//
//        try {
//            con = DriverManager.getConnection(URL, USER, PASSWORD);
//            System.out.println("Conectado!");
//
//            try {
//                String sql = comandoSql;
//
//                PreparedStatement stm = con.prepareStatement(sql);
//                ResultSet rs = stm.executeQuery();
//                while (rs.next()) {
//                    System.out.println(rs.getString("FIRST_NAME"));
//                }
//                rs.close();
//                stm.close();
//                con.close();
//
//            } catch (Exception e) {
//                JOptionPane.showMessageDialog(null, "Erro ao buscar resultado no banco");
//            }
//
//        } catch (SQLException ex) {
//            Logger.getLogger(Conexao.class.getName()).log(Level.SEVERE, null, ex);
//        }
//    }
//
//    public void desconectar() {
//        try {
//            con.close();
//            System.out.println("Desconectado!");
//        } catch (SQLException ex) {
//            Logger.getLogger(Conexao.class.getName()).log(Level.SEVERE, null, ex);
//        }
//    }
//
//    public void main(String[] args) {
//
//    }

}
