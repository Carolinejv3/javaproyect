
package loginusuario;

import CODE.MyConnection;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class buscar extends javax.swing.JFrame {

  
    
    DefaultTableModel Buscar;
            
    public buscar() {
        initComponents();
        
        this.Buscar = (DefaultTableModel) buscar_tbl.getModel ();
        Mostrardatos ("");
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        whitepanel = new javax.swing.JPanel();
        buscador_lbl = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        buscar_txt = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        buscar_tbl = new javax.swing.JTable();
        aceptar_btn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        whitepanel.setBackground(new java.awt.Color(255, 255, 255));

        buscador_lbl.setFont(new java.awt.Font("Trebuchet MS", 0, 36)); // NOI18N
        buscador_lbl.setText("BUSCADOR");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/loginusuario/img/lupa1.png"))); // NOI18N

        buscar_txt.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        buscar_txt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                Busqueda(evt);
            }
        });

        buscar_tbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(buscar_tbl);

        aceptar_btn.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        aceptar_btn.setText("Aceptar");
        aceptar_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aceptar_btnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout whitepanelLayout = new javax.swing.GroupLayout(whitepanel);
        whitepanel.setLayout(whitepanelLayout);
        whitepanelLayout.setHorizontalGroup(
            whitepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(whitepanelLayout.createSequentialGroup()
                .addGroup(whitepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(whitepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(whitepanelLayout.createSequentialGroup()
                            .addGap(238, 238, 238)
                            .addComponent(buscador_lbl))
                        .addGroup(whitepanelLayout.createSequentialGroup()
                            .addGap(115, 115, 115)
                            .addComponent(jLabel1)
                            .addGap(18, 18, 18)
                            .addComponent(buscar_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, whitepanelLayout.createSequentialGroup()
                            .addGap(117, 117, 117)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(whitepanelLayout.createSequentialGroup()
                        .addGap(305, 305, 305)
                        .addComponent(aceptar_btn)))
                .addContainerGap(104, Short.MAX_VALUE))
        );
        whitepanelLayout.setVerticalGroup(
            whitepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(whitepanelLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(buscador_lbl)
                .addGap(31, 31, 31)
                .addGroup(whitepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(buscar_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(49, 49, 49)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(aceptar_btn)
                .addContainerGap(43, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(whitepanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(whitepanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
   public void Limpiar(){
        try{
     buscar_txt.setText("");
    
        }
        catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "error "+ex);
    }
    }
    
    
     public void RefrescarTabla(){
        try{
            
            Buscar.setColumnCount(0);
            Buscar.setRowCount(0);
            buscar_tbl.revalidate();
        }
         catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "error "+ex);
         }  
    }
     
    public final void Mostrardatos(String valor){
        
        MyConnection cc=new MyConnection();
            Connection cn=MyConnection.getConnection();
            RefrescarTabla();
            Buscar.addColumn("Codigo");
            Buscar.addColumn("Nombre");
            Buscar.addColumn("Precio");
            Buscar.addColumn("Stock");
            
            this.buscar_tbl.setModel(Buscar);
            String sql;
            if (valor.equals(""))
            {
            sql="SELECT * FROM producto";
            }
            else{
            sql="SELECT * FROM producto WHERE Nombre like '%"+valor+"%'";
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

            Buscar.addRow(datos);
            }
            buscar_tbl.setModel(Buscar);
            }catch(SQLException ex){
            Logger.getLogger(buscar.class.getName()).log(Level.SEVERE,null,ex);
            JOptionPane.showMessageDialog(null, "error "+ex);
            }
        }



    private void aceptar_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aceptar_btnActionPerformed
//         TODO add your handling code here:

                if(buscar_tbl.getSelectedRow() >=0){
                    
                    try{
        DefaultTableModel tp = (DefaultTableModel) buscar_tbl.getModel();
    
                        
        String id = (String) Buscar.getValueAt(buscar_tbl.getSelectedRow(),0);
        String nom = (String) Buscar.getValueAt(buscar_tbl.getSelectedRow(),1);
        String prec = (String) Buscar.getValueAt(buscar_tbl.getSelectedRow(),2);
        String stock = (String) Buscar.getValueAt(buscar_tbl.getSelectedRow(),3);
    


        venta_admin.nombre_txt.setText(nom);
        venta_admin.precio_txt.setText(prec);
        venta_admin.stock_txt.setText(stock);
         venta_admin.txt_cod.setText(id);
//        venta_admin.txt_cantidad.setText(can);
          this.dispose();
        }
        catch (Exception ex){
        JOptionPane.showMessageDialog(null, "error "+ex);
        }
                    }
    }//GEN-LAST:event_aceptar_btnActionPerformed

    private void Busqueda(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Busqueda
//        realiza la busqueda en el textfield y la muestra 
        try {
            if(evt.getKeyCode() == KeyEvent.VK_ENTER) {
        String B = buscar_txt.getText()+"";
        Mostrardatos(B);
            }   
        }
        catch (Exception ex){
        JOptionPane.showMessageDialog(null, "error "+ex);
        }
    }//GEN-LAST:event_Busqueda

   
    public static void main(String args[]) {
      
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(buscar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(buscar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(buscar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(buscar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new buscar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JButton aceptar_btn;
    private javax.swing.JLabel buscador_lbl;
    private javax.swing.JTable buscar_tbl;
    private javax.swing.JTextField buscar_txt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel whitepanel;
    // End of variables declaration//GEN-END:variables

   
}
