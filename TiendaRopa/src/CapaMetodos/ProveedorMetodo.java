
package CapaMetodos;


import CapaInstanciaDatos.ProveedorI;
import java.sql.Connection;
import java.sql.SQLException;

import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class ProveedorMetodo {
    
    
    
    
     public boolean agregarProveedor(ProveedorI datas, Connection con) throws SQLException {
                  
        boolean resp=false;
        
        String query="insert into system.proveedor values(?,?,?)";
        
        PreparedStatement ps=con.prepareStatement(query);
       
        
        ps.setString(1,datas.getCod_prov());
        ps.setString(2, datas.getNom_prov());
         ps.setString(3, datas.getContacto());
         
          int x=ps.executeUpdate();
          if(x>0)
              resp=true;
         
         
        return resp;
    }
     
     
     
     
    public ProveedorI buscarProveedorPorCodigo(String xcod,Connection con) throws SQLException{
        
        ProveedorI prod=null;
        
        String sql="select*from  system.proveedor where cod_prov=?";
                
        
        PreparedStatement ps=con.prepareStatement(sql);
       
        ps.setString(1, xcod);
        ResultSet rs=ps.executeQuery();
                   
        //recorre el rs y extrae la datapara poner
          if(rs.next())
          {
            prod=new ProveedorI();
            
            prod.setCod_prov(rs.getString(1));
            prod.setNom_prov(rs.getString(2));
            prod.setContacto(rs.getString(3));
            
          } 
            
                      
                return prod;
    }
    
}
