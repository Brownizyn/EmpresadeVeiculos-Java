package br.com.matheus.veiculos;

public class Drone extends VeiculoAutonomo{
	 private double alturaMaximaVoo;
	    private String tipoCamera;

	    public Drone(String nome, double autonomia, int capacidadePassageiros, double alturaMaximaVoo, String tipoCamera) {
	        super(nome, autonomia, capacidadePassageiros);
	        this.alturaMaximaVoo = alturaMaximaVoo;
	        this.tipoCamera = tipoCamera;
	    }
	    public double getAlturaMaximaVoo() {
	        return alturaMaximaVoo;
	    }
	    public void setAlturaMaximaVoo(double alturaMaximaVoo) {
	        this.alturaMaximaVoo = alturaMaximaVoo;
	    }
	    public String getTipoCamera() {
	        return tipoCamera;
	    }
	    public void setTipoCamera(String tipoCamera) {
	        this.tipoCamera = tipoCamera;
	    }
	    
	    @Override
	    public void calcularEconomia() {
	        System.out.println("Calculando economia para o drone: " + getNome());
	        double economia = getAutonomia() * alturaMaximaVoo;
	        System.out.println("Economia do Drone (" + getNome() + "): " + economia);
	    }
}
