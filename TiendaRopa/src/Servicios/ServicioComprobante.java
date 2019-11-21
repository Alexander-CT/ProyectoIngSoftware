
package Servicios;
import java.sql.Connection;
import java.util.logging.Level;
import java.util.logging.Logger;
import CapaMetodos.ComprobanteMetodos;
import CapaInstanciaDatos.ComprobanteI;
import ConexionJB.Conexion;
import java.sql.SQLException;


public class ServicioComprobante {
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
    
public boolean agregarComprobanteNuevo(ComprobanteI datas){
    boolean resp=false;
    //abrir conexion
    Connection con=abrir();
    
    
    ComprobanteMetodos xd; 
         xd = new ComprobanteMetodos();
        try {
            resp=xd.agregarComprobante(datas, con);
            
        } 
        catch (SQLException ex) {
            Logger.getLogger(ServicioComprobante.class.getName()).log(Level.SEVERE, null, ex);
    
        }finally{
            cerrar(con);
        }
    
    
    return resp;
    
    
}    

}
