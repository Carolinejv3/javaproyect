
package loginusuario;


public class menu_admin extends javax.swing.JFrame {

   
    public menu_admin() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpanelwhite = new javax.swing.JPanel();
        mainlbl = new javax.swing.JLabel();
        btn_user = new javax.swing.JButton();
        adminbtn = new javax.swing.JButton();
        controluserlbl = new javax.swing.JLabel();
        controlstockolbl = new javax.swing.JLabel();
        backbtn = new javax.swing.JButton();
        venta_btn = new javax.swing.JButton();
        venta_lbl = new javax.swing.JLabel();
        stock_btn = new javax.swing.JButton();
        controlproductolbl2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jpanelwhite.setBackground(new java.awt.Color(255, 255, 255));
        jpanelwhite.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        mainlbl.setFont(new java.awt.Font("Malgun Gothic", 1, 18)); // NOI18N
        mainlbl.setText("MENU ADMIN");
        jpanelwhite.add(mainlbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(367, 41, -1, -1));

        btn_user.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn_user.setIcon(new javax.swing.ImageIcon(getClass().getResource("/loginusuario/img/admin img 1.jpg"))); // NOI18N
        btn_user.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_userActionPerformed(evt);
            }
        });
        jpanelwhite.add(btn_user, new org.netbeans.lib.awtextra.AbsoluteConstraints(131, 179, 99, 100));

        adminbtn.setBackground(new java.awt.Color(255, 255, 255));
        adminbtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        adminbtn.setForeground(new java.awt.Color(255, 255, 255));
        adminbtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/loginusuario/img/productoicon.png"))); // NOI18N
        adminbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adminbtnActionPerformed(evt);
            }
        });
        jpanelwhite.add(adminbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(367, 179, 111, 100));

        controluserlbl.setFont(new java.awt.Font("Microsoft JhengHei Light", 1, 18)); // NOI18N
        controluserlbl.setText("Control de usuarios");
        jpanelwhite.add(controluserlbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(82, 297, -1, -1));

        controlstockolbl.setFont(new java.awt.Font("Microsoft YaHei Light", 1, 18)); // NOI18N
        controlstockolbl.setText("Control de Stock");
        jpanelwhite.add(controlstockolbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 300, -1, -1));

        backbtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/loginusuario/img/backicon.png"))); // NOI18N
        backbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backbtnActionPerformed(evt);
            }
        });
        jpanelwhite.add(backbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(43, 31, 84, -1));

        venta_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/loginusuario/img/carriton.png"))); // NOI18N
        venta_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                venta_btnActionPerformed(evt);
            }
        });
        jpanelwhite.add(venta_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(634, 170, 98, -1));

        venta_lbl.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 1, 18)); // NOI18N
        venta_lbl.setText("Control de ventas");
        jpanelwhite.add(venta_lbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(591, 298, -1, -1));

        stock_btn.setBackground(new java.awt.Color(255, 255, 255));
        stock_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/loginusuario/img/stockicono1.png"))); // NOI18N
        stock_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stock_btnActionPerformed(evt);
            }
        });
        jpanelwhite.add(stock_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 170, 120, 110));

        controlproductolbl2.setFont(new java.awt.Font("Microsoft YaHei Light", 1, 18)); // NOI18N
        controlproductolbl2.setText("Control de productos");
        jpanelwhite.add(controlproductolbl2, new org.netbeans.lib.awtextra.AbsoluteConstraints(318, 297, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jpanelwhite, javax.swing.GroupLayout.PREFERRED_SIZE, 1027, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jpanelwhite, javax.swing.GroupLayout.PREFERRED_SIZE, 405, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 2, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

//    en este form se redireccionan los diferentes botones para que lleve al usuario a donde se le indica
    private void btn_userActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_userActionPerformed
//        este botón lleva hacia el control de usuarios
         control_usuario mf = new control_usuario ();
                mf.setVisible(true);
                mf.pack();
                mf.setLocationRelativeTo(null);
                
                this.dispose();
    }//GEN-LAST:event_btn_userActionPerformed

    private void adminbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adminbtnActionPerformed
//       este botón lleva hacia el control productos del administrador
          control_productos mf = new control_productos ();
                mf.setVisible(true);
                mf.pack();
                mf.setLocationRelativeTo(null);
                
                this.dispose();
        
      
    }//GEN-LAST:event_adminbtnActionPerformed

    private void backbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backbtnActionPerformed
//        este botón lleva al login de iniciar sesión
         frm_login mf = new frm_login ();
                mf.setVisible(true);
                mf.pack();
                mf.setLocationRelativeTo(null);
                
                this.dispose();
        
    }//GEN-LAST:event_backbtnActionPerformed

    private void venta_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_venta_btnActionPerformed
//       este botón lleva al área de venta y facturación del administrador
        venta_admin mf = new venta_admin ();
                mf.setVisible(true);
                mf.pack();
                mf.setLocationRelativeTo(null);
                
                this.dispose();
    }//GEN-LAST:event_venta_btnActionPerformed

    private void stock_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stock_btnActionPerformed
//       este botón lleva al control de stock 
        control_stock mf = new control_stock ();
                mf.setVisible(true);
                mf.pack();
                mf.setLocationRelativeTo(null);
                
                this.dispose();
    }//GEN-LAST:event_stock_btnActionPerformed

    
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

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new menu_admin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton adminbtn;
    private javax.swing.JButton backbtn;
    private javax.swing.JButton btn_user;
    private javax.swing.JLabel controlproductolbl2;
    private javax.swing.JLabel controlstockolbl;
    private javax.swing.JLabel controluserlbl;
    private javax.swing.JPanel jpanelwhite;
    private javax.swing.JLabel mainlbl;
    private javax.swing.JButton stock_btn;
    private javax.swing.JButton venta_btn;
    private javax.swing.JLabel venta_lbl;
    // End of variables declaration//GEN-END:variables
}
