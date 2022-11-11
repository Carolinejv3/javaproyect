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

//se declara la clase y la jtable
public class control_productos extends javax.swing.JFrame {

    DefaultTableModel Productos;
    
    public control_productos() {
        initComponents();
        
        this.Productos = (DefaultTableModel) productostbl.getModel();
        
        Mostrardatos("");
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        productolbl = new javax.swing.JLabel();
        nombrelbl = new javax.swing.JLabel();
        nombretxt = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        reportebtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        productostbl = new javax.swing.JTable();
        preciolbl = new javax.swing.JLabel();
        txt_precio = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        stock_txt = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        backbtn = new javax.swing.JButton();
        whitepanel = new javax.swing.JPanel();
        insertarboton = new javax.swing.JButton();
        btn_Modificar = new javax.swing.JButton();
        eliminarbtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        productolbl.setFont(new java.awt.Font("Microsoft YaHei UI Light", 1, 17)); // NOI18N
        productolbl.setText("DATOS DEL PRODUCTO");
        getContentPane().add(productolbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(395, 73, 221, -1));

        nombrelbl.setFont(new java.awt.Font("Microsoft JhengHei Light", 3, 14)); // NOI18N
        nombrelbl.setText("NOMBRE:");
        getContentPane().add(nombrelbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(68, 176, 78, -1));

        nombretxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                keypre(evt);
            }
        });
        getContentPane().add(nombretxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 173, 194, 30));

        jLabel1.setFont(new java.awt.Font("Microsoft YaHei Light", 1, 17)); // NOI18N
        jLabel1.setText("LISTA DE PRODUCTOS");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 348, -1, -1));

        reportebtn.setBackground(new java.awt.Color(255, 255, 153));
        reportebtn.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        reportebtn.setText("REPORTE");
        reportebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reportebtnActionPerformed(evt);
            }
        });
        getContentPane().add(reportebtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(522, 596, -1, -1));

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

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 402, -1, 252));

        preciolbl.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 3, 14)); // NOI18N
        preciolbl.setText("PRECIO:");
        getContentPane().add(preciolbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(354, 196, 58, -1));

        txt_precio.setFont(new java.awt.Font("Microsoft JhengHei Light", 0, 14)); // NOI18N
        getContentPane().add(txt_precio, new org.netbeans.lib.awtextra.AbsoluteConstraints(416, 190, 200, 30));

        jLabel2.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 3, 14)); // NOI18N
        jLabel2.setText("STOCK:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(68, 234, 78, -1));

        stock_txt.setFont(new java.awt.Font("Microsoft JhengHei Light", 0, 14)); // NOI18N
        getContentPane().add(stock_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 228, 194, 30));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/loginusuario/img/logo celucel1.jpg"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(157, 11, -1, -1));

        backbtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/loginusuario/img/backicon.png"))); // NOI18N
        backbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backbtnActionPerformed(evt);
            }
        });
        getContentPane().add(backbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 65, -1, -1));

        whitepanel.setBackground(new java.awt.Color(255, 255, 255));

        insertarboton.setBackground(new java.awt.Color(255, 153, 153));
        insertarboton.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        insertarboton.setText("Insertar");
        insertarboton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insertarbotonActionPerformed(evt);
            }
        });

        btn_Modificar.setBackground(new java.awt.Color(153, 153, 255));
        btn_Modificar.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        btn_Modificar.setText("Modificar");
        btn_Modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ModificarActionPerformed(evt);
            }
        });

        eliminarbtn.setBackground(new java.awt.Color(204, 0, 0));
        eliminarbtn.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        eliminarbtn.setText("Eliminar");
        eliminarbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarbtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout whitepanelLayout = new javax.swing.GroupLayout(whitepanel);
        whitepanel.setLayout(whitepanelLayout);
        whitepanelLayout.setHorizontalGroup(
            whitepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(whitepanelLayout.createSequentialGroup()
                .addGap(95, 95, 95)
                .addComponent(insertarboton)
                .addGap(68, 68, 68)
                .addComponent(btn_Modificar)
                .addGap(71, 71, 71)
                .addComponent(eliminarbtn)
                .addContainerGap(137, Short.MAX_VALUE))
        );
        whitepanelLayout.setVerticalGroup(
            whitepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(whitepanelLayout.createSequentialGroup()
                .addGap(288, 288, 288)
                .addGroup(whitepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(insertarboton)
                    .addComponent(btn_Modificar)
                    .addComponent(eliminarbtn))
                .addContainerGap(363, Short.MAX_VALUE))
        );

        getContentPane().add(whitepanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 670, 680));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
