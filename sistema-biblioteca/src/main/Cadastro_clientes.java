package main;


import java.awt.Color;
import javax.swing.JOptionPane;

public class Cadastro_clientes extends javax.swing.JFrame {

    public Cadastro_clientes() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        nome_cliente_field = new javax.swing.JTextField();
        senha_cliente_field = new javax.swing.JTextField();
        rpt_senha_cliente_field = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        btn_cadastrar_cliente = new javax.swing.JButton();
        endereco_cliente_field1 = new javax.swing.JTextField();
        cpf_cliente = new javax.swing.JTextField();
        btn_pagina_inicial = new javax.swing.JButton();
        Bt_sair_2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setFocusable(false);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(60, 62, 65));

        nome_cliente_field.setBackground(new java.awt.Color(102, 102, 102));
        nome_cliente_field.setForeground(new java.awt.Color(153, 153, 153));
        nome_cliente_field.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        nome_cliente_field.setText("Nome");
        nome_cliente_field.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        nome_cliente_field.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                nome_cliente_fieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                nome_cliente_fieldFocusLost(evt);
            }
        });
        nome_cliente_field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nome_cliente_fieldActionPerformed(evt);
            }
        });

        senha_cliente_field.setBackground(new java.awt.Color(102, 102, 102));
        senha_cliente_field.setForeground(new java.awt.Color(153, 153, 153));
        senha_cliente_field.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        senha_cliente_field.setText("Senha");
        senha_cliente_field.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        senha_cliente_field.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                senha_cliente_fieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                senha_cliente_fieldFocusLost(evt);
            }
        });
        senha_cliente_field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                senha_cliente_fieldActionPerformed(evt);
            }
        });

        rpt_senha_cliente_field.setBackground(new java.awt.Color(102, 102, 102));
        rpt_senha_cliente_field.setForeground(new java.awt.Color(153, 153, 153));
        rpt_senha_cliente_field.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        rpt_senha_cliente_field.setText("Repita a senha");
        rpt_senha_cliente_field.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        rpt_senha_cliente_field.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                rpt_senha_cliente_fieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                rpt_senha_cliente_fieldFocusLost(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Cadastro de clientes");

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

        endereco_cliente_field1.setBackground(new java.awt.Color(102, 102, 102));
        endereco_cliente_field1.setForeground(new java.awt.Color(153, 153, 153));
        endereco_cliente_field1.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        endereco_cliente_field1.setText("Endereço");
        endereco_cliente_field1.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        endereco_cliente_field1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                endereco_cliente_field1FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                endereco_cliente_field1FocusLost(evt);
            }
        });

        cpf_cliente.setBackground(new java.awt.Color(102, 102, 102));
        cpf_cliente.setForeground(new java.awt.Color(153, 153, 153));
        cpf_cliente.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        cpf_cliente.setText("Cpf");
        cpf_cliente.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        cpf_cliente.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                cpf_clienteFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                cpf_clienteFocusLost(evt);
            }
        });

        btn_pagina_inicial.setBackground(new java.awt.Color(51, 51, 51));
        btn_pagina_inicial.setForeground(new java.awt.Color(255, 255, 255));
        btn_pagina_inicial.setText("Pagina inicial");
        btn_pagina_inicial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_pagina_inicialActionPerformed(evt);
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
        Bt_sair_2.setMargin(new java.awt.Insets(0, 0, 0, 0));
        Bt_sair_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bt_sair_2ActionPerformed(evt);
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
                            .addComponent(nome_cliente_field, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(senha_cliente_field, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rpt_senha_cliente_field, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(endereco_cliente_field1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cpf_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                        .addComponent(btn_pagina_inicial)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Bt_sair_2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_pagina_inicial, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Bt_sair_2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addComponent(jLabel1)
                .addGap(34, 34, 34)
                .addComponent(nome_cliente_field, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(senha_cliente_field, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rpt_senha_cliente_field, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(endereco_cliente_field1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cpf_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(btn_cadastrar_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(53, Short.MAX_VALUE))
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

    private void btn_cadastrar_clienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cadastrar_clienteActionPerformed
        new Cadastro_funcionarios().setVisible(true);
    }//GEN-LAST:event_btn_cadastrar_clienteActionPerformed

    private void btn_pagina_inicialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_pagina_inicialActionPerformed
        new Tela_principal().setVisible(true);         
        this.dispose();       
    }//GEN-LAST:event_btn_pagina_inicialActionPerformed

    private void Bt_sair_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bt_sair_2ActionPerformed
       int response = JOptionPane.showConfirmDialog(this,"Tem certeza que quer sair?", "Confirmar", JOptionPane.YES_OPTION, JOptionPane.QUESTION_MESSAGE);
            if (response == JOptionPane.YES_OPTION){
                System.exit(0);
            }
    }//GEN-LAST:event_Bt_sair_2ActionPerformed

    private void nome_cliente_fieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nome_cliente_fieldActionPerformed

    }//GEN-LAST:event_nome_cliente_fieldActionPerformed

    private void nome_cliente_fieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_nome_cliente_fieldFocusGained
             if(nome_cliente_field.getText().equals("Nome")){
                nome_cliente_field.setText("");
                nome_cliente_field.setForeground(Color.black);
            }
    }//GEN-LAST:event_nome_cliente_fieldFocusGained

    private void nome_cliente_fieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_nome_cliente_fieldFocusLost
             if(nome_cliente_field.getText().equals("")){
                nome_cliente_field.setText("Nome");
                nome_cliente_field.setForeground(Color.gray);
            }
    }//GEN-LAST:event_nome_cliente_fieldFocusLost

    private void senha_cliente_fieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_senha_cliente_fieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_senha_cliente_fieldActionPerformed

    private void senha_cliente_fieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_senha_cliente_fieldFocusGained
             if(senha_cliente_field.getText().equals("Senha")){
                senha_cliente_field.setText("");
                senha_cliente_field.setForeground(Color.black);}
    }//GEN-LAST:event_senha_cliente_fieldFocusGained

    private void senha_cliente_fieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_senha_cliente_fieldFocusLost
        if(senha_cliente_field.getText().equals("")){
                senha_cliente_field.setText("Senha");
                senha_cliente_field.setForeground(Color.gray);
    }           
    }//GEN-LAST:event_senha_cliente_fieldFocusLost

    private void rpt_senha_cliente_fieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_rpt_senha_cliente_fieldFocusGained
        if(rpt_senha_cliente_field.getText().equals("Repita a senha")){
                rpt_senha_cliente_field.setText("");
                rpt_senha_cliente_field.setForeground(Color.black);
    }//GEN-LAST:event_rpt_senha_cliente_fieldFocusGained
    }
    private void rpt_senha_cliente_fieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_rpt_senha_cliente_fieldFocusLost
        if(rpt_senha_cliente_field.getText().equals("")){
                rpt_senha_cliente_field.setText("Repita a senha");
                rpt_senha_cliente_field.setForeground(Color.gray);
    }              
    }//GEN-LAST:event_rpt_senha_cliente_fieldFocusLost

    private void endereco_cliente_field1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_endereco_cliente_field1FocusGained
        if(endereco_cliente_field1.getText().equals("Endereço")){
                endereco_cliente_field1.setText("");
                endereco_cliente_field1.setForeground(Color.black);
    }              
    }//GEN-LAST:event_endereco_cliente_field1FocusGained

    private void endereco_cliente_field1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_endereco_cliente_field1FocusLost
             if(endereco_cliente_field1.getText().equals("")){
                endereco_cliente_field1.setText("Endereço");
                endereco_cliente_field1.setForeground(Color.gray);
    }       
    }//GEN-LAST:event_endereco_cliente_field1FocusLost

    private void cpf_clienteFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cpf_clienteFocusGained
             if(cpf_cliente.getText().equals("Cpf")){
                cpf_cliente.setText("");
                cpf_cliente.setForeground(Color.black);
    }      
    }//GEN-LAST:event_cpf_clienteFocusGained

    private void cpf_clienteFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cpf_clienteFocusLost
             if(cpf_cliente.getText().equals("")){
                cpf_cliente.setText("Cpf");
                cpf_cliente.setForeground(Color.gray);
    }  
    }//GEN-LAST:event_cpf_clienteFocusLost

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
            java.util.logging.Logger.getLogger(Cadastro_clientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Cadastro_clientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Cadastro_clientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Cadastro_clientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Cadastro_clientes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Bt_sair_2;
    private javax.swing.JButton btn_cadastrar_cliente;
    private javax.swing.JButton btn_pagina_inicial;
    private javax.swing.JTextField cpf_cliente;
    private javax.swing.JTextField endereco_cliente_field1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField nome_cliente_field;
    private javax.swing.JTextField rpt_senha_cliente_field;
    private javax.swing.JTextField senha_cliente_field;
    // End of variables declaration//GEN-END:variables
}
