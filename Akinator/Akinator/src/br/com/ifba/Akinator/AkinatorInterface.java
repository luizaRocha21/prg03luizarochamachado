/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package br.com.ifba.Akinator;

/**
 *
 * @author luiza
 */
public class AkinatorInterface extends javax.swing.JFrame {
       private int numeroAleatorio; // Variável que guarda o número aleatório
    /**
     * Creates new form AkinatorInterface
     */
    public AkinatorInterface() {
        initComponents();
        gerarNumeroAleatorio(); // Inicializa o jogo gerando um número aleatório
    }
    private void gerarNumeroAleatorio() {
        // Gera um número aleatório entre 1 e 5
        numeroAleatorio = (int) (Math.random() * 5) + 1;
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        imagemAkinator = new javax.swing.JLabel();
        balao = new javax.swing.JLabel();
        cbEscolha = new javax.swing.JComboBox<>();
        botaoEscolha = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        texto = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        imagemAkinator.setIcon(new javax.swing.ImageIcon("C:\\Users\\luiza\\Dropbox\\PC\\Downloads\\Akinator.png")); // NOI18N
        imagemAkinator.setText("jLabel1");

        balao.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        balao.setText("Você consegue advinhar o número em que estou pensando?");

        cbEscolha.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5" }));
        cbEscolha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbEscolhaActionPerformed(evt);
            }
        });

        botaoEscolha.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        botaoEscolha.setText("Advinhar!");
        botaoEscolha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoEscolhaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(208, 208, 208)
                        .addComponent(balao))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(texto)
                                    .addComponent(jLabel2))
                                .addGap(18, 18, 18))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(cbEscolha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(88, 88, 88))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(botaoEscolha)
                                .addGap(74, 74, 74)))
                        .addComponent(imagemAkinator, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(493, 493, 493))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(balao)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(imagemAkinator)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(texto)
                        .addGap(42, 42, 42)
                        .addComponent(cbEscolha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(botaoEscolha)
                        .addGap(72, 72, 72))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbEscolhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbEscolhaActionPerformed

    }//GEN-LAST:event_cbEscolhaActionPerformed

    private void botaoEscolhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoEscolhaActionPerformed
        int palpite = Integer.parseInt(cbEscolha.getSelectedItem().toString());

        /** Verifica se o palpite do usuário é igual ao número aleatório e exibe 
         * na tela na label "texto" se o usuário acertou ou náo o número
         */
        if (palpite == numeroAleatorio) {
            texto.setText("Acertou! Pensei no número " + numeroAleatorio);
        } else {
            texto.setText("Errou! Pensei no número " + numeroAleatorio);
        }

        // Gera um novo número aleatório para o próximo jogo
        gerarNumeroAleatorio();
    }//GEN-LAST:event_botaoEscolhaActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AkinatorInterface().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel balao;
    private javax.swing.JButton botaoEscolha;
    private javax.swing.JComboBox<String> cbEscolha;
    private javax.swing.JLabel imagemAkinator;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel texto;
    // End of variables declaration//GEN-END:variables
}
