package CapaMetodos;
import CapaInstanciaDatos.CategoriaI;
import java.sql.Connection;
import java.sql.SQLException;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class CategoriaMetodos {

        public boolean agregarCategoria(CategoriaI datas, Connection con) throws SQLException {
                  
        boolean resp=false;
        
        String query="insert into system.categoria values(?,?)";
        
        PreparedStatement ps=con.prepareStatement(query);
       
        ps.setString(1, datas.getCod_cate());
         ps.setString(2, datas.getNom_cate());
         
         
          int x=ps.executeUpdate();
          if(x>0)
              resp=true;
         
         
        return resp;
    }
    
    

    public CategoriaI buscarCategoriaPorCodigo(String xcod,Connection con) throws SQLException{
        
        CategoriaI prod=null;
        
        String sql="select*from  system.categoria where cod_cate=?";
                
        
        PreparedStatement ps=con.prepareStatement(sql);
       
        ps.setString(1, xcod);
        ResultSet rs=ps.executeQuery();
                   
        //recorre el rs y extrae la datapara poner
          if(rs.next())
          {
            prod=new CategoriaI();
            
            prod.setCod_cate(rs.getString(1));
            prod.setNom_cate(rs.getString(2));
          } 
            
                      
                return prod;
    }
    
    
    
    
    public boolean eliminarRegistroCategoria(String xcod, Connection con)throws SQLException{
        boolean resp=false;
        
        String sql="delete from system.categoria where cod_cate= ?";
        
        PreparedStatement st=con.prepareStatement(sql);
        st.setString(1, xcod);
        //int i=st.executeUpdate(sql);
        int i=st.executeUpdate();
        
       
        
         return resp;
    }
    
    
    
}
