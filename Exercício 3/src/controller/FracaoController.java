package controller;

public class FracaoController{
	
	public double somaFracao(int numero){
		
		if (numero ==1) {
			
			return 1;
		}
		
				
		else {		
			double soma=0;
			soma = soma + (1/(double)numero);
			numero = numero -1;
			return soma + somaFracao(numero);
		}
	}

}


