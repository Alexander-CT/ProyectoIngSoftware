/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import java.sql.Connection;
import java.util.logging.Level;
import java.util.logging.Logger;
import CapaMetodos.UsuarioMetodo;
import CapaInstanciaDatos.Usuario;
import ConexionJB.Conexion;
import java.sql.SQLException;


public class ServiciosG {
    
    
     private Connection abrir(){
        
        Connection con=null;
        /**
         * instanciar la clase conexion
         */
        Conexion obj=new Conexion();
        con=obj.abrirOracle();
        return con;
    }
    private void cerrar(Connection con){
        try {
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(ServiciosG.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    
public boolean agregarUsuarioNuevo(Usuario datas){
    boolean resp=false;
    //abrir conexion
    Connection con=abrir();
    
    
    UsuarioMetodo xd; 
         xd = new UsuarioMetodo();
        try {
            resp=xd.agregarUser(datas, con);
            
        } 
        catch (SQLException ex) {
            Logger.getLogger(ServiciosG.class.getName()).log(Level.SEVERE, null, ex);
    
        }finally{
            cerrar(con);
        }
    
    
    return resp;
    }
    
      public Usuario buscarUsuarioPorCodigo1(String cod){
       
       Usuario pro=null;
       
       Connection con=abrir();
       
       UsuarioMetodo ppdao= new UsuarioMetodo();
       
       try{
          pro = ppdao.buscarUsuarioPorCodigo(cod, con);
       }
       catch(SQLException ex)
       {
           Logger.getLogger(ServiciosG.class.getName()).log(Level.SEVERE,null,ex);
       }
       finally{
           cerrar(con);
       }
       return pro;
   }    

    
    
   
    
    
    
    
    
}
