package logica.aulas.aula04;
import java.util.Scanner;

public class ProgramaUm {

	public static void ex1 (String [] args) {		
		int idade = 18;
		System.out.println(idade);
	}
	
	public static void ex2 (String [] args) {		
		Scanner entrada = new Scanner (System.in);
		System.out.print("Digite seu nome: ");
		String nome = entrada.nextLine();
		System.out.println(nome);
	}
	
	public static void ex3 (String [] args) {		
		Scanner entrada = new Scanner (System.in);
		System.out.print("Digite seu nome: ");
		String nome = entrada.nextLine();
		System.out.println("Bem vindo, " + nome + "!");
	}
	
	public static void ex4 (String [] args) {		
		Scanner entrada = new Scanner (System.in);
		System.out.print("Digite seu nome: ");
		String nome = entrada.nextLine();
		Integer idade = entrada.nextInt();
		System.out.printf("Olá, %s. Você tem %i anos.", nome, idade);
	}
	
	public static void ex5 (String [] args) {		
		Scanner entrada = new Scanner (System.in);
		System.out.println("Insira seu salário: R$");
		Double salario = entrada.nextDouble();
		System.out.println("O salário inserido é" + salario);
	}
	
	public static void ex6 (String [] args) {
		System.out.println("Insira um nome: ");
		Scanner entrada = new Scanner (System.in);
		System.out.println("O nome digitado e: " + entrada.nextLine());
	}

}
