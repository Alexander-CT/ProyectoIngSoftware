
package Servicios;

import java.sql.Connection;
import java.util.logging.Level;
import java.util.logging.Logger;
import CapaMetodos.EmpleadoMetodo;
import CapaInstanciaDatos.EmpleadoI;
import ConexionJB.Conexion;
import java.sql.SQLException;


public class ServicioEmpleado {
       
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
    
public boolean agregarEmpleadoNuevo(EmpleadoI datas){
    boolean resp=false;
    //abrir conexion
    Connection con=abrir();
    
    
    EmpleadoMetodo xd; 
         xd = new EmpleadoMetodo();
        try {
            resp=xd.agregarEmpleados(datas, con);
            
        } 
        catch (SQLException ex) {
            Logger.getLogger(ServiciosG.class.getName()).log(Level.SEVERE, null, ex);
    
        }finally{
            cerrar(con);
        }
    
    
    return resp;
    
    
}

  public EmpleadoI buscarEmpleadoPorCodigo1(String cod){
       
       EmpleadoI pro=null;
       
       Connection con=abrir();
       
       EmpleadoMetodo ppdao= new EmpleadoMetodo();
       
       try{
          pro=ppdao.buscarEmpleadoPorCodigo(cod, con);
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
