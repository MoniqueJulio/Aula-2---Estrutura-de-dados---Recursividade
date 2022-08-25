package controller;

public class QuantidadeController {

	public int recursivaQuantidade(int numero, int comparacao) {

		if (numero / 10 == 0) {

			if (numero % 10 == comparacao) {

				return 1;
			}

			else {

				return 0;
			}
		}

		else {

			if (numero % 10 == comparacao) {

				return 1 + recursivaQuantidade(numero / 10, comparacao);
			}

			else {

				return recursivaQuantidade(numero / 10, comparacao);
			}

		}
	}
}
