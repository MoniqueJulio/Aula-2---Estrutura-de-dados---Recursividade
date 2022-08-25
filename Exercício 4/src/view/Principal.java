package view;

import javax.swing.JOptionPane;
import controller.QuantidadeController;

public class Principal {
	
	public static void main(String[] args) {
		
		int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um número de 10 a 999999: "));
		int comparacao = Integer.parseInt(JOptionPane.showInputDialog("Digite um número de 0 a 9: "));
		
		QuantidadeController quantidade=new QuantidadeController();		
		
		
		System.out.println("Quantidade de vezes que o número " +comparacao +" aparece no número " +numero +" : " + quantidade.recursivaQuantidade(numero, comparacao));
	}

}
