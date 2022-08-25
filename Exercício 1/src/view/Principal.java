package view;

import javax.swing.JOptionPane;

import controller.SomatorioController;

public class Principal {

	public static void main(String[] args) {

		int numero;
		numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um número: "));

		SomatorioController soma = new SomatorioController();

		int somaNaturais = soma.somatorioNaturais(numero);

		System.out.println("somatório dos números naturais do " + numero + " : " + somaNaturais);

	}

}
