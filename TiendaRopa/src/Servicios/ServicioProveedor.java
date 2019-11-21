
package Servicios;


import java.sql.Connection;
import java.util.logging.Level;
import java.util.logging.Logger;
import CapaMetodos.ProveedorMetodo;
import CapaInstanciaDatos.ProveedorI;
import ConexionJB.Conexion;
import java.sql.SQLException;

public class ServicioProveedor {

    
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
    
public boolean agregarProveedorNuevo(ProveedorI datas){
    boolean resp=false;
    //abrir conexion
    Connection con=abrir();
    
    
    ProveedorMetodo xd; 
         xd = new ProveedorMetodo();
        try {
            resp=xd.agregarProveedor(datas, con);
            
        } 
        catch (SQLException ex) {
            Logger.getLogger(ServiciosG.class.getName()).log(Level.SEVERE, null, ex);
    
        }finally{
            cerrar(con);
        }
    
    
    return resp;
    
    
}    

    public ProveedorI buscarProveedorPorCodigo1(String cod){
       
      ProveedorI pro=null;
       
       Connection con=abrir();
       
       ProveedorMetodo ppdao= new ProveedorMetodo();
       
       try{
          pro=ppdao.buscarProveedorPorCodigo(cod, con);
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
