


package LISTAR;

import java.sql.SQLException;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import ConexionJB.Conexion;
import EntornoGrafico.CreacionClientes;
import EntornoGrafico.CreacionEmpleado;
import EntornoGrafico.CreacionUsuarios;
import EntornoGrafico.NuevaCategoria;
import EntornoGrafico.NuevosProductos;



public class TProducto extends javax.swing.JFrame {

    
    DefaultTableModel  modelo= new DefaultTableModel();
     JTable tabla=new JTable(modelo);
            JScrollPane js=new JScrollPane(tabla);
    
    
    
    public TProducto() {
        initComponents();
         
        initComponents();
        
        this.setSize(600,400);
         this.setLocation(600,100);
        
        js.setBounds(100,20,400,150);
        
        add(js);
   
        modelo.addColumn("codigo Producto");
       modelo.addColumn("Nombre");  
       modelo.addColumn("Precio"); 
       modelo.addColumn("Stock"); 
       modelo.addColumn("codCategoria"); 
       modelo.addColumn("Cod Proveedor"); 
       
       
     mostrar2();
        
    }
    
    
    Conexion obj=new Conexion();
    
    
    
    
    private void mostrar2(){
    
    try{
       
        obj.abrirOracle();
        obj.rs=obj.ts.executeQuery("select * from producto ");
        
      while(obj.rs.next()){
        
          
           Vector V=new Vector();
           for(int i=1;i<7;V.addElement(obj.rs.getString(i++))){
               
               
           }
           modelo.addRow(V);
           
      }
      
     
           
        
        
    } catch(SQLException x1){
        
        JOptionPane.showMessageDialog( this, x1.toString());
        
        
        
    }
}
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Lista de Productos");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TProducto().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables

    
}
