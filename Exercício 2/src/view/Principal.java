package view;

import javax.swing.JOptionPane;
import controller.BinarioController;

public class Principal {
	
	
	public static void main(String[] args) {
		
		int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um n�mero para converter para bin�rio: "));
		
		BinarioController binario = new BinarioController();
		
		System.out.println("N�mero em bin�rio: " + binario.RecursivaBinario(numero));	
		
		
	}

}