//    este método sirve para limpiar los textfield
public void Limpiar(){
        try{
     nombretxt.setText("");
     txt_precio.setText("");
     stock_txt.setText("");
     
        }
            catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "error "+ex);
        }
    }

//   este método sirve para  organizar, revalidar y refrescar los datos de la jtable
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
        
//       Este método sirve para mostrar los datos de la base de datos en la jtable, estableciendo la conexión con la 
//       base de datos y elquery que seleccione todos los atributos de la tabla productos. 
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
            sql="SELECT * FROM producto";
            }
            else{
            sql="SELECT * FROM producto WHERE Codigo='"+valor+"'";
            } 
            
            
//            aquí se utiliza el result set para que devuelva los valores de las filas de la tabla seleccionada para 
//            la consulta en el orden seleccionado. el getString está hecho para obtener los valores de tipo varchar o char
//              aunque se utiliza comunmente con otros tipos
            String []datos=new String [4];
            try{
            Statement st=cn.createStatement();
            ResultSet rs=st.executeQuery(sql);
            while(rs.next()){
            datos[0]=rs.getString(1);
            datos[1]=rs.getString(2);
            datos[2]=rs.getString(3);
            datos[3]=rs.getString(4);
            
//            se le indica que agregue la fila a la tabla con la variable "datos"
            Productos.addRow(datos); 
            }
            productostbl.setModel(Productos);
            }catch(SQLException ex){
            Logger.getLogger(control_productos.class.getName()).log(Level.SEVERE,null,ex);
            JOptionPane.showMessageDialog(null, "error "+ex);
            }
        }
        
        
//      el metodo estbalecido para realizar el reporte de el control de productos dentro de un botón.
    private void reportebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reportebtnActionPerformed
        // TODO add your handling code here:
        Connection cn;
        cn = MyConnection.getConnection();
        try{
          JasperReport jr = (JasperReport) JRLoader.loadObject(control_productos.class.getResource("/reportes/report1.jasper"));
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

    
    private void keypre(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_keypre
        // TODO add your handling code here:
        try {
            if(evt.getKeyCode() == KeyEvent.VK_ENTER) {
        String B =nombretxt.getText()+"";
        Mostrardatos(B);
            }   
        }
        catch (Exception ex){
        JOptionPane.showMessageDialog(null, "error "+ex);
        }
    }//GEN-LAST:event_keypre

    
//    este método sirve para que al seleccionar algo en la tabla, al mismo tiempo se rellenen en los textfields.
    private void Seleccionar(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Seleccionar
         
        try {  
        String id = (String) Productos.getValueAt(productostbl.getSelectedRow(),0);
        String nom = (String) Productos.getValueAt(productostbl.getSelectedRow(),1);
        String prec = (String) Productos.getValueAt(productostbl.getSelectedRow(),2);
        String stock = (String) Productos.getValueAt(productostbl.getSelectedRow(),3);
    


        nombretxt.setText(nom);
        txt_precio.setText(prec);
        stock_txt.setText(stock);
        
        }
        catch (Exception ex){
        JOptionPane.showMessageDialog(null, "error "+ex);
        }
    }//GEN-LAST:event_Seleccionar

    private void backbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backbtnActionPerformed
//        este botón lleva hacia el menú de administrador.
         menu_admin mf = new menu_admin ();
                mf.setVisible(true);
                mf.pack();
                mf.setLocationRelativeTo(null);
                
                this.dispose();
    }//GEN-LAST:event_backbtnActionPerformed

    private void eliminarbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarbtnActionPerformed
