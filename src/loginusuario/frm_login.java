
package loginusuario;


import CODE.MyConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
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


//inicialización de la clase y codigo generado
public class frm_login extends javax.swing.JFrame {

 
    public frm_login() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        loginlabel = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        userfld = new javax.swing.JTextField();
        passfld = new javax.swing.JPasswordField();
        userlabel = new javax.swing.JLabel();
        passwordlabel = new javax.swing.JLabel();
        BTN_insert = new javax.swing.JButton();
        btn_loginregister = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("LOGIN");
        setBackground(new java.awt.Color(255, 255, 255));
        setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setName("INICIA SESION"); // NOI18N

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/loginusuario/img/logo celucel1.jpg"))); // NOI18N

        loginlabel.setFont(new java.awt.Font("Perpetua Titling MT", 1, 20)); // NOI18N
        loginlabel.setText("LOGIN");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/loginusuario/user.png"))); // NOI18N

        userfld.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N

        passfld.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N

        userlabel.setFont(new java.awt.Font("Trebuchet MS", 0, 24)); // NOI18N
        userlabel.setText("User:");

        passwordlabel.setFont(new java.awt.Font("Trebuchet MS", 0, 24)); // NOI18N
        passwordlabel.setText("Password:");
        passwordlabel.setToolTipText("");

        BTN_insert.setBackground(new java.awt.Color(153, 153, 255));
        BTN_insert.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        BTN_insert.setText("Iniciar Sesión");
        BTN_insert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_insertActionPerformed(evt);
            }
        });

        btn_loginregister.setBackground(new java.awt.Color(153, 153, 255));
        btn_loginregister.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        btn_loginregister.setText("Registrarse");
        btn_loginregister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_loginregisterActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(282, 282, 282)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(loginlabel)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(176, 176, 176)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(BTN_insert, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(54, 54, 54)
                        .addComponent(btn_loginregister, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(passwordlabel)
                            .addComponent(userlabel))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(userfld, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(passfld, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(177, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(loginlabel)
                    .addComponent(jLabel2))
                .addGap(43, 43, 43)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(userfld, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(userlabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(passwordlabel, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(passfld, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BTN_insert, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_loginregister, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36))
        );

        passfld.getAccessibleContext().setAccessibleParent(loginlabel);

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 730, 450));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
//    Se declara el botón "BTN_insertar" en donde al escribir en los textfields se validará la información
    private void BTN_insertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_insertActionPerformed
//        declaración de las variables user y clave pertenecientes a los textfields. "user" será declarada en tipo text y "clave" en tipo password
        String user,clave;
         
        user = userfld.getText();
        clave = String.valueOf(passfld.getPassword());
        
        PreparedStatement ps;
        ResultSet rs;
     
//        Query que selecciona los datos del campo user, password y rol de administrador de la tabla de usuario en donde están almacenados los usuarios existentes.
        String query = "SELECT * FROM `usuario` WHERE `User`=? AND `Password`=? AND id_rol=1";
        
        try {
            ps = MyConnection.getConnection().prepareStatement(query);
            
         
            ps.setString(1, user);
            ps.setString(2, clave);
            
            rs = ps.executeQuery();
            
            if(rs.next())
            {
              
//                codigo que pasa a los usuarios con rol=1 a la ventana del menú de administrador.
                menu_admin mf = new menu_admin();
                mf.setVisible(true);
                mf.pack();
                mf.setLocationRelativeTo(null);
                
                this.dispose();
            }
            else{
           
                PreparedStatement ps2;
                ResultSet rs2;
//                Query que selecciona los datos del campo user, password y rol de administrador de la tabla de usuario en donde están almacenados los usuarios existentes.
                   String query2 = "SELECT * FROM `usuario` WHERE `User`=? AND `Password`=? AND id_rol=2";
                   
                   
                   
                   try{
                   ps2 = MyConnection.getConnection().prepareStatement(query2);
                   
                     ps2.setString(1, user);
                     ps2.setString(2, clave);
            
                   rs2 = ps2.executeQuery();
                    if(rs2.next())
                      {
              
//                     codigo que pasa a los usuarios con rol=2 a la ventana del menú de user.
                       menu_user mf = new menu_user();
                       mf.setVisible(true);
                       mf.pack();
                       mf.setLocationRelativeTo(null);
                       this.dispose();
                       
//                       
//                    este else indica que cuando la clave o el usuario sean insertados de forma incorrecta o
//                    no coincidan con los registros de la base de datos, se envíe un mensaje que diga que el usuario
//                    o la clave son incorrectos, o que hubo un fallo en el acceso.
                     }else{
                        JOptionPane.showMessageDialog(null, "Usuario o Clave incorrectos", "Fallo en Acceso", 2);
                    }
                   }catch(SQLException ex){
                    Logger.getLogger(frm_login.class.getName()).log(Level.SEVERE, null, ex);
                    JOptionPane.showMessageDialog(null, "error "+ex);
                   
                   }

                }
            
            
        } catch (SQLException ex) {
            Logger.getLogger(frm_login.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "error "+ex);
        }
    }//GEN-LAST:event_BTN_insertActionPerformed

//    
//    este botón lleva hacia el form de registro por si se quiere ingresar un nuevo usuario
    private void btn_loginregisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_loginregisterActionPerformed
        // TODO add your handling code here:
         registro mf = new registro ();
                mf.setVisible(true);
                mf.pack();
                mf.setLocationRelativeTo(null);
                
                this.dispose();
    }//GEN-LAST:event_btn_loginregisterActionPerformed

    
 
   
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
            java.util.logging.Logger.getLogger(frm_login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frm_login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frm_login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frm_login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new frm_login().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTN_insert;
    private javax.swing.JButton btn_loginregister;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel loginlabel;
    private javax.swing.JPasswordField passfld;
    private javax.swing.JLabel passwordlabel;
    private javax.swing.JTextField userfld;
    private javax.swing.JLabel userlabel;
    // End of variables declaration//GEN-END:variables
}
