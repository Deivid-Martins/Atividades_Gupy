package questao_4;

import java.util.Scanner;

public class Logica {
	private Scanner input = new Scanner(System.in);
	
	private String[] opcoes;
	
	public Logica() {
		this.opcoes = new String [6];
		this.opcoes[0] = "1, 3, 5, 7, _";
		this.opcoes[1] = "2, 4, 8, 16, 32, 64, _";
		this.opcoes[2] = "0, 1, 4, 9, 16, 25, 36, _";
		this.opcoes[3] = "4, 16, 36, 64, _";
		this.opcoes[4] = "1, 1, 2, 3, 5, 8, _";
		this.opcoes[5] = "2, 10, 12, 16, 17, 18, 19, _";
	}
	
	private void explicar(int choose) {
		switch (choose) {
		case 1:
			System.out.println("Impressão de todos os números, porém, oque é par ele pula!\nProxima Impressão: 9");
			break;
		case 2:
			System.out.println("Inicia multiplicando o 1 por 2, e depois pega o resultado anterior\ne o multiplica por 2 também!\nProxima Impressão: 128");
			break;
		case 3:
			System.out.println("Impressão de todos os números cujo sua raiz quadrada é um numero inteiro!\nProxima Impressão: 64");
			break;
		case 4:
			System.out.println("Imprime o resultado de todos os numeros pares multiplicados por ele mesmo\nEx: 2x2 = 4, 4x4 = 16,...\nProxima Impressão: 100");
			break;
		case 5:
			System.out.println("Impressão do resultado dos 2 resultados obtidos anteriormente, iniciando com 1, 1\nProxima Impressão: 13");
			break;
		case 6:
			System.out.println("Confesso que esta foi desparada a mais dificil, não sei se tenho certeza\nmas diria que ele imprime todos os numeros que iniciam com a letra 'D'\nProxima Impressão: 200");
			break;
		default:
			System.out.println("Digite um valor válido!\n");
			choose = menu();
			explicar(choose);
		}
	}
	
	private int menu () {
		for(int i = 0; i < this.opcoes.length; i ++) {
			System.out.println("[" + (i+1) + "] " + this.opcoes[i]);
		}
		int choose = input.nextInt();
		return choose;
	}
	
	public void iniciar() {
		System.out.println("Escolha um número para explicarmos a logica, e o proximo caractere a ser colocado!");
		int choose = menu();
		explicar(choose);
	}
}
