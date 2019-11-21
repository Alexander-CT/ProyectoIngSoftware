
package CapaMetodos;
//imoportamos las librerias necesarias para la conexion
import CapaInstanciaDatos.DetalleComprobanteI;
import java.sql.Connection;
import java.sql.SQLException;

import java.sql.PreparedStatement;

//creamos la clase llamada DetalleComprobanteMetodos
public class DetalleComprobanteMetodos {
    //creando instancia para insertar datos en la columna detalle
    public boolean agregarDetalleComprobante(DetalleComprobanteI datas, Connection con) throws SQLException {
    
        boolean resp=false;
        //Preparando consulta de inserciòn
        String query="insert into system.detalle_comprobante values(?,?,?,?)";
        
        PreparedStatement ps=con.prepareStatement(query);
       
        //Conectando tablas con el programa
        ps.setString(1,datas.getCod_comprobante());
        ps.setString(2, datas.getCod_pro());
        ps.setDouble(3, datas.getPrecio());
        ps.setInt(4, datas.getCant());
        
        //Definiendo variables para actualizar datos de las columnas
        int x=ps.executeUpdate();
        if(x>0)
        resp=true;
         
         
        return resp;
    }

}
