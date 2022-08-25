package controller;

public class BinarioController {

	public String RecursivaBinario(int numero) {

		if (numero / 2 == 0) {
			
			return String.valueOf(numero%2);
		}

		else {

			return RecursivaBinario(numero / 2) + String.valueOf(numero % 2);
		}

	}
}
