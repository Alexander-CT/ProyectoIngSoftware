

package CapaMetodos;

import CapaInstanciaDatos.ProductoI;
import java.sql.Connection;
import java.sql.SQLException;

import java.sql.PreparedStatement;
import java.sql.ResultSet;



public class ProductoMetodo {
        public boolean agregarProductos(ProductoI datas, Connection con) throws SQLException {
                  
        boolean resp=false;
        
        String query="insert into system.producto values(?,?,?,?,?,?)";
        
        PreparedStatement ps=con.prepareStatement(query);
       
        
        ps.setString(1,datas.getCod_pro());
        ps.setString(2, datas.getNom_pro());
        ps.setDouble(3, datas.getPrecio());
         ps.setInt(4, datas.getStock());
         ps.setString(5, datas.getCod_cate());
         ps.setString(6,datas.getCod_prov());
         
         
          int x=ps.executeUpdate();
          if(x>0)
              resp=true;
         
         
        return resp;
    }
        
        
        
    public ProductoI buscarProductoPorCodigo(String xcod,Connection con) throws SQLException{
        
        ProductoI prod=null;
        
        String sql="select*from  system.producto where cod_pro=?";
                
        
        PreparedStatement ps=con.prepareStatement(sql);
       
        ps.setString(1, xcod);
        ResultSet rs=ps.executeQuery();
                   
        //recorre el rs y extrae la datapara poner
          if(rs.next())
          {
            prod=new ProductoI();
            
            prod.setCod_pro(rs.getString(1));
            prod.setNom_pro(rs.getString(2));
            prod.setPrecio(rs.getDouble(3));
            prod.setStock(rs.getInt(4));
            prod.setCod_cate(rs.getString(5));
            prod.setCod_prov(rs.getString(6));
            
            
            
          } 
            
                      
                return prod;
    }
    
}
