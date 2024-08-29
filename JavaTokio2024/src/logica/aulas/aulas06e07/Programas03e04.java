package logica.aulas.aulas06e07;
import java.text.ParseException;
import java.util.Scanner;

public class Programas03e04 {
	
	public static void ex2 (String[] args) { // identifica maior
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
	
	public static void ex3 (String [] args) { // calcular media
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
	}
	
	public static void ex5 (String [] args) { //calc basica
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
		
		public static void ex8 (String [] args) { // calcula autonomia km/L
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
		
		public static void main (String [] args) { //ex9 --> fazer 
			
		}
		
}
