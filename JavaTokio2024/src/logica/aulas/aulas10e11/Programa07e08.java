package logica.aulas.aulas10e11;

import java.util.Scanner;

public class Programa07e08 {
		
	static void convTemp (double c, double k, double f, double res) {
		Scanner ent = new Scanner(System.in);
		System.out.println("Entre um num e uma letra de escala: ");
		Double num = ent.nextDouble();
		String escala = ent.nextLine();
		switch (escala) {
		case ("C"):
			k = num + 273;
			f = num * 1.8 + 32;
			c = num;
			break;
		 case ("F"):
			k = (num-32)*5/9+273;
			f = num;
			c = (num-32)/1.8;
			break;
		 case ("K"):
			k = num ;
			f = (num-273)*1.8+32;
			c = num - 273;
			break;
		}
		
		//complementar e finalizar
	}

	public static void main(String[] args) {
		//convTemp();
	}

}
