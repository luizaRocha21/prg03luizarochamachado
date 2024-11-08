/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author luiza
 */
import java.util.List;
import java.util.ArrayList;
import javax.swing.JOptionPane;
public class InterfaceLuta extends javax.swing.JFrame {
    private Lutador lutadorDesafiante;
    private Lutador lutadorDesafiado;
    private Luta luta;
    private List<Lutador> listaDeLutadores = new ArrayList<>();
    public InterfaceLuta() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lutador1 = new javax.swing.JLabel();
        lutador2 = new javax.swing.JLabel();
        desafiante = new javax.swing.JComboBox<>();
        desafiador = new javax.swing.JComboBox<>();
        adicionar = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        nomeLutador = new javax.swing.JTextField();
        nacionalidade = new javax.swing.JComboBox<>();
        altura = new javax.swing.JTextField();
        peso = new javax.swing.JTextField();
        adicionarLutador = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        marcarLuta = new javax.swing.JButton();
        lutaMarcada = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        vitorioso = new javax.swing.JLabel();
        derrotado = new javax.swing.JLabel();
        mostrarRendimentos = new javax.swing.JButton();
        nomesLutadores = new javax.swing.JComboBox<>();
        labelVitorias = new javax.swing.JLabel();
        labelDerrotas = new javax.swing.JLabel();
        labelEmpates = new javax.swing.JLabel();
        mostrarVitorias = new javax.swing.JLabel();
        MostrarDerrotas = new javax.swing.JLabel();
        mostrarEmpates = new javax.swing.JLabel();
        idade = new javax.swing.JTextField();
        adicionadoSucesso = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lutador1.setText("Desafiante:");

        lutador2.setText("Desafiado:");

        adicionar.setText("Adicionar lutador:");

        jLabel1.setText("Nome:");

        jLabel2.setText("Nacionalidade:");

        jLabel3.setText("Idade:");

        jLabel4.setText("Altura:");

        jLabel5.setText("Peso:");

        nomeLutador.setText("insira o nome");

        nacionalidade.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Antígua e Barbuda - Antiguano", "Argentina - Argentino", "Bahamas - Bahamense", "Barbados - Barbadiano, barbadense", "Belize - Belizenho", "Bolívia - Boliviano", "Brasil - Brasileiro", "Chile - Chileno", "Colômbia - Colombiano", "Costa Rica - Costarriquenho", "Cuba - Cubano", "Dominica - Dominicano", "Equador - Equatoriano", "El Salvador - Salvadorenho", "Granada - Granadino", "Guatemala - Guatemalteco", "Guiana - Guianês", "Guiana Francesa - Guianense", "Haiti - Haitiano", "Honduras - Hondurenho", "Jamaica - Jamaicano", "México - Mexicano", "Nicarágua - Nicaraguense", "Panamá - Panamenho", "Paraguai - Paraguaio", "Peru - Peruano", "Porto Rico - Portorriquenho", "República Dominicana - Dominicana", "São Cristóvão e Nevis - São-cristovense", "São Vicente e Granadinas - São-vicentino", "Santa Lúcia - Santa-lucense", "Suriname - Surinamês", "Trinidad e Tobago - Trindadense", "Uruguai - Uruguaio", "Venezuela - Venezuelano", "Alemanha - Alemão", "Áustria - Austríaco", "Bélgica - Belga", "Croácia - Croata", "Dinamarca - Dinamarquês", "Eslováquia - Eslovaco", "Eslovênia - Esloveno", "Espanha - Espanhol", "França - Francês", "Grécia - Grego", "Hungria - Húngaro", "Irlanda - Irlandês", "Itália - Italiano", "Noruega - Noruego", "Países Baixos - Holandês", "Polônia - Polonês", "Portugal - Português", "Reino Unido - Britânico", "Inglaterra - Inglês", "País de Gales - Galês", "Escócia - Escocês", "Romênia - Romeno", "Rússia - Russo", "Sérvio - Sérvio", "Suécia - Sueco", "Suíça - Suíço", "Turquia - Turco", "Ucrânia - Ucraniano", "Estados Unidos - Americano", "Canadá - Canadense", "Angola - Angolano", "Moçambique - Moçambicano", "África do Sul - Sul-africano", "Zimbabue - Zimbabuense", "Argélia - Argélia", "Comores - Comorense", "Egito - Egípcio", "Líbia - Líbio", "Marrocos - Marroquino", "Gana - Ganés", "Quênia - Queniano", "Ruanda - Ruandês", "Uganda - Ugandense", "Botsuana - Bechuano", "Costa do Marfim - Marfinense", "Camarões - Camaronense", "Nigéria - Nigeriano", "Somália - Somali", "Austrália - Australiano", "Nova Zelândia - Neozelandês", "Afeganistão - Afegão", "Arábia Saudita - Saudita", "Armênia - Armeno", "Armeno - Bangladesh", "China - Chinês", "Coréia do Norte - Norte-coreano, coreano", "Coréia do Sul - Sul-coreano, coreano", "Índia - Indiano", "Indonésia - Indonésio", "Iraque - Iraquiano", "Irã - Iraniano", "Israel - Israelita", "Japão - Japonês", "Malásia - Malaio", "Nepal - Nepalês", "Omã - Omanense", "Paquistão - Paquistanês", "Palestina - Palestino", "Qatar - Qatarense", "Síria - Sírio", "Sri Lanka - Cingalês", "Tailândia - Tailandês", "Timor-Leste - Timorense, maubere", "Emirados Árabes Unidos - Árabe, emiratense", "Vietnã - Vietnamita", "Iêmen - Iemenita" }));

