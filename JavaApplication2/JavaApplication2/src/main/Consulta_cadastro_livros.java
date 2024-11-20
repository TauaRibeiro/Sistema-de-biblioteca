package main;


import java.awt.Color;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import pacoteLivro.Livro;
import pacoteEmprestimo.Emprestimo;
import pacoteUsuario.Usuario;

public class Consulta_cadastro_livros extends javax.swing.JFrame {

    public Consulta_cadastro_livros() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Bt_sair_1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        btn_consulta_livro = new javax.swing.JButton();
        field_get_nome_livro = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        letr_busc_nome = new javax.swing.JLabel();
        btn_cadastrar_novo_livro = new javax.swing.JButton();
        letr_busc_nome1 = new javax.swing.JLabel();
        btn_pagina_inicial = new javax.swing.JButton();
        Bt_sair_2 = new javax.swing.JButton();
        btn_emprestar_livro = new javax.swing.JButton();
        letr_busc_nome2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txt_area_result = new javax.swing.JTextArea();

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

        jPanel1.setBackground(new java.awt.Color(60, 62, 65));

        btn_consulta_livro.setBackground(new java.awt.Color(51, 51, 51));
        btn_consulta_livro.setText("consultar");
        btn_consulta_livro.setPreferredSize(new java.awt.Dimension(100, 30));
        btn_consulta_livro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_consulta_livroActionPerformed(evt);
            }
        });

        field_get_nome_livro.setBackground(new java.awt.Color(102, 102, 102));
        field_get_nome_livro.setForeground(new java.awt.Color(153, 153, 153));
        field_get_nome_livro.setText("Escreva o nome do livro aqui");
        field_get_nome_livro.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                field_get_nome_livroFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                field_get_nome_livroFocusLost(evt);
            }
        });
        field_get_nome_livro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                field_get_nome_livroActionPerformed(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Lista de livros");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        letr_busc_nome.setBackground(new java.awt.Color(60, 62, 65));
        letr_busc_nome.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        letr_busc_nome.setText("Clique abaixo para cadastrar um novo livro");

        btn_cadastrar_novo_livro.setBackground(new java.awt.Color(51, 51, 51));
        btn_cadastrar_novo_livro.setText("Cadastrar novo");
        btn_cadastrar_novo_livro.setPreferredSize(new java.awt.Dimension(100, 30));
        btn_cadastrar_novo_livro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cadastrar_novo_livroActionPerformed(evt);
            }
        });

        letr_busc_nome1.setBackground(new java.awt.Color(60, 62, 65));
        letr_busc_nome1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        letr_busc_nome1.setText("Busca por nome");

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
        Bt_sair_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bt_sair_2ActionPerformed(evt);
            }
        });

        btn_emprestar_livro.setBackground(new java.awt.Color(51, 51, 51));
        btn_emprestar_livro.setText("Emprestar livro");
        btn_emprestar_livro.setPreferredSize(new java.awt.Dimension(100, 30));
        btn_emprestar_livro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_emprestar_livroActionPerformed(evt);
            }
        });

        letr_busc_nome2.setBackground(new java.awt.Color(60, 62, 65));
        letr_busc_nome2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        letr_busc_nome2.setText("Clique abaixo para emprestar um livro");

        txt_area_result.setEditable(false);
        txt_area_result.setColumns(20);
        txt_area_result.setRows(5);
        jScrollPane1.setViewportView(txt_area_result);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btn_pagina_inicial)
                        .addGap(19, 19, 19)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Bt_sair_2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 248, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(letr_busc_nome1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(69, 69, 69))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addGap(54, 54, 54)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(btn_emprestar_livro, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(btn_cadastrar_novo_livro, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addComponent(letr_busc_nome2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(letr_busc_nome)
                                    .addContainerGap()))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(btn_consulta_livro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(71, 71, 71))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(field_get_nome_livro, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(21, 21, 21))))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_pagina_inicial, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Bt_sair_2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(letr_busc_nome1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(field_get_nome_livro, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_consulta_livro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(letr_busc_nome, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_cadastrar_novo_livro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(23, 23, 23)
                        .addComponent(letr_busc_nome2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_emprestar_livro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 356, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void Bt_sair_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bt_sair_1ActionPerformed
        new Login().setVisible(true);
    }//GEN-LAST:event_Bt_sair_1ActionPerformed

    private void btn_cadastrar_novo_livroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cadastrar_novo_livroActionPerformed
            String nome_livro = JOptionPane.showInputDialog(this, "Qual o nome do livro?");
            int conf_jcb;
            boolean ct_status_livro = true;
            String status_livro;
            String autor;
            
            Livro novo_livro = new Livro();
            
            novo_livro.setStatus("Disponível");
            
            try{
                novo_livro.setTitulo(nome_livro);
            }catch(IllegalArgumentException e){
                if(nome_livro.trim().isEmpty()){
                JOptionPane.showConfirmDialog(this, "O campo nome do livro não pode ser vazio","Erro",JOptionPane.ERROR_MESSAGE);
                }
            }
            
            String qtd_autores[] = {"1","2","3","4","5","6","7","8","9","10"};
            JComboBox qtd_autores_cat = new JComboBox(qtd_autores);
            conf_jcb = JOptionPane.showConfirmDialog(this,qtd_autores_cat,"Quantidade de autores",JOptionPane.DEFAULT_OPTION);

            String ct_autores = (String) qtd_autores_cat.getSelectedItem();
            int cat_autores_qtd = Integer.parseInt(ct_autores);
            for(int ct_a = 1; ct_a <= cat_autores_qtd; ct_a++){
                
                if(ct_a == 1){
                    autor = JOptionPane.showInputDialog(this, "Qual o nome autor principal ?");
                } else {
                    autor = JOptionPane.showInputDialog(this, "Qual o nome autor "+ct_a+"?");
                }
                
                try{
                    novo_livro.adicionarAutor(autor);
                }catch(IllegalArgumentException e){
                
                }
            }

            int qtd_livros = Integer.parseInt(JOptionPane.showInputDialog(this, "Quantos livros serão adicionados"));
            
            try{
                novo_livro.setQuantidade_livros(qtd_livros);
            }catch(IllegalArgumentException e){
                
            }
            String genero[] = {"Terror","Romance","Mistériorio","Guerra","Ficção cientifica","Fantasia","Cowboys","ï¿½poca","Medieval","Grécia antiga"};
            JComboBox gereno_cat = new JComboBox(genero);
            String genero_livro = (String) gereno_cat.getSelectedItem();
            conf_jcb = JOptionPane.showConfirmDialog(this,gereno_cat,"Gï¿½nero do livro",JOptionPane.DEFAULT_OPTION);
            
            try{
                novo_livro.setGenero(genero_livro);
            }catch(IllegalArgumentException e){
            
            }
            
            Livro.cadastrarLivro(novo_livro);
            
    }//GEN-LAST:event_btn_cadastrar_novo_livroActionPerformed

    private void field_get_nome_livroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_field_get_nome_livroActionPerformed

    }//GEN-LAST:event_field_get_nome_livroActionPerformed

    private void field_get_nome_livroFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_field_get_nome_livroFocusLost
            if(field_get_nome_livro.getText().equals("")){
                field_get_nome_livro.setText("Escreva o nome do livro aqui");
                field_get_nome_livro.setForeground(Color.gray);
            }
    }//GEN-LAST:event_field_get_nome_livroFocusLost

    private void field_get_nome_livroFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_field_get_nome_livroFocusGained
            if(field_get_nome_livro.getText().equals("Escreva o nome do livro aqui")){
                field_get_nome_livro.setText("");
                field_get_nome_livro.setForeground(Color.black);
            }
    }//GEN-LAST:event_field_get_nome_livroFocusGained

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

    private void btn_emprestar_livroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_emprestar_livroActionPerformed
            String nome_livro = JOptionPane.showInputDialog(this, "Qual o nome do livro?");
            if(nome_livro.trim().isBlank()){
                    JOptionPane.showConfirmDialog(this, "O campo nome do livro nï¿½o pode ser vazio","Erro",JOptionPane.ERROR_MESSAGE);
                }
            else{
                String nome_cliente = JOptionPane.showInputDialog(this, "Qual o nome do cliente?");
                if (nome_cliente.trim().isBlank()){
                    JOptionPane.showConfirmDialog(this, "O campo nome do cliente não pode ser vazio","Erro",JOptionPane.ERROR_MESSAGE);}
                    else    {
                                String senha_cliente = JOptionPane.showInputDialog(this, "Digite sua senha");
                                if(senha_cliente.trim().isEmpty()){
                                    JOptionPane.showConfirmDialog(this, "O campo senha do cliente nï¿½o pode ser vazio","Erro",JOptionPane.ERROR_MESSAGE);
                                }
                                else{
                                    Emprestimo novo_emprestimo = new Emprestimo();
                                    Livro livro_emprestimo = new Livro();
                                    
                                    try{
                                        livro_emprestimo = Livro.procurarLivro(nome_livro);
                                    }catch(IllegalArgumentException e){
                                        // tratamento
                                    }
                                    
                                    novo_emprestimo.setLivro_emprestado(livro_emprestimo);
                                    
                                    
                                    try{
                                        novo_emprestimo.setUsuario_emprestimo(Usuario.procurarUsuario(nome_cliente));
                                    }catch(IllegalArgumentException e){
                                        // tratamento
                                    }
                                    
                                   try{
                                       livro_emprestimo.setQuantidade_livros(livro_emprestimo.getQuantidade_livros()-1);
                                   }catch(IllegalArgumentException e){
                                       // tratamento
                                   }
                                       
                                   txt_area_result.setText(Emprestimo.realizarEmprestimo(novo_emprestimo));
                                   
                                }
                            }}
            
    }//GEN-LAST:event_btn_emprestar_livroActionPerformed

    private void btn_consulta_livroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_consulta_livroActionPerformed
       if(field_get_nome_livro.getText().isBlank() || field_get_nome_livro.getText().equals("Escreva o nome do livro aqui")){
           txt_area_result.setText(Livro.exibirInfo());
       }else{
           txt_area_result.setText(Livro.exibirInfo(field_get_nome_livro.getText()));
       }
    }//GEN-LAST:event_btn_consulta_livroActionPerformed
    
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
               
                new Consulta_cadastro_livros().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Bt_sair_1;
    private javax.swing.JButton Bt_sair_2;
    private javax.swing.JButton btn_cadastrar_novo_livro;
    private javax.swing.JButton btn_consulta_livro;
    private javax.swing.JButton btn_emprestar_livro;
    private javax.swing.JButton btn_pagina_inicial;
    private javax.swing.JTextField field_get_nome_livro;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel letr_busc_nome;
    private javax.swing.JLabel letr_busc_nome1;
    private javax.swing.JLabel letr_busc_nome2;
    private javax.swing.JTextArea txt_area_result;
    // End of variables declaration//GEN-END:variables
}
