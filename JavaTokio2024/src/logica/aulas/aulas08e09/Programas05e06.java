package logica.aulas.aulas08e09;
import java.math.*;
import java.util.Calendar;
import java.util.Random;
import java.util.Scanner;

public class Programas05e06 {

	public static void ex1l1 (String [] args) { //bom dia/tarde/noite
		Calendar c = Calendar.getInstance();
		int hora = c.get(Calendar.HOUR_OF_DAY);
		if (hora >= 6 && hora < 12) {
			System.out.println("Bom dia, trabalhador!");
		} else if (hora >=12 && hora < 18) {
			System.out.println("Boa tarde, vagabundo!");
		} else {
			System.out.println("Boa noite, farreiro!");
		}
	}
	
	public static void ex3l1 (String [] args) {
		Scanner ent = new Scanner(System.in);
		System.out.println("Digite um texto: ");
		String text = ent.nextLine();
		
		int maiu = 0, minu = 0, num = 0, vazio = 0;
		
		for(int i = 0; i < text.length(); i++) {
			if ((text.charAt(i) >= 'A') && (text.charAt(i) <= 'Z')) {
				maiu = maiu + 1;
				}
			
			if ((text.charAt(i) >= 'a') && (text.charAt(i) <= 'z')) {
				minu = minu + 1;
				}
			
			if ((text.charAt(i) >= '0') && (text.charAt(i) <= '9')) {
				num = num + 1;
				}
			
			if (Character.isWhitespace(text.charAt(i))) {
				vazio = vazio + 1;
				}
		}
		
		System.out.println(maiu);
		System.out.println(minu);
		System.out.println(vazio); 
	}
	
	public static void ex5l1 (String [] args) { //10 num random entre 5 e 50
		Random rand = new Random();
		int soma = 0;
		for(int i = 0; i < 10; i++) {
		int sort = rand.nextInt(5, 50);
		soma = soma + sort;
		System.out.println(soma);
		}
	}
	
	public static void main (String [] args) {
		Random rand = new Random();
		int pares = 0, impares = 0, primos = 0;
		for(int i = 0; i < 100; i++) {
			int num = rand.nextInt(0, 100);
			if(num % 2 ==0) {
				pares = pares + 1;
			} if (num % 2 == 1) {
				impares = impares + 1;
			} 
		} // for pares e impares
		
		for (int i = 2; i <=100; i++) {
			for (int k =2; k <= i; k++) {
				if(i % k == 0) {
					break;
				} else {
					primos = primos + i;
					break;
				}
			}
		} // fim for primos
		String par = Integer.toString(pares);
		String impar = Integer.toString(impares);
		String primo = Integer.toString(primos);
		System.out.printf("Foram sorteados %s pares, %s impares e %s primos", par, impar, primo);
	}
	
}
