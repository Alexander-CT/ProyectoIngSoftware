
package ConexionJB;

//importamos las librerìas necesarias
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author  Aruata-Castro-Muñoz-Villacorta
 */
//Se crea la clase conexion, para conectar con la base de datos
public class Conexion {
    
    //Definiendo como null cada una de las variables para manejar la base de datos
            public ResultSet rs=null;
            public Statement ts=null ;
            public Connection con=null;
            
            
    //clase para abrir el oracled desde el programa        
    public Connection abrirOracle(){
        
     
    try{
        
   DriverManager.registerDriver(new oracle.jdbc.OracleDriver()); //usando el JDBC de oracle
   con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","system","system");//consiguiendo una conexion en el localhost
   ts=con.createStatement(rs.TYPE_SCROLL_INSENSITIVE,rs.CONCUR_UPDATABLE);
   System.out.println("La conexion se realizon con exito");//mensaje de demostraciòn de una conexiòn existosa
        
        
    }catch(Exception e){
        System.out.println("error de conexion: "+e.toString());
    }
      return con;
    }
 
}
