
package CapaMetodos;

import CapaInstanciaDatos.EmpleadoI;
import java.sql.Connection;
import java.sql.SQLException;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
public class EmpleadoMetodo {
    
    
    public boolean agregarEmpleados(EmpleadoI datas, Connection con) throws SQLException {
                  
        boolean resp=false;
        
        String query="insert into system.empleado values(?,?,?,?,?,?,?)";
        
        PreparedStatement ps=con.prepareStatement(query);
       
        
        ps.setString(1,datas.getCod_emp());
        ps.setString(2, datas.getPat_emp());
         ps.setString(3, datas.getMat_emp());
         ps.setString(4, datas.getNom_emp());
         ps.setString(5, datas.getDir_emp());
         ps.setString(6, datas.getContacto());
         ps.setString(7,datas.getFecha_nac());

         
         
          int x=ps.executeUpdate();
          if(x>0)
              resp=true;
         
         
        return resp;
    }
    
    
    
    
    
    
        public boolean eliminarRegistroCategoria(String xcod, Connection con)throws SQLException{
        boolean resp=false;
        
        String sql="delete from system.empleado where cod_emp= ?";
        
        PreparedStatement st=con.prepareStatement(sql);
        st.setString(1, xcod);
        //int i=st.executeUpdate(sql);
        int i=st.executeUpdate();
        
       
        
         return resp;
    }
 
    /**
     * Metodo que modifica los datos de los distritos
     * recibe la clase DistritoDTO
     * si hay errores que se propage
    
     */
 
    public boolean actualizarRegistro(EmpleadoI datas,Connection con)throws SQLException{
        boolean resp=false;
        
        String sql=" update empleado set cod_emp=?,"
                +"pat_emp=?"
                +"mat_emp=?"
                +"nom_emp"
                +"dir_emp"
                +"contacto"
                +"fecha_nac";
        JOptionPane.showMessageDialog(null,sql.toString());
        PreparedStatement ps=con.prepareStatement(sql);
        //sustituye los ? por los valores
       ps.setString(1,datas.getCod_emp());
        ps.setString(2, datas.getPat_emp());
         ps.setString(3, datas.getMat_emp());
         ps.setString(4, datas.getNom_emp());
         ps.setString(5, datas.getDir_emp());
         ps.setString(6, datas.getContacto());
         ps.setString(7,datas.getFecha_nac());
        int i=ps.executeUpdate();
        
        if(i>0)
        resp=true;
        
        return resp;
        
    }
    
    
    
    
    public EmpleadoI buscarEmpleadoPorCodigo(String xcod,Connection con) throws SQLException{
        
        EmpleadoI prod=null;
        
        String sql="select*from  system.empleado where cod_emp=?";
                
        
        PreparedStatement ps=con.prepareStatement(sql);
       
        ps.setString(1, xcod);
        ResultSet rs=ps.executeQuery();
                   
        //recorre el rs y extrae la datapara poner
          if(rs.next())
          {
            prod=new EmpleadoI();
            
            prod.setCod_emp(rs.getString(1));
            prod.setPat_emp(rs.getString(2));
            prod.setMat_emp(rs.getString(3));
            prod.setNom_emp(rs.getString(4));
            prod.setDir_emp(rs.getString(5));
            prod.setContacto(rs.getString(6));
            prod.setFecha_nac(rs.getString(7));
            
          } 
            
        
        
        
                return prod;
    }
    
    
    
    
}





    
