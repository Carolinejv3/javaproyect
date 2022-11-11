/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loginusuario;

import CODE.MyConnection;
import java.awt.event.KeyEvent;
import javax.swing.table.DefaultTableModel;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author Caroline Jimenez
 */
public class control_stock extends javax.swing.JFrame {


    /**
     * Creates new form loginadmin
     */
    
    DefaultTableModel Productos;
    
    public control_stock() {
        initComponents();
        
        this.Productos = (DefaultTableModel) productostbl.getModel();
        
        Mostrardatos("");
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        preciolbl = new javax.swing.JLabel();
        txt_precio = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        stock_txt = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        backbtn = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        reportebtn = new javax.swing.JButton();
        btn_Modificar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        productostbl = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        preciolbl.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 3, 14)); // NOI18N
        preciolbl.setText("PRECIO:");
        getContentPane().add(preciolbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 190, 60, -1));

        txt_precio.setFont(new java.awt.Font("Microsoft JhengHei Light", 0, 14)); // NOI18N
        getContentPane().add(txt_precio, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 180, 200, 30));

        jLabel2.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 3, 14)); // NOI18N
        jLabel2.setText("STOCK:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 190, 60, -1));

        stock_txt.setFont(new java.awt.Font("Microsoft JhengHei Light", 0, 14)); // NOI18N
        getContentPane().add(stock_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 180, 194, 30));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/loginusuario/img/logo celucel1.jpg"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 30, 220, 120));

        backbtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/loginusuario/img/backicon.png"))); // NOI18N
        backbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backbtnActionPerformed(evt);
            }
        });
        getContentPane().add(backbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, -1, -1));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        reportebtn.setBackground(new java.awt.Color(204, 255, 102));
        reportebtn.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        reportebtn.setText("Reporte");
        reportebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reportebtnActionPerformed(evt);
            }
        });

        btn_Modificar.setBackground(new java.awt.Color(255, 153, 255));
        btn_Modificar.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        btn_Modificar.setText("Modificar");
        btn_Modificar.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btn_Modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ModificarActionPerformed(evt);
            }
        });

        productostbl.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 14)); // NOI18N
        productostbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        productostbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Seleccionar(evt);
            }
        });
        jScrollPane1.setViewportView(productostbl);

        jLabel1.setFont(new java.awt.Font("Microsoft YaHei Light", 1, 17)); // NOI18N
        jLabel1.setText("LISTA DE PRODUCTOS FUERA DE STOCK");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_Modificar, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(reportebtn, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(224, 224, 224))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(89, 89, 89)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(152, 152, 152)
                        .addComponent(jLabel1)))
                .addContainerGap(111, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(252, 252, 252)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(reportebtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_Modificar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 700));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    
public void Limpiar(){
        try{
    
     txt_precio.setText("");
     stock_txt.setText("");
     
        }
        catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "error "+ex);
    }
    }



    
    public void RefrescarTabla(){
        try{
            
            Productos.setColumnCount(0);
            Productos.setRowCount(0);
            productostbl.revalidate();
        }
         catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "error "+ex);
         }  
    }
        
        public final void Mostrardatos(String valor){
            //Funcion para llenar la jtable de Usuarios desde la BD
            MyConnection cc=new MyConnection();
            Connection cn=MyConnection.getConnection();
            RefrescarTabla();
            Productos.addColumn("Codigo");
            Productos.addColumn("Nombre");
            Productos.addColumn("Precio");
            Productos.addColumn("Stock");
            
            this.productostbl.setModel(Productos);
            String sql;
            if (valor.equals(""))
            {
            sql="SELECT * FROM producto where stock=0";
            }
            else{
            sql="SELECT * FROM producto WHERE Codigo='"+valor+"'";
            } 

            String []datos=new String [4];
            try{
            Statement st=cn.createStatement();
            ResultSet rs=st.executeQuery(sql);
            while(rs.next()){
            datos[0]=rs.getString(1);
            datos[1]=rs.getString(2);
            datos[2]=rs.getString(3);
            datos[3]=rs.getString(4);

            Productos.addRow(datos);
            }
            productostbl.setModel(Productos);
            }catch(SQLException ex){
            Logger.getLogger(control_stock.class.getName()).log(Level.SEVERE,null,ex);
            JOptionPane.showMessageDialog(null, "error "+ex);
            }
        }
        
        
      
    private void reportebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reportebtnActionPerformed
        // TODO add your handling code here:
        Connection cn;
        cn = MyConnection.getConnection();
        try{
          JasperReport jr = (JasperReport) JRLoader.loadObject(control_stock.class.getResource("/reportes/stock.jasper"));
          Map parametros = new HashMap<>();
          parametros.put("Titulo", "Reporte producto");
            

          JasperPrint jp = JasperFillManager.fillReport(jr, parametros, cn);
          JasperViewer jv = new JasperViewer(jp, false);
          jv.setVisible(true); 
        }
        catch (JRException ex) {
            JOptionPane.showMessageDialog(rootPane, ex);
        }
    }//GEN-LAST:event_reportebtnActionPerformed

    private void btn_ModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ModificarActionPerformed
     
        String id = (String)Productos.getValueAt(productostbl.getSelectedRow(),0);
        String prec = txt_precio.getText();
        String stock = stock_txt.getText();
        
        PreparedStatement ps;
        String query = "UPDATE Producto SET Precio=?, stock=? WHERE Codigo=?";
        try {
        
            ps = MyConnection.getConnection().prepareStatement(query);
            
            ps.setString(3, id);
            ps.setString(1, prec);
            ps.setString(2, stock);

            ps.executeUpdate();
                JOptionPane.showMessageDialog(null, " Stock Modificado");
                Limpiar();
                Mostrardatos("");
                
        } catch (SQLException ex) {
            Logger.getLogger(control_stock.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "error "+ex);
        }
    }//GEN-LAST:event_btn_ModificarActionPerformed

    
    private void Seleccionar(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Seleccionar
         
        try {  
        String prec = (String) Productos.getValueAt(productostbl.getSelectedRow(),2);
        String stock = (String) Productos.getValueAt(productostbl.getSelectedRow(),3);
    

        txt_precio.setText(prec);
        stock_txt.setText(stock);
        
        }
        catch (Exception ex){
        JOptionPane.showMessageDialog(null, "error "+ex);
        }
    }//GEN-LAST:event_Seleccionar

    private void backbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backbtnActionPerformed
//        este botón lleva al menu de administrador
         menu_admin mf = new menu_admin ();
                mf.setVisible(true);
                mf.pack();
                mf.setLocationRelativeTo(null);
                
                this.dispose();
    }//GEN-LAST:event_backbtnActionPerformed

   
    public static void main(String args[]) {
       
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(control_stock.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(() -> {
            new control_stock().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backbtn;
    private javax.swing.JButton btn_Modificar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel preciolbl;
    private javax.swing.JTable productostbl;
    private javax.swing.JButton reportebtn;
    private javax.swing.JTextField stock_txt;
    private javax.swing.JTextField txt_precio;
    // End of variables declaration//GEN-END:variables
}
