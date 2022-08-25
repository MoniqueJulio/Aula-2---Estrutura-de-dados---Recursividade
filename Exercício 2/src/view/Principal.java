package view;

import javax.swing.JOptionPane;
import controller.BinarioController;

public class Principal {
	
	
	public static void main(String[] args) {
		
		int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um número para converter para binário: "));
		
		BinarioController binario = new BinarioController();
		
		System.out.println("Número em binário: " + binario.RecursivaBinario(numero));	
		
		
	}

}
