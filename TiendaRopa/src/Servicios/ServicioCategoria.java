package Servicios;
import java.sql.Connection;
import java.util.logging.Level;
import java.util.logging.Logger;
import CapaMetodos.CategoriaMetodos;
import CapaInstanciaDatos.CategoriaI;
import ConexionJB.Conexion;
import java.sql.SQLException;

public class ServicioCategoria {
    
    
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
    
public boolean agregarCategoriaNueva(CategoriaI datas){
    boolean resp=false;
    //abrir conexion
    Connection con=abrir();
    
    
    CategoriaMetodos xd; 
         xd = new CategoriaMetodos();
        try {
            resp=xd.agregarCategoria(datas, con);
            
        } 
        catch (SQLException ex) {
            Logger.getLogger(ServiciosG.class.getName()).log(Level.SEVERE, null, ex);
    
        }finally{
            cerrar(con);
        }
    
    
    return resp;
    }
    
    
    public CategoriaI buscarCategoriaPorCodigo1(String cod){
       
      CategoriaI pro=null;
       
       Connection con=abrir();
       
       CategoriaMetodos ppdao= new CategoriaMetodos();
       
       try{
          pro=ppdao.buscarCategoriaPorCodigo(cod, con);
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
