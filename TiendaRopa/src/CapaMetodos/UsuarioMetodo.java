/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package CapaMetodos;

import CapaInstanciaDatos.Usuario;
import java.sql.Connection;
import java.sql.SQLException;

import java.sql.PreparedStatement;
import java.sql.ResultSet;


public class UsuarioMetodo {
    
    
    public boolean agregarUser(Usuario datas, Connection con) throws SQLException {
                  
        boolean resp=false;
        
        String query="insert into system.usuario values(?,?,?,?,?)";
        
        PreparedStatement ps=con.prepareStatement(query);
       
        ps.setString(1, datas.getCod_usu());
         ps.setString(2, datas.getCod_emp());
         ps.setString(3, datas.getNom_usu());
         ps.setString(4, datas.getPassword());
         ps.setString(5, datas.getCargo());
         
         
         
          int x=ps.executeUpdate();
          if(x>0)
              resp=true;
         
         
        return resp;
    }
    

    
    
    public Usuario buscarUsuarioPorCodigo(String xcod,Connection con) throws SQLException{
        
       Usuario prod=null;
        
        String sql="select*from  system.usuario where cod_usu=?";
                
        
        PreparedStatement ps=con.prepareStatement(sql);
       
        ps.setString(1, xcod);
        ResultSet rs=ps.executeQuery();
                   
        //recorre el rs y extrae la datapara poner
          if(rs.next())
          {
            prod=new Usuario();
            
            prod.setCod_usu(rs.getString(1));
            prod.setCod_emp(rs.getString(2));
            prod.setNom_usu(rs.getString(3));
            prod.setPassword(rs.getString(4));            
            
          } 
            
                      
                return prod;
    }
    

    
    
    
    public boolean eliminarRegistroUsuario(String xcod, Connection con)throws SQLException{
        boolean resp=false;
        
        String sql="delete from system.usuario where cod_usu= ?";
       
        PreparedStatement st=con.prepareStatement(sql);
        st.setString(1, xcod);
        //int i=st.executeUpdate(sql);
        int i=st.executeUpdate();
        
       
        
         return resp;
    }
    
    
    
    
    
    
    
}
