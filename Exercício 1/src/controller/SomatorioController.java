package controller;

public class SomatorioController {
	
	public int somatorioNaturais(int numero){
		
		if (numero <= 0) {			
			
			return 0;
		}
		
		else {
		
			return numero + somatorioNaturais(numero-1);
		}
	}
}

	
	