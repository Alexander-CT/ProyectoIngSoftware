/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import java.sql.Connection;
import java.util.logging.Level;
import java.util.logging.Logger;
import CapaMetodos.ClienteMetodos;
import CapaInstanciaDatos.ClientesI;
import ConexionJB.Conexion;
import java.sql.SQLException;

public class ServicioCliente {
    
    
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
    
public boolean agregarClienteNuevo(ClientesI datas){
    boolean resp=false;
    //abrir conexion
    Connection con=abrir();
    
    
    ClienteMetodos xd; 
         xd = new ClienteMetodos();
        try {
            resp=xd.agregarClientes(datas, con);
            
        } 
        catch (SQLException ex) {
            Logger.getLogger(ServiciosG.class.getName()).log(Level.SEVERE, null, ex);
    
        }finally{
            cerrar(con);
        }
    
    
    return resp;
    
    
}    


  public ClientesI buscarClientesPorCodigo1(String cod){
       
       ClientesI pro=null;
       
       Connection con=abrir();
       
       ClienteMetodos ppdao= new ClienteMetodos();
       
       try{
          pro = ppdao.buscarClientePorCodigo(cod, con);
       }
       catch(SQLException ex)
       {
           Logger.getLogger(ServicioEmpleado.class.getName()).log(Level.SEVERE,null,ex);
       }
       finally{
           cerrar(con);
       }
       return pro;
   }    
}