//        este método sirve para eliminar el producto seleccionado. Como se ha visto anteriormente, gracias a las consultas
//        se pueden eliminar estos productos de la base de datos. Aquí se establece que luego de que se elimine elproducto,
//        con el método de limpiar, se limpiaran los textfields y luego con el mostrar datos se mostrarán los cambios en la base 
//        de datos.
        String id = (String)
        Productos.getValueAt(productostbl.getSelectedRow(),0);

        PreparedStatement ps;
        String query = "DELETE FROM Producto WHERE Codigo=?";
        try {
            ps = MyConnection.getConnection().prepareStatement(query);

            ps.setString(1, id);

            if(ps.executeUpdate() > 0)
            {

                JOptionPane.showMessageDialog(null, "Producto Eliminado");
                Limpiar();
                Mostrardatos("");
            }

        } catch (SQLException ex) {
            Logger.getLogger(control_productos.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "error "+ex);
        }
    }//GEN-LAST:event_eliminarbtnActionPerformed

    private void btn_ModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ModificarActionPerformed
//      Nuevamente, con las consultas podemos llevar a cabo un update que al seleccionar el producto, y hacer algún cambio en
//      los textfields se podrá llevar a cabo. Al igual que con el método de eliminar, luego de realizar la acción,
//      se limpian los textfields y se muestran los cambios con el mostrar datos.
        String id = (String)Productos.getValueAt(productostbl.getSelectedRow(),0);
        String nom = nombretxt.getText();
        String prec = txt_precio.getText();
        String stock = stock_txt.getText();

        PreparedStatement ps;
        String query = "UPDATE Producto SET Nombre=?, Precio=?, stock=? WHERE Codigo=?";
        try {

            ps = MyConnection.getConnection().prepareStatement(query);

            ps.setString(4, id);
            ps.setString(1, nom);
            ps.setString(2, prec);
            ps.setString(3, stock);

            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, " Producto Modificado");
            Limpiar();
            Mostrardatos("");

        } catch (SQLException ex) {
            Logger.getLogger(control_productos.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "error "+ex);
        }
    }//GEN-LAST:event_btn_ModificarActionPerformed

    private void insertarbotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insertarbotonActionPerformed
//        Hasta ahora todo sigue siendo muy similar, simplemente la consulta cambia a un insert, en donde se establecen 
//        los valores a rellenar y luego con un setString establece los valores de las variables nom, prec y stock. 
//        se limpia la tabla y se muestran los datos.

        String nom = nombretxt.getText();
        String prec = txt_precio.getText();
        String stock = stock_txt.getText();

        PreparedStatement ps;
        String query = "INSERT INTO `producto`(`Nombre`, `Precio`, `stock`) VALUES (?,?,?)";
        try {
            ps = MyConnection.getConnection().prepareStatement(query);

            ps.setString(1, nom);
            ps.setString(2, prec);
            ps.setString(3, stock);

            if(ps.executeUpdate() > 0)
            {
                JOptionPane.showMessageDialog(null, "Nuevo producto Agregado");
                Mostrardatos("");
                Limpiar();
            }

        } catch (SQLException ex) {
            Logger.getLogger(control_productos.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "error "+ex);
        }

    }//GEN-LAST:event_insertarbotonActionPerformed

    public static void main(String args[]) {
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(control_productos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(() -> {
            new control_productos().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backbtn;
    private javax.swing.JButton btn_Modificar;
    private javax.swing.JButton eliminarbtn;
    private javax.swing.JButton insertarboton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel nombrelbl;
    private javax.swing.JTextField nombretxt;
    private javax.swing.JLabel preciolbl;
    private javax.swing.JLabel productolbl;
    private javax.swing.JTable productostbl;
    private javax.swing.JButton reportebtn;
    private javax.swing.JTextField stock_txt;
    private javax.swing.JTextField txt_precio;
    private javax.swing.JPanel whitepanel;
    // End of variables declaration//GEN-END:variables
}
