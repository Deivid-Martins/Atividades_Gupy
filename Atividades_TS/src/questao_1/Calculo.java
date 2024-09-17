package questao_1;

import java.util.Scanner;

public class Calculo {
	private Scanner input = new Scanner(System.in);
	int num;
	
	public Calculo() {
		System.out.print("Defina o numero que deseja verificar se existe na sequência de Fibonacci: ");
		this.num = input.nextInt();
	}
	
	public boolean existeEmFibonacci(int n) {
		int a = 0, b = 1;
		while (b <= this.num) {
			if(b == num) {
				return true;
			}
			int aux = b;
			b = a + b;
			a = aux;
		}
		return false;
	}	
}
