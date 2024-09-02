package br.com.matheus.main;

import br.com.matheus.veiculos.CarroAutonomo;
import br.com.matheus.veiculos.Drone;

public class Main {

	public static void main(String[] args) {
		 CarroAutonomo carro = new CarroAutonomo("Tesla", 2000, 4, "Modelo X", "Elétrico");

	     Drone drone = new Drone("Namolit", 291, 0, 200, "4K");

	     System.out.println("Carro Autônomo: " + carro.getNome() + ", Modelo: " + carro.getModelo() + ", Preço: " + carro.getAutonomia());
	     carro.calcularEconomia();

	     System.out.println("Drone: " + drone.getNome() + ", Altura Máxima de Voo: " + drone.getAlturaMaximaVoo() + ", Preço: " + drone.getAutonomia());
	     drone.calcularEconomia();
	    }
	}
