
package loginusuario;

import CODE.modelo_factura;
import CODE.clase_guardar_venta;
import CODE.guardar_detalle_venta;
import CODE.MyConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.*;
import java.text.SimpleDateFormat;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;


//se declara la clase y las variables. 
public class venta_admin extends javax.swing.JFrame implements Runnable {
    String hora,minutos,segundos;
    Thread hilo;

//    en el paquete de CODE se encuentran estas clases declaradas. Aquí se llaman.
    clase_guardar_venta Factu = new clase_guardar_venta(); 
    guardar_detalle_venta dv = new guardar_detalle_venta();
    modelo_factura gFactu = new modelo_factura();
    
//    se declara la tabla y la cantidad de objetos
    DefaultTableModel modelo;
    Object[]ob=new Object [5];
    public venta_admin() {
        
        initComponents();
        
//        código de la fecha y hora

        this.modelo = (DefaultTableModel)venta_tbl.getModel();
        Mostrardatos("");
        this.setLocationRelativeTo(null);       
        fecha_txt.setText(Fecha());
        hilo = new Thread (this);
        hilo.start();
        setVisible(true);
        generarIdFact();
        SetFacturaID();
        
    }
    
//    este método se encarga de sumar los subtotales de los artículos con un ciclo for que va sumando cuando se agrega
//    otro subtotal.
   public float sumar_subtotales() {
        float contar = venta_tbl.getRowCount();
        float subtotal = 0;
        for (int i = 0; i < contar; i++) {
            subtotal = subtotal + Float.parseFloat(venta_tbl.getValueAt(i, 4).toString());
        }
        return subtotal;
    }
   
   
  
//    aquí se establece el ID de la factura en el textfield y se va sumando por cada una que se genere nueva
    final void SetFacturaID() {
        String old_id_fact = facturanum_txt.getText();
        int sum_id_fact = (int) Integer.parseInt(old_id_fact) + 1;
        String sum_string = String.valueOf(sum_id_fact);
        facturanum_txt.setText(sum_string);
    }

//    aquí se genera el ID o numero de serie y su incremento
    final void generarIdFact() {
        String serie = SetIdFact();
        if (serie == null) {

            facturanum_txt.setText("1");

        } else {
            int incrementar = Integer.parseInt(serie);

            facturanum_txt.setText(String.valueOf(incrementar));
        }

      }
//     aquí se hace el query que seleccione el maximo numero de ventas de la tabla ventas, para que cuando se haga una venta, sevya renovando el ID.
    
