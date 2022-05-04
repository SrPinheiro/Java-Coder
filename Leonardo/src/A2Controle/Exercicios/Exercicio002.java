package A2Controle.Exercicios;

import java.util.Scanner;

public class Exercicio002 {
	public static void main(String[] args) {
		//2.Criar um programa informa se o ano atual é um ano bissexto;
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite um ano:");
		var ano = scan.nextInt();
		if (ano % 4 == 0) {
			if (ano % 100 == 0) {
				if (ano % 400 == 0) {
					System.out.println("o ano é bissexto!");
				} else {
					System.out.println("o ano NÃO é bissexto!");
				}
			} else {
				System.out.println("o ano é bissexto!");
			}
		} else {
			System.out.println("o ano NÃO é bissexto!");
		}
	}
}
