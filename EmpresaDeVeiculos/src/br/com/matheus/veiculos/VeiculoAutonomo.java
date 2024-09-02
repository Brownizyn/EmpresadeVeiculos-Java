package br.com.matheus.veiculos;

public class VeiculoAutonomo {
	private String nome;
    private double autonomia;
    private int capacidadePassageiros;

    public VeiculoAutonomo(String nome, double autonomia, int capacidadePassageiros) {
        this.nome = nome;
        this.autonomia = autonomia;
        this.capacidadePassageiros = capacidadePassageiros;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public double getAutonomia() {
        return autonomia;
    }
    public void setAutonomia(double autonomia) {
        this.autonomia = autonomia;
    }
    public int getCapacidadePassageiros() {
        return capacidadePassageiros;
    }
    public void setCapacidadePassageiros(int capacidadePassageiros) {
        this.capacidadePassageiros = capacidadePassageiros;
    }
    
    public void calcularEconomia() {
        System.out.println("Método de cálculo de economia não implementado para " + nome);
    }
}

