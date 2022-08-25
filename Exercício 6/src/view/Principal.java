package view;

import controller.SerieFatorialController;

public class Principal {

	public static void main(String[] args) {

		double numero = 4;

		SerieFatorialController serie = new SerieFatorialController();

		double resultado = serie.SomaSerie(numero);

		System.out.println("Resultado da série: " + resultado);
	}

}
