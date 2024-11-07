
import java.awt.Color;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Ezequiel
 */
public class Login extends javax.swing.JFrame {

    public Login() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btn_entrar = new javax.swing.JButton();
        btn_jframe_cadastrar = new javax.swing.JButton();
        login_field = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        Bt_sair_1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        pass_field = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(60, 62, 65));

        btn_entrar.setBackground(new java.awt.Color(51, 51, 51));
        btn_entrar.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        btn_entrar.setForeground(new java.awt.Color(255, 255, 255));
        btn_entrar.setText("Entrar");
        btn_entrar.setToolTipText("");
        btn_entrar.setBorderPainted(false);
        btn_entrar.setFocusPainted(false);
        btn_entrar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_entrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_entrarActionPerformed(evt);
            }
        });

        btn_jframe_cadastrar.setBackground(new java.awt.Color(51, 51, 51));
        btn_jframe_cadastrar.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        btn_jframe_cadastrar.setForeground(new java.awt.Color(255, 255, 255));
        btn_jframe_cadastrar.setText("Cadastrar");
        btn_jframe_cadastrar.setToolTipText("");
        btn_jframe_cadastrar.setBorderPainted(false);
        btn_jframe_cadastrar.setFocusPainted(false);
        btn_jframe_cadastrar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_jframe_cadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_jframe_cadastrarActionPerformed(evt);
            }
        });

        login_field.setBackground(new java.awt.Color(102, 102, 102));
        login_field.setForeground(new java.awt.Color(0, 0, 0));
        login_field.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        login_field.setText("Login");
        login_field.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        login_field.setDisabledTextColor(new java.awt.Color(204, 204, 204));
        login_field.setSelectedTextColor(new java.awt.Color(204, 204, 204));
        login_field.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                login_fieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                login_fieldFocusLost(evt);
            }
        });
        login_field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                login_fieldActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 30)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Bibliotecário");

        Bt_sair_1.setBackground(new java.awt.Color(51, 51, 51));
        Bt_sair_1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        Bt_sair_1.setForeground(new java.awt.Color(255, 0, 51));
        Bt_sair_1.setText("X");
        Bt_sair_1.setToolTipText("");
        Bt_sair_1.setAlignmentY(0.0F);
        Bt_sair_1.setBorderPainted(false);
        Bt_sair_1.setFocusPainted(false);
        Bt_sair_1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Bt_sair_1.setMargin(new java.awt.Insets(0, 0, 0, 0));
        Bt_sair_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bt_sair_1ActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Tela inicial");
        jLabel4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel4.setVerticalTextPosition(javax.swing.SwingConstants.TOP);

        pass_field.setBackground(new java.awt.Color(102, 102, 102));
        pass_field.setForeground(new java.awt.Color(0, 0, 0));
        pass_field.setText("Enter password");
        pass_field.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                pass_fieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                pass_fieldFocusLost(evt);
            }
        });
        pass_field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pass_fieldActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(200, 200, 200)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btn_jframe_cadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btn_entrar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(150, 150, 150)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(login_field)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                                    .addComponent(pass_field))))
                        .addGap(0, 144, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 59, Short.MAX_VALUE)
                        .addComponent(Bt_sair_1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(jLabel2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(Bt_sair_1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(61, 61, 61)
                .addComponent(login_field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pass_field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(btn_entrar, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_jframe_cadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(93, 93, 93))
        );

        login_field.getAccessibleContext().setAccessibleParent(login_field);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void Bt_sair_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bt_sair_1ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_Bt_sair_1ActionPerformed

    private void btn_jframe_cadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_jframe_cadastrarActionPerformed
        new Cadastro_funcionarios().setVisible(true);
    }//GEN-LAST:event_btn_jframe_cadastrarActionPerformed

    private void login_fieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_login_fieldActionPerformed

    }//GEN-LAST:event_login_fieldActionPerformed

    private void login_fieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_login_fieldFocusLost
        if(login_field.getText().equals("")){
            login_field.setText("Login");
            login_field.setForeground(Color.black);
        };
    }//GEN-LAST:event_login_fieldFocusLost

    private void login_fieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_login_fieldFocusGained
        if(login_field.getText().equals("Login")){
                login_field.setText("");
                login_field.setForeground(Color.black);
            }
    }//GEN-LAST:event_login_fieldFocusGained

    private void pass_fieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pass_fieldActionPerformed
       
    }//GEN-LAST:event_pass_fieldActionPerformed

    private void pass_fieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_pass_fieldFocusGained
      if(String.valueOf(pass_field.getPassword()).equals("Enter password")){
                pass_field.setText("");
                pass_field.setForeground(Color.black);
            }
    }//GEN-LAST:event_pass_fieldFocusGained

    private void pass_fieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_pass_fieldFocusLost
              if(String.valueOf(pass_field.getPassword()).equals("")){
                pass_field.setText("Enter password");
                pass_field.setForeground(Color.black);
            }
    }//GEN-LAST:event_pass_fieldFocusLost

    private void btn_entrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_entrarActionPerformed

    }//GEN-LAST:event_btn_entrarActionPerformed

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Bt_sair_1;
    private javax.swing.JButton btn_entrar;
    private javax.swing.JButton btn_jframe_cadastrar;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField login_field;
    private javax.swing.JPasswordField pass_field;
    // End of variables declaration//GEN-END:variables
}
