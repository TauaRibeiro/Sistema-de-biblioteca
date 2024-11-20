package main;


import java.awt.Color;
import javax.swing.JOptionPane;
import pacoteUsuario.Funcionario;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Ezequiel
 */
public class Cadastro_funcionarios extends javax.swing.JFrame {
    

    /**
     * Creates new form Cadastro_funcionarios
     */
    public Cadastro_funcionarios() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        nome_func_field = new javax.swing.JTextField();
        senha_func_field = new javax.swing.JTextField();
        rpt_senha_func_field = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        btn_cadastrar_cliente = new javax.swing.JButton();
        btn_pagina_login = new javax.swing.JButton();
        Bt_sair_2 = new javax.swing.JButton();
        senha_adm = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(60, 62, 65));

        nome_func_field.setBackground(new java.awt.Color(102, 102, 102));
        nome_func_field.setForeground(new java.awt.Color(153, 153, 153));
        nome_func_field.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        nome_func_field.setText("Nome");
        nome_func_field.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        nome_func_field.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                nome_func_fieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                nome_func_fieldFocusLost(evt);
            }
        });
        nome_func_field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nome_func_fieldActionPerformed(evt);
            }
        });

        senha_func_field.setBackground(new java.awt.Color(102, 102, 102));
        senha_func_field.setForeground(new java.awt.Color(153, 153, 153));
        senha_func_field.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        senha_func_field.setText("Senha");
        senha_func_field.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        senha_func_field.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                senha_func_fieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                senha_func_fieldFocusLost(evt);
            }
        });
        senha_func_field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                senha_func_fieldActionPerformed(evt);
            }
        });

        rpt_senha_func_field.setBackground(new java.awt.Color(102, 102, 102));
        rpt_senha_func_field.setForeground(new java.awt.Color(153, 153, 153));
        rpt_senha_func_field.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        rpt_senha_func_field.setText("Repita a senha");
        rpt_senha_func_field.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        rpt_senha_func_field.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                rpt_senha_func_fieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                rpt_senha_func_fieldFocusLost(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Cadastro de funcion�rios");

        btn_cadastrar_cliente.setBackground(new java.awt.Color(51, 51, 51));
        btn_cadastrar_cliente.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        btn_cadastrar_cliente.setForeground(new java.awt.Color(255, 255, 255));
        btn_cadastrar_cliente.setText("Cadastrar");
        btn_cadastrar_cliente.setToolTipText("");
        btn_cadastrar_cliente.setBorderPainted(false);
        btn_cadastrar_cliente.setFocusPainted(false);
        btn_cadastrar_cliente.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_cadastrar_cliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cadastrar_clienteActionPerformed(evt);
            }
        });

        btn_pagina_login.setBackground(new java.awt.Color(51, 51, 51));
        btn_pagina_login.setForeground(new java.awt.Color(255, 255, 255));
        btn_pagina_login.setText("Login");
        btn_pagina_login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_pagina_loginActionPerformed(evt);
            }
        });

        Bt_sair_2.setBackground(new java.awt.Color(51, 51, 51));
        Bt_sair_2.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        Bt_sair_2.setForeground(new java.awt.Color(255, 0, 51));
        Bt_sair_2.setText("X");
        Bt_sair_2.setToolTipText("");
        Bt_sair_2.setAlignmentY(0.0F);
        Bt_sair_2.setBorderPainted(false);
        Bt_sair_2.setFocusPainted(false);
        Bt_sair_2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Bt_sair_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bt_sair_2ActionPerformed(evt);
            }
        });

        senha_adm.setBackground(new java.awt.Color(102, 102, 102));
        senha_adm.setForeground(new java.awt.Color(153, 153, 153));
        senha_adm.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        senha_adm.setText("Senha do administrador");
        senha_adm.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        senha_adm.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                senha_admFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                senha_admFocusLost(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(53, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nome_func_field, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(senha_func_field, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rpt_senha_func_field, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(senha_adm, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(150, 150, 150))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(47, 47, 47))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(200, 200, 200)
                        .addComponent(btn_cadastrar_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btn_pagina_login)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Bt_sair_2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_pagina_login, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Bt_sair_2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addComponent(jLabel1)
                .addGap(60, 60, 60)
                .addComponent(nome_func_field, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(senha_func_field, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rpt_senha_func_field, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(senha_adm, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(btn_cadastrar_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(70, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void nome_func_fieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_nome_func_fieldFocusGained
        if(nome_func_field.getText().equals("Nome")){
            nome_func_field.setText("");
            nome_func_field.setForeground(Color.black);
        }
    }//GEN-LAST:event_nome_func_fieldFocusGained

    private void nome_func_fieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_nome_func_fieldFocusLost
        if(nome_func_field.getText().equals("")){
            nome_func_field.setText("Nome");
            nome_func_field.setForeground(Color.gray);
        }
    }//GEN-LAST:event_nome_func_fieldFocusLost

    private void nome_func_fieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nome_func_fieldActionPerformed

    }//GEN-LAST:event_nome_func_fieldActionPerformed

    private void senha_func_fieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_senha_func_fieldFocusGained
        if(senha_func_field.getText().equals("Senha")){
            senha_func_field.setText("");
            senha_func_field.setForeground(Color.black);}
    }//GEN-LAST:event_senha_func_fieldFocusGained

    private void senha_func_fieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_senha_func_fieldFocusLost
        if(senha_func_field.getText().equals("")){
            senha_func_field.setText("Senha");
            senha_func_field.setForeground(Color.gray);
        }
    }//GEN-LAST:event_senha_func_fieldFocusLost

    private void senha_func_fieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_senha_func_fieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_senha_func_fieldActionPerformed

    private void rpt_senha_func_fieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_rpt_senha_func_fieldFocusGained
        if(rpt_senha_func_field.getText().equals("Repita a senha")){
            rpt_senha_func_field.setText("");
            rpt_senha_func_field.setForeground(Color.black);
    }//GEN-LAST:event_rpt_senha_func_fieldFocusGained
    }
    private void rpt_senha_func_fieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_rpt_senha_func_fieldFocusLost
        if(rpt_senha_func_field.getText().equals("")){
            rpt_senha_func_field.setText("Repita a senha");
            rpt_senha_func_field.setForeground(Color.gray);
        }
    }//GEN-LAST:event_rpt_senha_func_fieldFocusLost

    private void btn_cadastrar_clienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cadastrar_clienteActionPerformed
        new Cadastro_funcionarios().setVisible(true);
        
        Funcionario novo_funcionario = new Funcionario();
        
        try{
            novo_funcionario.setNome(nome_func_field.getText());
        }catch(IllegalArgumentException e){
            System.out.println(e.getMessage());
        }

        try{
            novo_funcionario.setSenha(senha_func_field.getText());
        }catch(IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
        
        Funcionario.cadastrarFuncionario(novo_funcionario);
            
    }//GEN-LAST:event_btn_cadastrar_clienteActionPerformed

    private void btn_pagina_loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_pagina_loginActionPerformed
        new Login().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_pagina_loginActionPerformed

    private void Bt_sair_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bt_sair_2ActionPerformed
        int response = JOptionPane.showConfirmDialog(this,"Tem certeza que quer sair?", "Confirmar", JOptionPane.YES_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (response == JOptionPane.YES_OPTION){
            System.exit(0);
        }
    }//GEN-LAST:event_Bt_sair_2ActionPerformed

    private void senha_admFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_senha_admFocusGained
        if(senha_adm.getText().equals("Senha do administrador")){
            senha_adm.setText("");
            senha_adm.setForeground(Color.black);
        }
    }//GEN-LAST:event_senha_admFocusGained

    private void senha_admFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_senha_admFocusLost
        if(senha_adm.getText().equals("")){
            senha_adm.setText("Senha do administrador");
            senha_adm.setForeground(Color.gray);
        }
    }//GEN-LAST:event_senha_admFocusLost

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
            java.util.logging.Logger.getLogger(Cadastro_funcionarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Cadastro_funcionarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Cadastro_funcionarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Cadastro_funcionarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Cadastro_funcionarios().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Bt_sair_2;
    private javax.swing.JButton btn_cadastrar_cliente;
    private javax.swing.JButton btn_pagina_login;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField nome_func_field;
    private javax.swing.JTextField rpt_senha_func_field;
    private javax.swing.JTextField senha_adm;
    private javax.swing.JTextField senha_func_field;
    // End of variables declaration//GEN-END:variables
}