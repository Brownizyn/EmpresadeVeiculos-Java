package br.com.matheus.veiculos;

public class CarroAutonomo extends VeiculoAutonomo{
	 private String modelo;
	    private String tipoCombustivel;

	    public CarroAutonomo(String nome, double autonomia, int capacidadePassageiros, String modelo, String tipoCombustivel) {
	        super(nome, autonomia, capacidadePassageiros);
	        this.modelo = modelo;
	        this.tipoCombustivel = tipoCombustivel;
	    }
	    public String getModelo() {
	        return modelo;
	    }
	    public void setModelo(String modelo) {
	        this.modelo = modelo;
	    }
	    public String getTipoCombustivel() {
	        return tipoCombustivel;
	    }
	    public void setTipoCombustivel(String tipoCombustivel) {
	        this.tipoCombustivel = tipoCombustivel;
	    }
	    
	    @Override
	    public void calcularEconomia() {
	        System.out.println("Calculando economia para o carro autônomo: " + getNome());
	        double economia = getAutonomia() * getCapacidadePassageiros();
	        System.out.println("Economia do Carro Autônomo (" + getNome() + "): " + economia);
	    }
}
