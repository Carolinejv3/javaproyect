
package loginusuario;

import CODE.MyConnection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class registro extends javax.swing.JFrame {

   
    public registro() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        BTN_insert = new javax.swing.JButton();
        userfld = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        loginlabel = new javax.swing.JLabel();
        userlabel = new javax.swing.JLabel();
        passwordlabel = new javax.swing.JLabel();
        passfld = new javax.swing.JPasswordField();
        jLabel2 = new javax.swing.JLabel();
        nombrelabel3 = new javax.swing.JLabel();
        correolabel2 = new javax.swing.JLabel();
        nombrefld = new javax.swing.JTextField();
        correofld = new javax.swing.JTextField();
        btn_login = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 14)); // NOI18N

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        BTN_insert.setBackground(new java.awt.Color(153, 153, 255));
        BTN_insert.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 1, 14)); // NOI18N
        BTN_insert.setText("Registrar");
        BTN_insert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_insertActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/loginusuario/img/logo celucel1.jpg"))); // NOI18N

        loginlabel.setFont(new java.awt.Font("Perpetua Titling MT", 1, 20)); // NOI18N
        loginlabel.setText("registro");

        userlabel.setFont(new java.awt.Font("Lucida Fax", 0, 16)); // NOI18N
        userlabel.setText("User:");

        passwordlabel.setFont(new java.awt.Font("Lucida Fax", 0, 16)); // NOI18N
        passwordlabel.setText("Password:");
        passwordlabel.setToolTipText("");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/loginusuario/user.png"))); // NOI18N

        nombrelabel3.setFont(new java.awt.Font("Lucida Fax", 0, 16)); // NOI18N
        nombrelabel3.setText("Nombre:");

        correolabel2.setFont(new java.awt.Font("Lucida Fax", 0, 16)); // NOI18N
        correolabel2.setText("Correo:");

        btn_login.setBackground(new java.awt.Color(153, 153, 255));
        btn_login.setFont(new java.awt.Font("Microsoft JhengHei Light", 1, 14)); // NOI18N
        btn_login.setText("Iniciar sesión");
        btn_login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_loginActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(loginlabel)
                .addGap(269, 269, 269))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(170, 170, 170)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(BTN_insert)
                        .addGap(27, 27, 27)
                        .addComponent(btn_login))
                    .addComponent(jLabel1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(passwordlabel)
                            .addComponent(userlabel)
                            .addComponent(nombrelabel3)
                            .addComponent(correolabel2))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nombrefld, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(passfld, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(userfld, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(correofld))
                                .addGap(2, 2, 2)))))
                .addGap(148, 148, 148))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(loginlabel)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nombrefld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nombrelabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(correofld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(correolabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(userfld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(userlabel))
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(passwordlabel)
                    .addComponent(passfld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BTN_insert)
                    .addComponent(btn_login))
                .addGap(24, 24, 24))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

//    este botón se encarga de declarar las variables de los textfields 
    private void BTN_insertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_insertActionPerformed

             String nom,user,correo,clave;
        nom = nombrefld.getText();
        user = userfld.getText();
        correo = correofld.getText();
        clave = String.valueOf(passfld.getPassword());
       
        if(nom.isEmpty() && user.isEmpty() && correo.isEmpty() && clave.isEmpty()){
        
         JOptionPane.showMessageDialog(null, "Por favor, complete todos los campos");
        
//         aquí se establece la conexión, se ingresa el query que inserté los datos de usuario al formulario
//         se piden las variables de regreso y finalmente con un setText se validan los campos ingresados.
//           Si es agregado correctamente, enviará al usuario al form de login.
        }else{ 
         PreparedStatement ps;
        String query;
        query = "INSERT INTO `usuario`(`nombre`, `User`, `correo_electronico`, `Password`,`id_rol`) VALUES (?,?,?,?,2)";
        try {
            ps = MyConnection.getConnection().prepareStatement(query);
            
            ps.setString(1, nom);
            ps.setString(2, user);
            ps.setString(3, correo);
            ps.setString(4, clave);
            
             if(ps.executeUpdate() > 0)
            {
                JOptionPane.showMessageDialog(null, "Agregado exitosamente!");
                        nombrefld.setText("");
                        userfld.setText("");
                        correofld.setText("");  
                        passfld.setText(""); 
                        
                frm_login mf = new frm_login ();
                mf.setVisible(true);
                mf.pack();
                mf.setLocationRelativeTo(null);
                
                this.dispose();
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(registro.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "error "+ex);
            }}
    }//GEN-LAST:event_BTN_insertActionPerformed

    private void btn_loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_loginActionPerformed
     
       frm_login mf;
        mf = new frm_login ();
                mf.setVisible(true);
                mf.pack();
                mf.setLocationRelativeTo(null);
                
                this.dispose();
    }//GEN-LAST:event_btn_loginActionPerformed

  
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
            java.util.logging.Logger.getLogger(registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new registro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTN_insert;
    private javax.swing.JButton btn_login;
    private javax.swing.JTextField correofld;
    private javax.swing.JLabel correolabel2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel loginlabel;
    private javax.swing.JTextField nombrefld;
    private javax.swing.JLabel nombrelabel3;
    private javax.swing.JPasswordField passfld;
    private javax.swing.JLabel passwordlabel;
    private javax.swing.JTextField userfld;
    private javax.swing.JLabel userlabel;
    // End of variables declaration//GEN-END:variables
}
