package view;

import javax.swing.JOptionPane;

import controller.FibonacciController;

public class Principal {
	
	public static void main(String[] args) {
		
		FibonacciController fibonacci = new FibonacciController();
		
		int posicao;
		
				
		posicao = Integer.parseInt(JOptionPane.showInputDialog("Digite um n�mero menor que 20: "));
		
		while (posicao > 20) {
			
			posicao = Integer.parseInt(JOptionPane.showInputDialog("Digite um n�mero menor que 20: "));		
			
		}
		
		int resultado = fibonacci.calculoFibonacci(posicao);
		
		System.out.println("S�rie de fibonacci: " +resultado);
				
	}

}
