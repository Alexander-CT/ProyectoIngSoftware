
package CapaMetodos;

import CapaInstanciaDatos.ClientesI;
import java.sql.Connection;
import java.sql.SQLException;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
public class ClienteMetodos {
    
    
    
     public boolean agregarClientes(ClientesI datas, Connection con) throws SQLException {
                  
        boolean resp=false;
        
        String query="insert into system.cliente values(?,?,?,?,?,?,?,?)";
        
        PreparedStatement ps=con.prepareStatement(query);
       
        
        ps.setString(1,datas.getCod_cli());
        ps.setString(2, datas.getPat_cli());
         ps.setString(3, datas.getMat_cli());
         ps.setString(4, datas.getNom_cli());
         ps.setString(5, datas.getDir_cli());
         ps.setString(6, datas.getSexo());
         ps.setString(7,datas.getDni_ruc());
         ps.setString(8,datas.getContacto());
         
         
          int x=ps.executeUpdate();
          if(x>0)
              resp=true;
         
         
        return resp;
    }
     
     
     
     
    public ClientesI buscarClientePorCodigo(String xcod,Connection con) throws SQLException{
        
        ClientesI prod=null;
        
        String sql="select*from  system.cliente where cod_cli=?";
                
        
        PreparedStatement ps=con.prepareStatement(sql);
       
        ps.setString(1, xcod);
        ResultSet rs=ps.executeQuery();
                   
        //recorre el rs y extrae la datapara poner
          if(rs.next())
          {
            prod=new ClientesI();
            
            prod.setCod_cli(rs.getString(1));
            prod.setPat_cli(rs.getString(2));
            prod.setMat_cli(rs.getString(3));
            prod.setNom_cli(rs.getString(4));
            prod.setDir_cli(rs.getString(5));
            prod.setSexo(rs.getString(6));
            prod.setDni_ruc(rs.getString(7));
            prod.setContacto(rs.getString(8));
            
          } 
            
        
        
        
                return prod;
    }

    
    
    
    
    
    public boolean eliminarRegistroCliente(String xcod, Connection con)throws SQLException{
        boolean resp=false;
        
        String sql="delete from system.cliente where cod_cli= ?";
        
        PreparedStatement st=con.prepareStatement(sql);
        st.setString(1, xcod);
        //int i=st.executeUpdate(sql);
        int i=st.executeUpdate();
        
       
        
         return resp;
    }
    
}
