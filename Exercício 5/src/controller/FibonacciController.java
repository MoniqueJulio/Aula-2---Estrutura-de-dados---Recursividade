package controller;

public class FibonacciController {
	
	public int calculoFibonacci(int posicao) {
		
			
		if((posicao == 1) || (posicao ==0)){
			
			return posicao;
		}
		
		else {
						
			return calculoFibonacci(posicao-1) +calculoFibonacci(posicao-2);
		}
	}
}

