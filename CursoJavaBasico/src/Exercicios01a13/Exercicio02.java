package Exercicios01a13;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		// Exercicio: Fa�a um programa que pe�a um n�mero e ent�o mostre a mensagem o numero informado foi [numero]
		
		Scanner xpto = new Scanner(System.in);
			
		System.out.println("Informe um n�mero");
		
		int numero = xpto.nextInt();
		
		System.out.println("O n�mero informado foi: " + numero);
		
	
	}

}