    public String SetIdFact() {
        String serie = "";
        String sql = "SELECT MAX(ID_ventas) FROM ventas";

        try {

            MyConnection cc = new MyConnection();
            Connection con = MyConnection.getConnection();
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs;
            rs = ps.executeQuery();

            while (rs.next()) {
                serie = rs.getString(1);

            }

        } catch (SQLException ex) {
            Logger.getLogger(venta_admin.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Error: " + ex);
        }

        return serie;
    }
    
//        aquí se empieza a establecer la fecha y hora en los textfields
        public static String Fecha(){
            Date fecha = new Date();
            SimpleDateFormat formatofecha=new SimpleDateFormat("YYYY/MM/dd");
            return formatofecha.format(fecha);
        }
        
        public void hora(){
            Calendar calendario = new GregorianCalendar();
            Date horaactual = new Date();
            calendario.setTime(horaactual);
            hora= calendario.get(Calendar.HOUR_OF_DAY)>9?""+calendario.get(Calendar.HOUR_OF_DAY): "0"+calendario.get(Calendar.HOUR_OF_DAY);
            minutos = calendario.get(Calendar.MINUTE)>9?""+calendario.get(Calendar.MINUTE): "0"+calendario.get(Calendar.MINUTE);
            segundos = calendario.get(Calendar.SECOND)>9?""+calendario.get(Calendar.SECOND): "0"+calendario.get(Calendar.SECOND);
        }
            
        
            public void run(){
                //while
                Thread current = Thread.currentThread();
                while(current==hilo){
                    hora();
                    hora_txt.setText(hora+":"+minutos+":"+segundos);
                }
            }
            
            
//        muestra los datos de la tabla
        public final void Mostrardatos(String valor){
            
            MyConnection cc=new MyConnection();
            Connection cn=MyConnection.getConnection();
           
            modelo.addColumn("Codigo");
            modelo.addColumn("Nombre");
            modelo.addColumn("Precio");
            modelo.addColumn("Cantidad");
            modelo.addColumn("Total");
  
            
            this.venta_tbl.setModel(modelo);
        }
       
//        limpia la tabla
//        public void LimpiarTabla(){
//            for(int i = 0; i < modelo.getRowCount(); i++){
//                modelo.removeRow(i);
//                i =i - 1;
//            }
//        }
//        
//        limpia los textfields
        public void LimpiarCampos(){
        
        
        nombre_txt.setText("");
        precio_txt.setText("");
        txt_cod.setText("");
        txt_cantidad.setText("");
        stock_txt.setText("");
        
        }
         public void RefrescarTabla(){
        try{
            
            modelo.setColumnCount(0);
            modelo.setRowCount(0);
            venta_tbl.revalidate();
        }
         catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "error "+ex);
         }  
    }
         
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        whitepanel = new javax.swing.JPanel();
        ventalbl = new javax.swing.JLabel();
        agregar_btn = new javax.swing.JButton();
        txt_cantidad = new javax.swing.JTextField();
        cantidadlbl = new javax.swing.JLabel();
        lbl_img = new javax.swing.JLabel();
        back_btn = new javax.swing.JButton();
        bolsa_lbl = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        buscador_btn = new javax.swing.JButton();
        facturadopor_lbl = new javax.swing.JLabel();
        facturadopor_txt = new javax.swing.JTextField();
        cancelar_lbl = new javax.swing.JLabel();
        cancelar_btn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        venta_tbl = new javax.swing.JTable();
        agregar_lbl = new javax.swing.JLabel();
        total_txt = new javax.swing.JTextField();
        total_lbl = new javax.swing.JLabel();
        nombre_txt = new javax.swing.JTextField();
        nombre_lbl = new javax.swing.JLabel();
        facturanum_txt = new javax.swing.JTextField();
        factura_lbl = new javax.swing.JLabel();
        fecha_txt = new javax.swing.JTextField();
        fecha_lbl = new javax.swing.JLabel();
        precio_lbl = new javax.swing.JLabel();
        precio_txt = new javax.swing.JTextField();
        guardarfac_btn = new javax.swing.JButton();
        hora_txt = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        stock_txt = new javax.swing.JTextField();
        stock_lbl = new javax.swing.JLabel();
        txt_cod = new javax.swing.JTextField();
        cantidadlbl1 = new javax.swing.JLabel();
        nuevafac = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        whitepanel.setBackground(new java.awt.Color(255, 255, 255));
        whitepanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ventalbl.setFont(new java.awt.Font("MS PGothic", 1, 24)); // NOI18N
        ventalbl.setText("SISTEMA DE VENTAS");
        whitepanel.add(ventalbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(593, 11, -1, -1));

        agregar_btn.setBackground(new java.awt.Color(102, 255, 102));
        agregar_btn.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        agregar_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/loginusuario/img/vendericono2.png"))); // NOI18N
        agregar_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregar_btnActionPerformed(evt);
            }
        });
        whitepanel.add(agregar_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 580, 65, -1));

        txt_cantidad.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        whitepanel.add(txt_cantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 380, 130, 36));

        cantidadlbl.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        cantidadlbl.setText("Cantidad:");
        whitepanel.add(cantidadlbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 370, 91, -1));

        lbl_img.setIcon(new javax.swing.ImageIcon(getClass().getResource("/loginusuario/img/logo celucel1.jpg"))); // NOI18N
        whitepanel.add(lbl_img, new org.netbeans.lib.awtextra.AbsoluteConstraints(148, 11, -1, -1));

        back_btn.setBackground(new java.awt.Color(255, 255, 255));
        back_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/loginusuario/img/backicon.png"))); // NOI18N
        back_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                back_btnActionPerformed(evt);
            }
        });
        whitepanel.add(back_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(38, 27, 92, -1));

        bolsa_lbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/loginusuario/img/bolsa1.png"))); // NOI18N
        whitepanel.add(bolsa_lbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 157, -1, -1));

        jLabel1.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 24)); // NOI18N
        jLabel1.setText("DATOS DE PRODUCTO");
        whitepanel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(148, 157, -1, -1));

        buscador_btn.setBackground(new java.awt.Color(255, 153, 153));
        buscador_btn.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        buscador_btn.setText("Buscar producto");
        buscador_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscador_btnActionPerformed(evt);
            }
        });
        whitepanel.add(buscador_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(132, 201, -1, 40));

        facturadopor_lbl.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        facturadopor_lbl.setText("Facturado por:");
        whitepanel.add(facturadopor_lbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 510, -1, -1));

        facturadopor_txt.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        whitepanel.add(facturadopor_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 510, 184, 33));

        cancelar_lbl.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        cancelar_lbl.setText("CANCELAR");
        whitepanel.add(cancelar_lbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 560, -1, -1));

        cancelar_btn.setBackground(new java.awt.Color(255, 0, 0));
        cancelar_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/loginusuario/img/cancelar1.png"))); // NOI18N
        cancelar_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelar_btnActionPerformed(evt);
            }
        });
        whitepanel.add(cancelar_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 580, 70, 60));

        venta_tbl.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        venta_tbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(venta_tbl);

        whitepanel.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 160, 645, -1));

        agregar_lbl.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        agregar_lbl.setText("AGREGAR");
        whitepanel.add(agregar_lbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 560, -1, -1));

        total_txt.setEditable(false);
        whitepanel.add(total_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 580, 320, 36));

        total_lbl.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        total_lbl.setText("TOTAL A PAGAR:");
        whitepanel.add(total_lbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 590, -1, -1));

        nombre_txt.setEditable(false);
        nombre_txt.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        whitepanel.add(nombre_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 270, 231, 39));

        nombre_lbl.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        nombre_lbl.setText("Nombre:");
        whitepanel.add(nombre_lbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, -1, -1));

        facturanum_txt.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        whitepanel.add(facturanum_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(546, 85, 86, -1));

        factura_lbl.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        factura_lbl.setText("FACTURA No.");
        whitepanel.add(factura_lbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(421, 88, -1, -1));

        fecha_txt.setEditable(false);
        fecha_txt.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        whitepanel.add(fecha_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(728, 85, 120, -1));

        fecha_lbl.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        fecha_lbl.setText("FECHA:");
        whitepanel.add(fecha_lbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(661, 88, -1, -1));

        precio_lbl.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        precio_lbl.setText("Precio:");
        whitepanel.add(precio_lbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 330, -1, -1));

        precio_txt.setEditable(false);
        precio_txt.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        whitepanel.add(precio_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 330, 128, 37));

        guardarfac_btn.setBackground(new java.awt.Color(204, 153, 255));
        guardarfac_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/loginusuario/img/guardar.png"))); // NOI18N
        guardarfac_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarfac_btnActionPerformed(evt);
            }
        });
        whitepanel.add(guardarfac_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 320, 83, -1));

        hora_txt.setEditable(false);
        hora_txt.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        whitepanel.add(hora_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(866, 85, 108, -1));
        whitepanel.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 440, 370, 20));

        stock_txt.setEditable(false);
        stock_txt.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        whitepanel.add(stock_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 460, 140, 30));

        stock_lbl.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        stock_lbl.setText("Stock:");
        whitepanel.add(stock_lbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 470, -1, -1));

        txt_cod.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        whitepanel.add(txt_cod, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 350, 130, 36));

        cantidadlbl1.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        cantidadlbl1.setText("Codigo:");
        whitepanel.add(cantidadlbl1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 320, 91, -1));

        nuevafac.setForeground(new java.awt.Color(153, 255, 153));
        nuevafac.setIcon(new javax.swing.ImageIcon(getClass().getResource("/loginusuario/img/masbtn.png"))); // NOI18N
        nuevafac.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nuevafacActionPerformed(evt);
            }
        });
        whitepanel.add(nuevafac, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 230, 80, 70));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(whitepanel, javax.swing.GroupLayout.DEFAULT_SIZE, 1210, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(whitepanel, javax.swing.GroupLayout.PREFERRED_SIZE, 709, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

   
    private void agregar_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregar_btnActionPerformed

        agregarProducto();
    }//GEN-LAST:event_agregar_btnActionPerformed
//    Este método permite que se traspasen los valores de los textfields a la tabla temporal y declara los objetos 
    void agregarProducto(){
        double total;   
        int id = Integer.parseInt(txt_cod.getText());
        String nom = nombre_txt.getText();
        int prec =Integer.parseInt( precio_txt.getText());
        int can= Integer.parseInt(txt_cantidad.getText());
        int stock=Integer.parseInt(stock_txt.getText());
        total=can*prec;
        
        int t_prec = prec;
        String t_total = String.valueOf(total);
        if(stock>0){
            ob[0] = id;
            ob[1] = nom;
            ob[2] = t_prec;
            ob[3] = can;
            ob[4] = t_total;
            
            modelo.addRow(ob);
           total_txt.setText("$" + sumar_subtotales());
           LimpiarCampos();
        }else{
            JOptionPane.showMessageDialog(this, "Producto fuera de stock");
        }
        
      
     }
     
     public static void Imprimir(){
           int idfactura = Integer.parseInt(facturanum_txt.getText());
        Connection cn=MyConnection.getConnection();
        try{
            JasperReport jr = (JasperReport) JRLoader.loadObject(venta_admin.class.getResource("/reportes/venta.jasper"));
            Map parametros = new HashMap<>();
            parametros.put("factu", idfactura);

            JasperPrint jp = JasperFillManager.fillReport(jr, parametros, cn);
            JasperViewer jv = new JasperViewer(jp, false);
            jv.setVisible(true);
        }
        catch (JRException ex) {
          Logger.getLogger(venta_admin.class.getName()).log(Level.SEVERE, null, ex);

        }
     }
     
     
    private void back_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_back_btnActionPerformed
        // este botón lleva hacia el menu de administrador
            menu_admin mf = new menu_admin ();
                mf.setVisible(true);
                mf.pack();
                mf.setLocationRelativeTo(null);
                
                this.dispose();
    }//GEN-LAST:event_back_btnActionPerformed

    private void buscador_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscador_btnActionPerformed
        // este botón lleva hacia el form de buscar, en donde sebuscan los productos y se seleccionan

        buscar mf = new buscar ();
        mf.setVisible(true);
        mf.pack();
        mf.setLocationRelativeTo(null);

       

    }//GEN-LAST:event_buscador_btnActionPerformed

    public void limpiarcampos2(){
    
        total_txt.setText("");
        facturadopor_txt.setText("");
    
    }
    
    
    private void guardarfac_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarfac_btnActionPerformed
       
