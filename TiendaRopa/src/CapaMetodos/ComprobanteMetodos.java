
package CapaMetodos;

import CapaInstanciaDatos.ComprobanteI;
import java.sql.Connection;
import java.sql.SQLException;

import java.sql.PreparedStatement;


public class ComprobanteMetodos {
    
    
     public boolean agregarComprobante(ComprobanteI datas, Connection con) throws SQLException {
                  
        boolean resp=false;
        
        String query="insert into system.comprobante_pago values(?,?,?,?,?,?)";
        
        PreparedStatement ps=con.prepareStatement(query);
       
        
        ps.setString(1,datas.getCod_comprobante());
        ps.setString(2, datas.getTipo());
         ps.setString(3, datas.getCod_cli());
         ps.setString(4, datas.getCod_emp());
         ps.setString(5, datas.getFecha());
         ps.setDouble(6, datas.getTotal());
         
         
          int x=ps.executeUpdate();
          if(x>0)
              resp=true;
         
         
        return resp;
    }
    
}
