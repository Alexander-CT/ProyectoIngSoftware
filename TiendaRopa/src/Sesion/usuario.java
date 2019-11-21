package Sesion;
import java.sql.*;
import javax.swing.JOptionPane;
import ConexionJB.Conexion;

public class usuario{
    Connection cn;
    public String cod_usu,cod_emp,nom_usu,password,cargo;

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    
    
    
    public usuario(){
        Conexion con = new Conexion();
        cn= con.abrirOracle();
    }

    public String getCod_usu() {
        return cod_usu;
    }

    public void setCod_usu(String cod_usu) {
        this.cod_usu = cod_usu;
    }

    public String getCod_emp() {
        return cod_emp;
    }

    public void setCod_emp(String cod_emp) {
        this.cod_emp = cod_emp;
    }

    public String getNom_usu() {
        return nom_usu;
    }

    public void setNom_usu(String nom_usu) {
        this.nom_usu = nom_usu;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    public void ingreso(){
        try{
            String id;
            
         PreparedStatement cmd = cn.prepareStatement("select Nom_usu,Password,cargo from usuario where Nom_usu=?");
         cmd.setString(1,getNom_usu());
         ResultSet rs = cmd.executeQuery() ;
         
         if(rs.next()){
             id = rs.getString(1);
             this.setPassword(rs.getString(2));
             this.setCargo(rs.getString(3));
         }
        }
        catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        
    }
}
