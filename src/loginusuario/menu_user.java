
package loginusuario;


public class menu_user extends javax.swing.JFrame {

    public menu_user() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpanelwhite = new javax.swing.JPanel();
        mainlbl = new javax.swing.JLabel();
        adminbtn = new javax.swing.JButton();
        controlproductolbl = new javax.swing.JLabel();
        backbtn = new javax.swing.JButton();
        venta_btn = new javax.swing.JButton();
        venta_lbl = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jpanelwhite.setBackground(new java.awt.Color(255, 255, 255));

        mainlbl.setFont(new java.awt.Font("Malgun Gothic", 1, 18)); // NOI18N
        mainlbl.setText("MENU USUARIO");

        adminbtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        adminbtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/loginusuario/img/productoicon.png"))); // NOI18N
        adminbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adminbtnActionPerformed(evt);
            }
        });

        controlproductolbl.setFont(new java.awt.Font("Microsoft YaHei Light", 0, 18)); // NOI18N
        controlproductolbl.setText("Control de productos");

        backbtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/loginusuario/img/backicon.png"))); // NOI18N
        backbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backbtnActionPerformed(evt);
            }
        });

        venta_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/loginusuario/img/carriton.png"))); // NOI18N
        venta_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                venta_btnActionPerformed(evt);
            }
        });

        venta_lbl.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 0, 18)); // NOI18N
        venta_lbl.setText("Control de ventas");

        javax.swing.GroupLayout jpanelwhiteLayout = new javax.swing.GroupLayout(jpanelwhite);
        jpanelwhite.setLayout(jpanelwhiteLayout);
        jpanelwhiteLayout.setHorizontalGroup(
            jpanelwhiteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanelwhiteLayout.createSequentialGroup()
                .addGroup(jpanelwhiteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpanelwhiteLayout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addComponent(backbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(109, 109, 109)
                        .addComponent(mainlbl))
                    .addGroup(jpanelwhiteLayout.createSequentialGroup()
                        .addGroup(jpanelwhiteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jpanelwhiteLayout.createSequentialGroup()
                                .addGap(133, 133, 133)
                                .addComponent(adminbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jpanelwhiteLayout.createSequentialGroup()
                                .addGap(87, 87, 87)
                                .addComponent(controlproductolbl)))
                        .addGroup(jpanelwhiteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jpanelwhiteLayout.createSequentialGroup()
                                .addGap(100, 100, 100)
                                .addComponent(venta_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jpanelwhiteLayout.createSequentialGroup()
                                .addGap(77, 77, 77)
                                .addComponent(venta_lbl)))))
                .addContainerGap(146, Short.MAX_VALUE))
        );
        jpanelwhiteLayout.setVerticalGroup(
            jpanelwhiteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanelwhiteLayout.createSequentialGroup()
                .addGroup(jpanelwhiteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpanelwhiteLayout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(backbtn))
                    .addGroup(jpanelwhiteLayout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(mainlbl)))
                .addGroup(jpanelwhiteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpanelwhiteLayout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(adminbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpanelwhiteLayout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(venta_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(27, 27, 27)
                .addGroup(jpanelwhiteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(controlproductolbl)
                    .addComponent(venta_lbl))
                .addContainerGap(47, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpanelwhite, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpanelwhite, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void adminbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adminbtnActionPerformed
        // este botón lleva a control de productos del usuario
          control_productos_user mf = new control_productos_user ();
                mf.setVisible(true);
                mf.pack();
                mf.setLocationRelativeTo(null);
                
                this.dispose();
        
      
    }//GEN-LAST:event_adminbtnActionPerformed

    private void backbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backbtnActionPerformed
        // este botón lleva allogin de Inicio de Sesión
         frm_login mf = new frm_login ();
                mf.setVisible(true);
                mf.pack();
                mf.setLocationRelativeTo(null);
                
                this.dispose();
        
    }//GEN-LAST:event_backbtnActionPerformed

    private void venta_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_venta_btnActionPerformed
        // este botón lleva a la venta de usuario
           venta_user mf = new venta_user ();
                mf.setVisible(true);
                mf.pack();
                mf.setLocationRelativeTo(null);
                
                this.dispose();
    }//GEN-LAST:event_venta_btnActionPerformed

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
            java.util.logging.Logger.getLogger(menu_admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(menu_admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(menu_admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(menu_admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

  
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new menu_admin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton adminbtn;
    private javax.swing.JButton backbtn;
    private javax.swing.JLabel controlproductolbl;
    private javax.swing.JPanel jpanelwhite;
    private javax.swing.JLabel mainlbl;
    private javax.swing.JButton venta_btn;
    private javax.swing.JLabel venta_lbl;
    // End of variables declaration//GEN-END:variables
}
