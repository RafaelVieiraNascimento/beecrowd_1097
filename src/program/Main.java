package program;

/*
beecrowd | 1097 - Sequencia IJ 3

Você deve fazer um programa que apresente a sequencia conforme o exemplo abaixo.

Entrada
Não há nenhuma entrada neste problema.

Saída
Imprima a sequencia conforme exemplo abaixo.
*/

public class Main {

	public static void main(String[] args) {
		
		for(int i = 1, j = 7; i <= 9; i += 2, j+= 5) {
			for(int  p = 0; p < 3; j--, p++) {
				System.out.printf("I=%d J=%d\n", i, j);
			}
		}
	}
}
