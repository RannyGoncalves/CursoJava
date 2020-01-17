package Exercicios01a13;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		// Exercicio: Faça um programa que peça um número e então mostre a mensagem o numero informado foi [numero]
		
		Scanner xpto = new Scanner(System.in);
			
		System.out.println("Informe um número");
		
		int numero = xpto.nextInt();
		
		System.out.println("O número informado foi: " + numero);
		
	
	}

}
