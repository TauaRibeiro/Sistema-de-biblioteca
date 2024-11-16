package main;


import javax.swing.JOptionPane;

public class Tela_principal extends javax.swing.JFrame {

    public Tela_principal() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Bt_sair_1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btn_jframe_cadastrar_cliente = new javax.swing.JButton();
        btn_jframe_cadastrar_livro = new javax.swing.JButton();
        btn_jframe_consultar_livro1 = new javax.swing.JButton();
        btn_jframe_cadastrar_funcionario = new javax.swing.JButton();
        btn_jframe_cadastrar_cliente1 = new javax.swing.JButton();
        Bt_sair_2 = new javax.swing.JButton();

        Bt_sair_1.setBackground(new java.awt.Color(51, 51, 51));
        Bt_sair_1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        Bt_sair_1.setForeground(new java.awt.Color(255, 0, 51));
        Bt_sair_1.setText("X");
        Bt_sair_1.setToolTipText("");
        Bt_sair_1.setAlignmentY(0.0F);
        Bt_sair_1.setBorderPainted(false);
        Bt_sair_1.setFocusPainted(false);
        Bt_sair_1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Bt_sair_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bt_sair_1ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(500, 450));

        jPanel1.setBackground(new java.awt.Color(60, 62, 65));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Início");

        btn_jframe_cadastrar_cliente.setBackground(new java.awt.Color(51, 51, 51));
        btn_jframe_cadastrar_cliente.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        btn_jframe_cadastrar_cliente.setForeground(new java.awt.Color(255, 255, 255));
        btn_jframe_cadastrar_cliente.setText("Cadastrar cliente");
        btn_jframe_cadastrar_cliente.setToolTipText("");
        btn_jframe_cadastrar_cliente.setBorderPainted(false);
        btn_jframe_cadastrar_cliente.setFocusPainted(false);
        btn_jframe_cadastrar_cliente.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_jframe_cadastrar_cliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_jframe_cadastrar_clienteActionPerformed(evt);
            }
        });

        btn_jframe_cadastrar_livro.setBackground(new java.awt.Color(51, 51, 51));
        btn_jframe_cadastrar_livro.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        btn_jframe_cadastrar_livro.setForeground(new java.awt.Color(255, 255, 255));
        btn_jframe_cadastrar_livro.setText("Cadastrar livro");
        btn_jframe_cadastrar_livro.setToolTipText("");
        btn_jframe_cadastrar_livro.setBorderPainted(false);
        btn_jframe_cadastrar_livro.setFocusPainted(false);
        btn_jframe_cadastrar_livro.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_jframe_cadastrar_livro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_jframe_cadastrar_livroActionPerformed(evt);
            }
        });

        btn_jframe_consultar_livro1.setBackground(new java.awt.Color(51, 51, 51));
        btn_jframe_consultar_livro1.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        btn_jframe_consultar_livro1.setForeground(new java.awt.Color(255, 255, 255));
        btn_jframe_consultar_livro1.setText("Consultar livro");
        btn_jframe_consultar_livro1.setToolTipText("");
        btn_jframe_consultar_livro1.setBorderPainted(false);
        btn_jframe_consultar_livro1.setFocusPainted(false);
        btn_jframe_consultar_livro1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_jframe_consultar_livro1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_jframe_consultar_livro1ActionPerformed(evt);
            }
        });

        btn_jframe_cadastrar_funcionario.setBackground(new java.awt.Color(51, 51, 51));
        btn_jframe_cadastrar_funcionario.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        btn_jframe_cadastrar_funcionario.setForeground(new java.awt.Color(255, 255, 255));
        btn_jframe_cadastrar_funcionario.setText("Cadastrar funcionario");
        btn_jframe_cadastrar_funcionario.setToolTipText("");
        btn_jframe_cadastrar_funcionario.setBorderPainted(false);
        btn_jframe_cadastrar_funcionario.setFocusPainted(false);
        btn_jframe_cadastrar_funcionario.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_jframe_cadastrar_funcionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_jframe_cadastrar_funcionarioActionPerformed(evt);
            }
        });

        btn_jframe_cadastrar_cliente1.setBackground(new java.awt.Color(51, 51, 51));
        btn_jframe_cadastrar_cliente1.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        btn_jframe_cadastrar_cliente1.setForeground(new java.awt.Color(204, 0, 0));
        btn_jframe_cadastrar_cliente1.setText("Desconectar");
        btn_jframe_cadastrar_cliente1.setToolTipText("");
        btn_jframe_cadastrar_cliente1.setBorderPainted(false);
        btn_jframe_cadastrar_cliente1.setFocusPainted(false);
        btn_jframe_cadastrar_cliente1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_jframe_cadastrar_cliente1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_jframe_cadastrar_cliente1ActionPerformed(evt);
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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btn_jframe_cadastrar_cliente1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 87, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(158, 158, 158)
                .addComponent(Bt_sair_2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_jframe_cadastrar_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_jframe_cadastrar_funcionario, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_jframe_consultar_livro1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_jframe_cadastrar_livro, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(79, 79, 79))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Bt_sair_2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_jframe_cadastrar_cliente1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(100, 100, 100)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_jframe_cadastrar_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_jframe_cadastrar_livro, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_jframe_consultar_livro1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_jframe_cadastrar_funcionario, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(127, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_jframe_cadastrar_clienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_jframe_cadastrar_clienteActionPerformed
        new Cadastro_clientes().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_jframe_cadastrar_clienteActionPerformed

    private void btn_jframe_cadastrar_livroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_jframe_cadastrar_livroActionPerformed
        
    }//GEN-LAST:event_btn_jframe_cadastrar_livroActionPerformed

    private void btn_jframe_consultar_livro1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_jframe_consultar_livro1ActionPerformed
        //Essa parte deu erro, não apaguei porque não sei se precisa desse trecho
        //new Consulta_cadastro_livros().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_jframe_consultar_livro1ActionPerformed

    private void btn_jframe_cadastrar_funcionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_jframe_cadastrar_funcionarioActionPerformed
        new Cadastro_funcionarios().setVisible(true);
        
    }//GEN-LAST:event_btn_jframe_cadastrar_funcionarioActionPerformed

    private void btn_jframe_cadastrar_cliente1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_jframe_cadastrar_cliente1ActionPerformed
        new Login().setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_btn_jframe_cadastrar_cliente1ActionPerformed

    private void Bt_sair_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bt_sair_1ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_Bt_sair_1ActionPerformed

    private void Bt_sair_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bt_sair_2ActionPerformed
        int response = JOptionPane.showConfirmDialog(this,"Tem certeza que quer sair?", "Confirmar", JOptionPane.YES_OPTION, JOptionPane.QUESTION_MESSAGE);
            if (response == JOptionPane.YES_OPTION){
                System.exit(0);
            }
    }//GEN-LAST:event_Bt_sair_2ActionPerformed

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
            java.util.logging.Logger.getLogger(Tela_principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tela_principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tela_principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tela_principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tela_principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Bt_sair_1;
    private javax.swing.JButton Bt_sair_2;
    private javax.swing.JButton btn_jframe_cadastrar_cliente;
    private javax.swing.JButton btn_jframe_cadastrar_cliente1;
    private javax.swing.JButton btn_jframe_cadastrar_funcionario;
    private javax.swing.JButton btn_jframe_cadastrar_livro;
    private javax.swing.JButton btn_jframe_consultar_livro1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