        altura.setText("000");

        peso.setText("000");
        peso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pesoActionPerformed(evt);
            }
        });

        adicionarLutador.setText("Adicionar Lutador");
        adicionarLutador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adicionarLutadorActionPerformed(evt);
            }
        });

        jLabel11.setText("Luta:");

        marcarLuta.setText("Marcar Luta!");
        marcarLuta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                marcarLutaActionPerformed(evt);
            }
        });

        jLabel12.setText("Vitorioso:");

        jLabel13.setText("Derrotado:");

        mostrarRendimentos.setText("Mostrar Rendimentos");
        mostrarRendimentos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mostrarRendimentosActionPerformed(evt);
            }
        });

        labelVitorias.setText("Vitórias:");

        labelDerrotas.setText("Derrotas:");

        labelEmpates.setText("Empates:");

        mostrarVitorias.setForeground(new java.awt.Color(0, 153, 0));

        MostrarDerrotas.setForeground(new java.awt.Color(255, 51, 51));

        mostrarEmpates.setForeground(new java.awt.Color(0, 102, 204));

        idade.setText("000");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addGap(18, 18, 18)
                                        .addComponent(peso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(altura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(nomeLutador, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(adicionar)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addGap(10, 10, 10)
                                        .addComponent(nacionalidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(idade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(125, 125, 125)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(labelVitorias)
                                                    .addComponent(marcarLuta)
                                                    .addComponent(labelDerrotas)))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(14, 14, 14)
                                                .addComponent(jLabel12)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(vitorioso)
                                                .addGap(91, 91, 91)
                                                .addComponent(jLabel13))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(22, 22, 22)
                                                .addComponent(nomesLutadores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(119, 119, 119)
                                                .addComponent(labelEmpates, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(mostrarEmpates)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(derrotado))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(60, 60, 60)
                                .addComponent(jLabel11))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(158, 158, 158)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(adicionadoSucesso)
                                    .addComponent(jLabel7))))
                        .addGap(53, 53, 53))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lutaMarcada, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(lutador1)
                                    .addGap(18, 18, 18)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(adicionarLutador, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(desafiante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)
                                            .addComponent(lutador2)
                                            .addGap(18, 18, 18)
                                            .addComponent(desafiador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(mostrarVitorias)
                                .addComponent(mostrarRendimentos)
                                .addComponent(MostrarDerrotas)))))
                .addContainerGap(67, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(adicionar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(nomeLutador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(nacionalidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(idade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(altura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(peso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(28, 28, 28)
                .addComponent(adicionarLutador)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(adicionadoSucesso)
                .addGap(19, 19, 19)
                .addComponent(jLabel11)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(desafiante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lutador1)
                    .addComponent(lutador2)
                    .addComponent(desafiador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addComponent(marcarLuta)
                .addGap(31, 31, 31)
                .addComponent(lutaMarcada)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(vitorioso)
                    .addComponent(jLabel13)
                    .addComponent(derrotado))
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nomesLutadores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mostrarRendimentos))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelVitorias)
                    .addComponent(mostrarVitorias))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelDerrotas)
                    .addComponent(MostrarDerrotas))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelEmpates)
                    .addComponent(mostrarEmpates))
                .addContainerGap(36, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void marcarLutaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_marcarLutaActionPerformed
         // Obtenha os nomes dos lutadores selecionados
    String nomeDesafiante = (String) desafiante.getSelectedItem();
    String nomeDesafiado = (String) desafiador.getSelectedItem();

    // Encontre os objetos lutadores correspondentes aos nomes selecionados
    Lutador lutadorDesafiante = null;
    Lutador lutadorDesafiado = null;

    for (Lutador lutador : listaDeLutadores) {
        if (lutador.getNome().equals(nomeDesafiante)) {
            lutadorDesafiante = lutador;
        }
        if (lutador.getNome().equals(nomeDesafiado)) {
            lutadorDesafiado = lutador;
        }
    }

    // Verifique se os lutadores são diferentes
    if (lutadorDesafiante.equals(lutadorDesafiado)) {
        JOptionPane.showMessageDialog(this, "Os lutadores devem ser diferentes.");
        return;
    }

    // Verifique se os lutadores estão na mesma categoria de peso
    if (!lutadorDesafiante.getCategoria().equals(lutadorDesafiado.getCategoria())) {
        JOptionPane.showMessageDialog(this, "Os lutadores devem estar na mesma categoria de peso.");
        return;
    }

    // Cria uma nova luta com os lutadores selecionados
    Luta luta = new Luta(lutadorDesafiado, lutadorDesafiante, 5, true);

    // Realiza a luta
    Lutador vencedor = luta.realizarLuta();

    // Atualize a interface
    if (vencedor != null) {
        lutaMarcada.setText("Luta Marcada!");

        // Define o vencedor e o perdedor
        Lutador perdedor = (vencedor.equals(lutadorDesafiante)) ? lutadorDesafiado : lutadorDesafiante;

        // Mostra os nomes dos lutadores vencedor e perdedor
        vitorioso.setText(vencedor.getNome());
        derrotado.setText(perdedor.getNome());
    } else {
        JOptionPane.showMessageDialog(this, "Erro ao marcar a luta.");
    }
    }//GEN-LAST:event_marcarLutaActionPerformed

    private void mostrarRendimentosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mostrarRendimentosActionPerformed
        // Obtém o nome do lutador selecionado
    String nomeLutadorSelecionado = (String) nomesLutadores.getSelectedItem();

    // Procura o lutador correspondente na lista de lutadores
    for (Lutador lutador : listaDeLutadores) {
        if (lutador.getNome().equals(nomeLutadorSelecionado)) {
            // Atualize as variáveis com o número de vitórias, derrotas e empates do lutador selecionado
            mostrarVitorias.setText(String.valueOf(lutador.getVitorias()));
            MostrarDerrotas.setText(String.valueOf(lutador.getDerrotas()));
            mostrarEmpates.setText(String.valueOf(lutador.getEmpates()));
            break;
        }
    }
    }//GEN-LAST:event_mostrarRendimentosActionPerformed

    private void adicionarLutadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adicionarLutadorActionPerformed
    String nome = nomeLutador.getText();
    String nacionalidade = (String) this.nacionalidade.getSelectedItem();
    int idade = Integer.parseInt(this.idade.getText());
    double altura = Double.parseDouble(this.altura.getText());
    double peso = Double.parseDouble(this.peso.getText());
    
    // Verificação de idade
    if (idade < 18) {
        JOptionPane.showMessageDialog(this, "A idade mínima para um lutador é de 18 anos.", "Erro", JOptionPane.ERROR_MESSAGE);
        return;
    }
    // Verificação de nome
    for (Lutador lutador : listaDeLutadores) {
        if (lutador.getNome().equals(nome)) {
            JOptionPane.showMessageDialog(this, "Já existe um lutador com esse nome.", "Erro", JOptionPane.ERROR_MESSAGE);
            return;
        }
    }
    
    // Cria um novo lutador
    Lutador novoLutador = new Lutador(nome, nacionalidade, idade, altura, peso);
    // Adiciona o novo lutador à lista de lutadores
    listaDeLutadores.add(novoLutador);
    // Adiciona o lutador ao combobox
    desafiante.addItem(novoLutador.getNome());
    desafiador.addItem(novoLutador.getNome());
    nomesLutadores.addItem(novoLutador.getNome());
    // Exibe mensagem de sucesso
    adicionadoSucesso.setText("O lutador foi adicionado com sucesso!");
    }//GEN-LAST:event_adicionarLutadorActionPerformed

    private void pesoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pesoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pesoActionPerformed

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
            java.util.logging.Logger.getLogger(InterfaceLuta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InterfaceLuta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InterfaceLuta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InterfaceLuta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InterfaceLuta().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel MostrarDerrotas;
    private javax.swing.JLabel adicionadoSucesso;
    private javax.swing.JLabel adicionar;
    private javax.swing.JButton adicionarLutador;
    private javax.swing.JTextField altura;
    private javax.swing.JLabel derrotado;
    private javax.swing.JComboBox<String> desafiador;
    private javax.swing.JComboBox<String> desafiante;
    private javax.swing.JTextField idade;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel labelDerrotas;
    private javax.swing.JLabel labelEmpates;
    private javax.swing.JLabel labelVitorias;
    private javax.swing.JLabel lutaMarcada;
    private javax.swing.JLabel lutador1;
    private javax.swing.JLabel lutador2;
    private javax.swing.JButton marcarLuta;
    private javax.swing.JLabel mostrarEmpates;
    private javax.swing.JButton mostrarRendimentos;
    private javax.swing.JLabel mostrarVitorias;
    private javax.swing.JComboBox<String> nacionalidade;
    private javax.swing.JTextField nomeLutador;
    private javax.swing.JComboBox<String> nomesLutadores;
    private javax.swing.JTextField peso;
    private javax.swing.JLabel vitorioso;
    // End of variables declaration//GEN-END:variables
}
