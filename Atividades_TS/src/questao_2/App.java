/*
 * Farei esta questão de maneira Estruturada, pois é algo bem pequeno,
 *  mas conseguiria fazer tranquilamente em uma Classe a parte
 * */
package questao_2;

import java.util.Scanner;

public class App {
	public static int numLetterA() { // @param letter: criado apenas para variar a letra a verificar!
		Scanner input = new Scanner(System.in);
		
		System.out.print("Defina a String a analisar: ");
		String string = input.nextLine().toUpperCase();
		
		System.out.print("Agora defina a letra para verificar quantas existem na String anterior: ");
		char letter = input.next().toUpperCase().charAt(0);
		int cont = 0;
		for(int i = 0; i < string.length(); i ++)
			if (string.charAt(i) == letter) 
				cont++; //como tudo isso é apenas uma instrução, as {} são facultativas
		
		input.close();
		return cont;
	}
	
	public static void main (String[] args) {
		int totalLetters = numLetterA(); // So salvei aqui para que ficasse mais entendivel oque foi retornado
		
		System.out.printf("Total de letras: %d", totalLetters);
	}
}
