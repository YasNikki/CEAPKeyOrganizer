
package model;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import view.*;

public class database_funcoes_DAO {
    
    static String url = "jdbc:mysql://localhost/ceap_chaves";
    static String username = "root";
    static String password = "";
    
    static String nome_professor;
    static String nome_chave;
    static String nome_item;
    
    // CADASTRAR NO BANCO DE DADOS (1)
    
    public static void cadastraProf(){
        
        nome_professor = Bd_CEAP_GUI.profTXT.getText();
        
        controller.Conexao_DB.carregaDriver();

        Connection con = null;
        
        try{
            con = (Connection) DriverManager.getConnection(url, username, password);
        } catch (SQLException ex) {
            Logger.getLogger(database_funcoes_DAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        String SQL = "insert into professores(nome_prof) values('"+nome_professor+"')";
        
        try{
            PreparedStatement insert = (PreparedStatement) con.prepareStatement(SQL);
            insert.execute();
            
            Bd_CEAP_GUI.profTXT.setText("");
            
        }catch (Exception ex) {
            Logger.getLogger(database_funcoes_DAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static void cadastraChave(){
        
        nome_chave = Bd_CEAP_GUI.chaveTXT.getText();
        
        controller.Conexao_DB.carregaDriver();

        Connection con = null;
        
        try{
            con = (Connection) DriverManager.getConnection(url, username, password);
        } catch (SQLException ex) {
            Logger.getLogger(database_funcoes_DAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        String SQL = "insert into chaves(nome_chave) values('"+nome_chave+"')";
        
        try{
            PreparedStatement insert = (PreparedStatement) con.prepareStatement(SQL);
            insert.execute();
            
            Bd_CEAP_GUI.chaveTXT.setText("");
            
        }catch (Exception ex) {
            Logger.getLogger(database_funcoes_DAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static void cadastraItem(){
        
        nome_item = Bd_CEAP_GUI.itemTXT.getText();
        
        controller.Conexao_DB.carregaDriver();

        Connection con = null;
        
        try{
            con = (Connection) DriverManager.getConnection(url, username, password);
        } catch (SQLException ex) {
            Logger.getLogger(database_funcoes_DAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        String SQL = "insert into itens(nome_item) values('"+nome_item+"')";
        
        try{
            PreparedStatement insert = (PreparedStatement) con.prepareStatement(SQL);
            insert.execute();
            
            Bd_CEAP_GUI.itemTXT.setText("");
            
        }catch (Exception ex) {
            Logger.getLogger(database_funcoes_DAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    // CARREGAR DO BANCO DE DADOS
    
    public static void carregaProfessoresBD() throws SQLException{
        
        String SQL = "select * from professores";
        
        Bd_CEAP_GUI.profCBJ.removeAllItems();
        
        Connection con = (Connection) DriverManager.getConnection(url, username, password);
        
        try{
            
            PreparedStatement pst = con.prepareStatement(SQL);
            ResultSet rs = pst.executeQuery();
            
            while(rs.next()){
                Bd_CEAP_GUI.profCBJ.addItem(rs.getString("nome_prof"));
            }
            
        }catch (Exception e){
        }
    }
    
    public static void carregaChavesBD() throws SQLException{
        
        String SQL = "select * from chaves";
        
        Bd_CEAP_GUI.chaveCBJ.removeAllItems();
        
        Connection con = (Connection) DriverManager.getConnection(url, username, password);
        
        try{
            
            PreparedStatement pst = con.prepareStatement(SQL);
            ResultSet rs = pst.executeQuery();
            
            while(rs.next()){
                Bd_CEAP_GUI.chaveCBJ.addItem(rs.getString("nome_chave"));
            }
            
        }catch (Exception e){
        }
    }
    
    public static void carregaItensBD() throws SQLException{
        
        String SQL = "select * from itens";
        
        Bd_CEAP_GUI.itemCBJ.removeAllItems();
        
        Connection con = (Connection) DriverManager.getConnection(url, username, password);
        
        try{
            
            PreparedStatement pst = con.prepareStatement(SQL);
            ResultSet rs = pst.executeQuery();
            
            while(rs.next()){
                Bd_CEAP_GUI.itemCBJ.addItem(rs.getString("nome_item"));
            }
            
        }catch (Exception e){
        }
    }
    
    // APAGAR DADOS BD 
    
    public static void removerProf(){
        
        controller.Conexao_DB.carregaDriver();

        Connection con = null;
        
        try{
            con = (Connection) DriverManager.getConnection(url, username, password);
        } catch (SQLException ex) {
            Logger.getLogger(database_funcoes_DAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        String x = Bd_CEAP_GUI.profCBJ.getSelectedItem().toString();
        
        String SQL = "delete from professores where nome_prof = ?";
        
        
        try{
            PreparedStatement insert = (PreparedStatement) con.prepareStatement(SQL);
            insert.setString(1, x);
            insert.execute();
            
        }catch (Exception ex) {
            Logger.getLogger(Bd_CEAP_GUI.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    public static void removerChave(){
        
        controller.Conexao_DB.carregaDriver();

        Connection con = null;
        
        try{
            con = (Connection) DriverManager.getConnection(url, username, password);
        } catch (SQLException ex) {
            Logger.getLogger(database_funcoes_DAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        String x = Bd_CEAP_GUI.chaveCBJ.getSelectedItem().toString();
        
        String SQL = "delete from chaves where nome_chave = ?";
        
        
        try{
            PreparedStatement insert = (PreparedStatement) con.prepareStatement(SQL);
            insert.setString(1, x);
            insert.execute();
            
        }catch (Exception ex) {
            Logger.getLogger(Bd_CEAP_GUI.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    public static void removerItem(){
        
        controller.Conexao_DB.carregaDriver();

        Connection con = null;
        
        try{
            con = (Connection) DriverManager.getConnection(url, username, password);
        } catch (SQLException ex) {
            Logger.getLogger(database_funcoes_DAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        String x = Bd_CEAP_GUI.itemCBJ.getSelectedItem().toString();
        
        String SQL = "delete from itens where nome_item = ?";
        
        
        try{
            PreparedStatement insert = (PreparedStatement) con.prepareStatement(SQL);
            insert.setString(1, x);
            insert.execute();
            
        }catch (Exception ex) {
            Logger.getLogger(Bd_CEAP_GUI.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    // REGISTRO DE DADOS
    
    public static void carregaProfessores() throws SQLException{
        
        String SQL = "select * from professores";
        
        Chave_CEAP_GUI.profCBX.removeAllItems();
        
        Connection con = (Connection) DriverManager.getConnection(url, username, password);
        
        try{
            
            PreparedStatement pst = con.prepareStatement(SQL);
            ResultSet rs = pst.executeQuery();
            
            while(rs.next()){
                Chave_CEAP_GUI.profCBX.addItem(rs.getString("nome_prof"));
            }
            
        }catch (Exception e){
        }
    }
    
    public static void carregaChaves() throws SQLException{
        
        String SQL = "select * from chaves";
        
        Chave_CEAP_GUI.chaveCBX.removeAllItems();
        
        Connection con = (Connection) DriverManager.getConnection(url, username, password);
        
        try{
            
            PreparedStatement pst = con.prepareStatement(SQL);
            ResultSet rs = pst.executeQuery();
            
            while(rs.next()){
                Chave_CEAP_GUI.chaveCBX.addItem(rs.getString("nome_chave"));
            }
            
        }catch (Exception e){
        }
    }
    
    public static void updateRegistroChaves() throws SQLException{
        String SQL = "select * from registrochaves";
        
        DefaultTableModel model = (DefaultTableModel) Chave_CEAP_GUI.registros.getModel();
        model.setRowCount(0);
        
        Connection con = (Connection) DriverManager.getConnection(url, username, password);
        
        try{
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(SQL);
            
            while(rs.next()){
                String nome = rs.getString("reg_nome");
                String chave = rs.getString("reg_chave");
                String tipo = rs.getString("reg_tipo");
                String horario = rs.getString("reg_horario");
                String data = rs.getString("reg_data");
                String status = rs.getString("reg_status");
                
                String tBD[] = {nome, chave, tipo, horario, data, status};
                model.addRow(tBD);
                
            }
        }catch (Exception e){
        }
    }
    
    public static void registraChave(){
        
        String prof = Chave_CEAP_GUI.profCBX.getSelectedItem().toString();
        String tipo = Chave_CEAP_GUI.tipoCBX.getSelectedItem().toString();
        String chave = Chave_CEAP_GUI.chaveCBX.getSelectedItem().toString();
        
        Date dataHoraAtual = new Date();
        String hora = new SimpleDateFormat("HH:mm:ss").format(dataHoraAtual);
        
        Date dataDiaAtual = new Date();
        String dia = new SimpleDateFormat("dd/MM/yyyy").format(dataDiaAtual);
        
        controller.Conexao_DB.carregaDriver();

        Connection con = null;
        
        try{
            con = (Connection) DriverManager.getConnection(url, username, password);
        } catch (SQLException ex) {
            Logger.getLogger(database_funcoes_DAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        String SQL = "insert into registrochaves(reg_nome,reg_chave,reg_tipo,reg_horario,reg_data,reg_status) values(?,?,?,?,?,?)";
        
        try{
            PreparedStatement insert = (PreparedStatement) con.prepareStatement(SQL);
            insert.setString(1, prof);
            insert.setString(2, chave);
            insert.setString(3, tipo);
            insert.setString(4, hora);
            insert.setString(5, dia);
            insert.setString(6, "Pendente");
            
            insert.execute();
            
        }catch (Exception ex) {
            Logger.getLogger(database_funcoes_DAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        try {
            updateRegistroChaves();
        } catch (SQLException ex) {
            Logger.getLogger(database_funcoes_DAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    public static void verificaChave(){
        
        controller.Conexao_DB.carregaDriver();

        Connection con = null;
        
        try{
            con = (Connection) DriverManager.getConnection(url, username, password);
        } catch (SQLException ex) {
            Logger.getLogger(database_funcoes_DAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        DefaultTableModel model = (DefaultTableModel) Chave_CEAP_GUI.registros.getModel();
        int row = Chave_CEAP_GUI.registros.getSelectedRow();
        String horario = Chave_CEAP_GUI.registros.getModel().getValueAt(row, 3).toString();
        String data = Chave_CEAP_GUI.registros.getModel().getValueAt(row, 4).toString();
        
        String SQL = "update registrochaves set reg_status='Entregue' where reg_horario='"+horario+"' and reg_data='"+data+"'";
        
        
        try{
            PreparedStatement insert = (PreparedStatement) con.prepareStatement(SQL);
            insert.executeUpdate();
            
        }catch (Exception ex) {
            Logger.getLogger(database_funcoes_DAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        try {
            updateRegistroChaves();
        } catch (SQLException ex) {
            Logger.getLogger(database_funcoes_DAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    // REGISTRO DE ITENS
    
    public static void carregaProfessoresItem() throws SQLException{
        
        String SQL = "select * from professores";
        
        Item_CEAP_GUI.profCBX.removeAllItems();
        
        Connection con = (Connection) DriverManager.getConnection(url, username, password);
        
        try{
            
            PreparedStatement pst = con.prepareStatement(SQL);
            ResultSet rs = pst.executeQuery();
            
            while(rs.next()){
                Item_CEAP_GUI.profCBX.addItem(rs.getString("nome_prof"));
            }
            
        }catch (Exception e){
        }
    }
    
    public static void carregaItem() throws SQLException{
        
        String SQL = "select * from itens";
        
        Item_CEAP_GUI.itemCBX.removeAllItems();
        
        Connection con = (Connection) DriverManager.getConnection(url, username, password);
        
        try{
            
            PreparedStatement pst = con.prepareStatement(SQL);
            ResultSet rs = pst.executeQuery();
            
            while(rs.next()){
                Item_CEAP_GUI.itemCBX.addItem(rs.getString("nome_item"));
            }
            
        }catch (Exception e){
        }
    }
    
    public static void updateRegistroItens() throws SQLException{
        String SQL = "select * from registroitens";
        
        DefaultTableModel model = (DefaultTableModel) Item_CEAP_GUI.registros.getModel();
        model.setRowCount(0);
        
        Connection con = (Connection) DriverManager.getConnection(url, username, password);
        
        try{
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(SQL);
            
            while(rs.next()){
                String nome = rs.getString("reg_nome");
                String item = rs.getString("reg_item");
                String horario = rs.getString("reg_horario");
                String data = rs.getString("reg_data");
                String status = rs.getString("reg_status");
                
                String tBD[] = {nome, item, horario, data, status};
                model.addRow(tBD);
                
            }
        }catch (Exception e){
        }
    }
    
    public static void registraItem(){
        
        String prof = Item_CEAP_GUI.profCBX.getSelectedItem().toString();
        String item = Item_CEAP_GUI.itemCBX.getSelectedItem().toString();
        
        Date dataHoraAtual = new Date();
        String hora = new SimpleDateFormat("HH:mm:ss").format(dataHoraAtual);
        
        Date dataDiaAtual = new Date();
        String dia = new SimpleDateFormat("dd/MM/yyyy").format(dataDiaAtual);
        
        controller.Conexao_DB.carregaDriver();

        Connection con = null;
        
        try{
            con = (Connection) DriverManager.getConnection(url, username, password);
        } catch (SQLException ex) {
            Logger.getLogger(database_funcoes_DAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        String SQL = "insert into registroitens(reg_nome,reg_item,reg_horario,reg_data,reg_status) values(?,?,?,?,?)";
        
        try{
            PreparedStatement insert = (PreparedStatement) con.prepareStatement(SQL);
            insert.setString(1, prof);
            insert.setString(2, item);
            insert.setString(3, hora);
            insert.setString(4, dia);
            insert.setString(5, "Pendente");
            
            insert.execute();
            
        }catch (Exception ex) {
            Logger.getLogger(database_funcoes_DAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        try {
            updateRegistroItens();
        } catch (SQLException ex) {
            Logger.getLogger(database_funcoes_DAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    public static void verificaItem(){
        
        controller.Conexao_DB.carregaDriver();

        Connection con = null;
        
        try{
            con = (Connection) DriverManager.getConnection(url, username, password);
        } catch (SQLException ex) {
            Logger.getLogger(database_funcoes_DAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        DefaultTableModel model = (DefaultTableModel) Item_CEAP_GUI.registros.getModel();
        int row = Item_CEAP_GUI.registros.getSelectedRow();
        String horario = Item_CEAP_GUI.registros.getModel().getValueAt(row, 2).toString();
        String data = Item_CEAP_GUI.registros.getModel().getValueAt(row, 3).toString();
        
        String SQL = "update registroitens set reg_status='Entregue' where reg_horario='"+horario+"' and reg_data='"+data+"'";
        
        
        try{
            PreparedStatement insert = (PreparedStatement) con.prepareStatement(SQL);
            insert.executeUpdate();
            
        }catch (Exception ex) {
            Logger.getLogger(database_funcoes_DAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        try {
            updateRegistroItens();
        } catch (SQLException ex) {
            Logger.getLogger(database_funcoes_DAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    public static void desregistraItem(){
        
        controller.Conexao_DB.carregaDriver();

        Connection con = null;
        
        try{
            con = (Connection) DriverManager.getConnection(url, username, password);
        } catch (SQLException ex) {
            Logger.getLogger(database_funcoes_DAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        DefaultTableModel model = (DefaultTableModel) Item_CEAP_GUI.registros.getModel();
        int row = Item_CEAP_GUI.registros.getSelectedRow();
        String dia = Item_CEAP_GUI.registros.getModel().getValueAt(row, 3).toString();
        String data = Item_CEAP_GUI.registros.getModel().getValueAt(row, 2).toString();
        String item = Item_CEAP_GUI.registros.getModel().getValueAt(row, 1).toString();
        
        String SQL = "delete from registroitens where reg_item=? and reg_horario=? and reg_data=?";
        
        
        try{
            PreparedStatement insert = (PreparedStatement) con.prepareStatement(SQL);
            insert.setString(1, item);
            insert.setString(2, data);
            insert.setString(3, dia);
            insert.execute();
            
        }catch (Exception ex) {
            Logger.getLogger(database_funcoes_DAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        try {
            updateRegistroItens();
        } catch (SQLException ex) {
            Logger.getLogger(database_funcoes_DAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    public static void desregistraChaves(){
        
        controller.Conexao_DB.carregaDriver();

        Connection con = null;
        
        try{
            con = (Connection) DriverManager.getConnection(url, username, password);
        } catch (SQLException ex) {
            Logger.getLogger(database_funcoes_DAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        DefaultTableModel model = (DefaultTableModel) Chave_CEAP_GUI.registros.getModel();
        int row = Chave_CEAP_GUI.registros.getSelectedRow();
        String data = Chave_CEAP_GUI.registros.getModel().getValueAt(row, 4).toString();
        String horario = Chave_CEAP_GUI.registros.getModel().getValueAt(row, 3).toString();
        String key = Chave_CEAP_GUI.registros.getModel().getValueAt(row, 1).toString();
        
        String SQL = "delete from registrochaves where reg_chave=? and reg_horario=? and reg_data=?";
        
        
        try{
            PreparedStatement insert = (PreparedStatement) con.prepareStatement(SQL);
            insert.setString(1, key);
            insert.setString(2, horario);
            insert.setString(3, data);
            insert.execute();
            
        }catch (Exception ex) {
            Logger.getLogger(database_funcoes_DAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        try {
            updateRegistroChaves();
        } catch (SQLException ex) {
            Logger.getLogger(database_funcoes_DAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
}