//          en este botón se llevan a cabo los procesos de guardar la factura, su detalle, limpiar los campos y mostrar el reporte. En caso de que se clickee 
//          y estén los registros vacios, se mostrará un mensaje con una restricción para llevar a cabo la acción. 
             if( venta_tbl.getRowCount() <= 0 ){
           
            JOptionPane.showMessageDialog(null, "No hay productos que facturar. Facture más productos.");
        
                }else{
               
               guardarFactura();
               guardarDetalleFactura();
               LimpiarCampos();
               RefrescarTabla();
               limpiarcampos2();
                for (int i = 0; i < ob.length; i++) {
                    ob[i] = "";
        
                 }
           

                   Mostrardatos(""); 
                   Imprimir();
          
        }
        
                                  
    }//GEN-LAST:event_guardarfac_btnActionPerformed
//   en guardar factura y guardar detalle se establecen los valores que se van a guardar y se llaman los métodos para que se ejecuten.
    void guardarFactura(){
   
   
      float t_total = Float.parseFloat(total_txt.getText().substring(1));
   
      Factu.setTotal(t_total);
      Factu.setFacturado_por(facturadopor_txt.getText());
      
      gFactu.GuardarFactura(Factu);
   }
   
   void guardarDetalleFactura(){
            
       int id_fact = Integer.parseInt(facturanum_txt.getText());
       for (int i = 0; i < venta_tbl.getRowCount(); i++){
           
           int id_p = Integer.parseInt(venta_tbl.getValueAt(i,0).toString());
           int cantidad = Integer.parseInt(venta_tbl.getValueAt(i,3).toString());
           float importe = Float.parseFloat(venta_tbl.getValueAt(i,4).toString());
           String nombre = String.valueOf(venta_tbl.getValueAt(i,1).toString());
           int precio = Integer.parseInt(venta_tbl.getValueAt(i,2).toString());
           
           dv.setCodigo(id_p);
           dv.setNombre_prod(nombre);
           dv.setPrecio(precio);
           dv.setCantidad(cantidad);
           dv.setMonto_pro(importe);
           
           dv.setId_venta(id_fact);
           gFactu.GuardarDetalleVenta(dv);
       }
   
   }
  
    
    private void cancelar_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelar_btnActionPerformed
        // este botón permite que se elimine un registro de la tabla temporal antes de guardarla en la base de datos.
     if (venta_tbl.getSelectedRow() >= 0) {
            modelo.removeRow(venta_tbl.getSelectedRow());
          
          
          
            total_txt.setText(String.valueOf("$" + sumar_subtotales()));
        } else {
            JOptionPane.showMessageDialog(null, "Selecciona un registro para borrar.");
        }
    }//GEN-LAST:event_cancelar_btnActionPerformed

