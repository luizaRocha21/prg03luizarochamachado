/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author luiza
 */
public class Lutador {
    private String nome; // Nome do lutador
    private String nacionalidade; // Nacionalidade do lutador
    private int idade; // Idade do lutador
    private double altura; // Altura do lutador
    private double peso; // Peso do lutador
    private int vitorias; // Número de vitórias do lutador
    private int derrotas; // Número de derrotas do lutador
    private int empates; // Número de empates do lutador
    private String categoria; // Categoria de peso do lutador
    
    // Construtor da classe Lutador
    public Lutador(String nome, String nacionalidade, int idade, double altura, double peso) {
        this.nome = nome;
        this.nacionalidade = nacionalidade;
        this.idade = idade;
        this.altura = altura;
        this.setPeso(peso); // Define a categoria do lutador ao definir o peso
        this.vitorias = 0;
        this.derrotas = 0;
        this.empates = 0;
    }

    // Método para apresentar os detalhes do lutador
    public void apresentar() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Nacionalidade: " + this.nacionalidade);
        System.out.println("Idade: " + this.idade);
        System.out.println("Altura: " + this.altura);
        System.out.println("Peso: " + this.peso);
        System.out.println("Categoria: " + this.categoria);
        System.out.println("Vitórias: " + this.vitorias);
        System.out.println("Derrotas: " + this.derrotas);
        System.out.println("Empates: " + this.empates);
    }

    // Método para incrementar o número de vitórias do lutador
    public void ganharLuta() {
        this.vitorias++;
    }

    // Método para incrementar o número de derrotas do lutador
    public void perderLuta() {
        this.derrotas++;
    }

    // Método para incrementar o número de empates do lutador
    public void empatarLuta() {
        this.empates++;
    }

    // Método para simular uma luta entre dois lutadores (não implementado aqui)
    public void lutar() {
        // Implemente a lógica da luta aqui
    }

    // Getters e setters para os atributos da classe

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
        // Define a categoria de peso baseado no peso
    if (peso <= 52.2) {
        this.categoria = "Peso Palha (StrawWeight)";
    } else if (peso <= 56.7) {
        this.categoria = "Peso Mosca (Flyweight)";
    } else if (peso <= 61.2) {
        this.categoria = "Peso Galo (Bantamweight)";
    } else if (peso <= 65.8) {
        this.categoria = "Peso Pena (Featherweight)";
    } else if (peso <= 70.3) {
        this.categoria = "Peso Leve (Lightweight)";
    } else if (peso <= 77.1) {
        this.categoria = "Peso Meio-Médio (Welterweight)";
    } else if (peso <= 83.9) {
        this.categoria = "Peso Médio (Middleweight)";
    } else if (peso <= 92.9) {
        this.categoria = "Peso Meio-Pesado (Light Heavyweight)";
    } else if (peso <= 120.2) {
        this.categoria = "Peso Pesado (Heavyweight)";
    } else {
        this.categoria = "Peso Inválido";
    }
    }
    
    public String getCategoria() {
    return categoria;
    }

    public int getVitorias() {
        return vitorias;
    }

    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    public int getEmpates() {
        return empates;
    }

    public void setEmpates(int empates) {
        this.empates = empates;
    }
}

