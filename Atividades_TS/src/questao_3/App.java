package questao_3;

import java.util.Scanner;

public class App {
	/*
	 * Como era algo extremamente simples, fiz com paradigma "Estruturado" mesmo!
	 * 
	 * index = 12 | Se o indice deve ser desconsiderado a posição 0, soma() = 65
	 * index = 12 | Se o indice deve ser considerado a posição 0, soma () = 77
	 * neste caso, desconsiderei o 0 então deu 65
	*/
	public static int soma () {
		Scanner input = new Scanner(System.in);
		
		int k = 1;
		int soma = 0;
		
		System.out.println("Defina o indice: ");
		int index = input.nextInt() - 1;
		while(k < index) {
			k += 1;
			soma += k;
		}
		input.close();
		return soma;
	}
	
	public static void main(String[] args) {
		System.out.println(soma());
	}
}
