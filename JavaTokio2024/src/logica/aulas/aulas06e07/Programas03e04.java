package logica.aulas.aulas06e07;
import java.lang.reflect.Array;
import java.math.*;
import java.text.ParseException;
import java.util.Scanner;

public class Programas03e04 {
	
	public static void ex2l1 (String[] args) { // identifica maior
		Scanner ent = new Scanner(System.in);
		System.out.print("Digite 2 num: ");
		double num1 = ent.nextDouble();
		String num1S = Double.toString(num1);
		double num2 = ent.nextDouble();
		String num2S = Double.toString(num2);
		if(num1 > num2) {
			System.out.printf("O maior e: %s", num1S);
		} else if (num2 > num1) {
			System.out.printf("O maior e: %s", num2S);
		} else {
			System.out.printf("Os valores sao iguais.");
		}
	}
	
	public static void ex3l1 (String [] args) { // calcular media
		Scanner ent = new Scanner(System.in);
		System.out.print("Digite as notas dos 4b: ");
		double num1 = ent.nextDouble();
		double num2 = ent.nextDouble();
		double num3 = ent.nextDouble();
		double num4 = ent.nextDouble();
		double media = ((num1 + num2 + num3 + num4) / 4);
		String mediaS = Double.toString(media);
		
		if(media >= 7) {
			System.out.printf("Aprovado com media: %s", mediaS);
		} else if (media>=5 && media<=7) {
			System.out.printf("Em rec, com media: %s", mediaS);
		} else {
			System.out.printf("Reprovado com media: %s.", mediaS);
		}
	}
	
	public static void ex4 (String [] args) { //identifica num multiplos
		Scanner ent = new Scanner(System.in);
		System.out.print("Digite 2 num: ");
		int A = ent.nextInt();
		int B = ent.nextInt();
		String AS = Double.toString(A);
		String BS = Double.toString(B);
		if(A % B == 0 || B % A == 0) {
			System.out.printf("Os num %s e %s sao multiplos.", AS, BS);
		} else {
			System.out.printf("Os num %s e %s NAO sao multiplos.", AS, BS);
		}
		ent.close();
	}
	
	
	public static void ex5l1 (String [] args) { //calc basica
		Scanner ent = new Scanner(System.in);
		System.out.print("Digite os 2 num e a op: ");
		float A = Float.parseFloat(ent.nextLine()); //pega a entrada em str
		float B = Float.parseFloat(ent.nextLine()); // e converte p float
		String op = ent.nextLine();
		float res;
		
		switch (op) {
		case "+": 
			res = A+B;
			String resS = Float.toString(res);
			System.out.printf("Res: %s", resS);
			break;
		case "-": 
			res = A-B;
			String resS1 = Float.toString(res);
			System.out.printf("Res: %s", resS1);
			break;
		case "*": 
			res = A*B;
			String resS11 = Float.toString(res);
			System.out.printf("Res: %s", resS11);
			break;
		case "/": 
			res = A/B;
			String resS111 = Float.toString(res);
			System.out.printf("Res: %s", resS111);
			break;
		default: System.out.println("Erro");
		}//fim s/c
	}
		
		public static void ex8l1 (String [] args) { // calcula autonomia km/L
			Scanner ent = new Scanner(System.in);
			System.out.print("Digite a distancia em km: ");
			float km = Float.parseFloat(ent.nextLine()); //pega a entrada em str
			System.out.print("Digite a qntd de litros gastos: ");
			float litros = Float.parseFloat(ent.nextLine()); // e converte p float
			float res = km/litros;
			if(res < 8) {
				System.out.printf("Esse carro bebe, hein? %.2f km/L", res);
			} else {
				System.out.printf("Autonomia legal (joia). %.2f km/L", res);
			}
		}
		
		public static void ex11l1 (String [] args) {
			Scanner ent = new Scanner(System.in);
			System.out.println("Digite a UF de origem:");
			int uf = Integer.parseInt(ent.nextLine());
			System.out.println("Digite o peso da carga em ton");
			double ton = Double.parseDouble(ent.nextLine());
			System.out.println("Agora, digite o cod da carga: ");
			double codigo = Double.parseDouble(ent.nextLine());
			double valor = 0;
			if(codigo >= 10 && codigo <= 20) {
				valor = 100;
			} else if (codigo >= 21 && codigo <= 30) {
				valor = 250;
			} else if (codigo >= 31 && codigo <= 40) {
				valor = 340;
			}
			
			double vt = ton * 1000 * valor;
			double vf = 0, porc;
			
			switch (uf) {
				case 1: porc = ((vt * 35)/100);
				vf = vt + porc;
				break;
				case 2: porc = ((vt * 25)/100);
				vf = vt + porc;
				break;
				case 3: porc = ((vt * 15)/100);
				vf = vt + porc;
				break;
				case 4: porc = ((vt * 5)/100);
				vf = vt + porc;
				break;
				case 5: vf = vt;
				break;
				default: System.out.println("Erro!");
			}
			String vfS = Double.toString(vf);
			System.out.printf("O valor total e: %s", vfS);
		}
		
	public static void ex1l2 (String [] args) { 
		int res;
		do {
			System.out.println("Olá, Mundo");
			System.out.println("Digite 1 p sair e 2 p ficar");
			Scanner ent = new Scanner(System.in);
			res = Integer.parseInt(ent.nextLine());
		} while(res == 2); 
	}
		
	public static void ex2l2 (String[] args) { // 10 em 10 até 100
		int cont = 0;
		System.out.println(cont);
		do {
			cont = cont + 10;
			System.out.println(cont);
		} while(cont != 100);
	}
	
	public static void ex3l2 (String [] args) { // tabuada n até 25
		Scanner ent = new Scanner(System.in);
		System.out.print("Digite um num: ");
		int n = Integer.parseInt(ent.nextLine());
		int zero = 0, res = 0;
		do {
			res = n * zero;
			System.out.println(n + " * " + zero + " = " + res);
			zero++;
		} while(zero != 26);
	}
	
	public static void ex5l2 (String [] args) { // maior num
		Scanner ent = new Scanner(System.in);
		System.out.println("Digite 5 numeros: ");
		int ver = 0;
		
		/* int maior = Math.max(num1, num2);
		maior = Math.max(maior, num3);
		maior = Math.max(maior, num4);
		maior = Math.max(maior, num5); */
		
		for(int a = 0; a <= 5; a++) {
			int num = Integer.parseInt(ent.nextLine());
			if(num > ver) {
				ver = num; 
			}
		}
		String verS = Integer.toString(ver);
		System.out.printf("O maior e %s", verS);
	}
	
	public static void main (String [] args) { //ex6
		
	}
	
}
