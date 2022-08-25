package controller;

public class SerieFatorialController {

	public double SomaSerie(double numero) {

		if (numero == 1) {

			return 1;
		}

		else {

			return (1 / Fatorial(numero)) + SomaSerie(numero - 1);

		}
	}

	public double Fatorial(double numero) {

		if (numero == 0) {

			return 1;
		}

		else {

			return numero * Fatorial(numero - 1);
		}

	}

}
