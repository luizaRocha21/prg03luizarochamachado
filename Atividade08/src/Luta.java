/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author luiza
 */
import java.util.Random; // Importa a classe Random para gerar números aleatórios


public class Luta {
    private Lutador desafiado;
    private Lutador desafiante;
    private int rounds;
    private boolean aprovada;

    // Construtor com argumentos
    public Luta(Lutador desafiado, Lutador desafiante, int rounds, boolean aprovada) {
        this.desafiado = desafiado;
        this.desafiante = desafiante;
        this.rounds = rounds;
        this.aprovada = aprovada;
    }
    // Método para marcar uma luta entre dois lutadores
    public void marcarLuta(Lutador lutador1, Lutador lutador2) {
        // Verifica se os lutadores têm a mesma categoria e se não são o mesmo lutador
        if (lutador1.getCategoria().equals(lutador2.getCategoria()) && lutador1 != lutador2) {
            this.aprovada = true; // A luta está aprovada
            this.desafiado = lutador1; // Define o desafiado
            this.desafiante = lutador2; // Define o desafiante
            System.out.println("Luta marcada!"); // Mensagem de confirmação
        } else {
            this.aprovada = false; // A luta não está aprovada
            this.desafiado = null; // Limpa o desafiado
            this.desafiante = null; // Limpa o desafiante
            System.out.println("Luta não pode ser marcada."); // Mensagem de falha
        }
    }


        // Método para realizar a luta entre os lutadores
       public Lutador realizarLuta() {
        if (this.aprovada) {
            System.out.println("Desafiado:");
            this.desafiado.apresentar();
            System.out.println("Desafiante:");
            this.desafiante.apresentar();

            Random aleatorio = new Random();
            int vencedor = aleatorio.nextInt(3);

            switch (vencedor) {
                case 0:
                    System.out.println("Vitória de " + this.desafiado.getNome() + "!");
                    this.desafiado.ganharLuta();
                    this.desafiante.perderLuta();
                    return this.desafiado; // Retorna o lutador vencedor
                case 1:
                    System.out.println("Vitória de " + this.desafiante.getNome() + "!");
                    this.desafiado.perderLuta();
                    this.desafiante.ganharLuta();
                    return this.desafiante; // Retorna o lutador vencedor
                default:
                    System.out.println("A luta terminou em empate!");
                    this.desafiado.empatarLuta();
                    this.desafiante.empatarLuta();
                    return null; // Retorna null para empate
            }
        } else {
            System.out.println("A luta não pode acontecer.");
            return null; // Retorna null se a luta não estiver aprovada
        }
    }

    // Getters e setters para os atributos da classe

    public Lutador getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }

    public Lutador getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }

    public int getRounds() {
        return rounds;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public boolean isAprovada() {
        return aprovada;
    }

    public void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }
}