//    aquí se llaman los métodos de generar nueva factura y ID 
    private void nuevafacActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nuevafacActionPerformed
               generarIdFact();
               SetFacturaID();
  
    }//GEN-LAST:event_nuevafacActionPerformed

   
    public static void main(String args[]) {
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(venta_admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(venta_admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(venta_admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(venta_admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new venta_admin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton agregar_btn;
    private javax.swing.JLabel agregar_lbl;
    private javax.swing.JButton back_btn;
    private javax.swing.JLabel bolsa_lbl;
    private javax.swing.JButton buscador_btn;
    public static javax.swing.JButton cancelar_btn;
    private javax.swing.JLabel cancelar_lbl;
    private javax.swing.JLabel cantidadlbl;
    private javax.swing.JLabel cantidadlbl1;
    private javax.swing.JLabel factura_lbl;
    private javax.swing.JLabel facturadopor_lbl;
    public static javax.swing.JTextField facturadopor_txt;
    public static javax.swing.JTextField facturanum_txt;
    private javax.swing.JLabel fecha_lbl;
    private javax.swing.JTextField fecha_txt;
    private javax.swing.JButton guardarfac_btn;
    private javax.swing.JTextField hora_txt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lbl_img;
    private javax.swing.JLabel nombre_lbl;
    public static javax.swing.JTextField nombre_txt;
    private javax.swing.JButton nuevafac;
    private javax.swing.JLabel precio_lbl;
    public static javax.swing.JTextField precio_txt;
    private javax.swing.JLabel stock_lbl;
    public static javax.swing.JTextField stock_txt;
    private javax.swing.JLabel total_lbl;
    public static javax.swing.JTextField total_txt;
    public static javax.swing.JTextField txt_cantidad;
    public static javax.swing.JTextField txt_cod;
    private javax.swing.JTable venta_tbl;
    private javax.swing.JLabel ventalbl;
    private javax.swing.JPanel whitepanel;
    // End of variables declaration//GEN-END:variables
//
//    @Override
//    public void run() {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
}
