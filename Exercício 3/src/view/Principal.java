package view;

import javax.swing.JOptionPane;

import controller.FracaoController;

public class Principal {
	
	public static void main(String[] args) {
		
	int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um número"));
	
	
	FracaoController fracao = new FracaoController();
	
	
	double somatoria = fracao.somaFracao(numero);
		
		System.out.println("Resultado: " +somatoria);
		
		
	}
	
	
	
	}


