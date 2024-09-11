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
	
	public static void ex6l1 (String [] args) { //conta num par, impar e primos
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
					System.out.println(i);//imprime primos
					primos = primos + 0;//erro - arrumar
					break;
				}
			}
		} // fim for primos
		String par = Integer.toString(pares);
		String impar = Integer.toString(impares);
		String primo = Integer.toString(primos);
		System.out.printf("Foram sorteados %s pares, %s impares e %s primos", par, impar, primo);
	}
	
	public static void ex3l2 (String [] args) { //preenche vetor n c double random
		Scanner ent = new Scanner(System.in);
		Random rand = new Random();
		System.out.println("Digite um num: ");
		int num = Integer.parseInt(ent.nextLine());
		if(num < 0) {
			System.out.println("Num < 0 | Digite outro.");
			return;
		}
		double vet[] = new double[num];
		for (int k = 0; k < vet.length; k++) {
			vet[k] = rand.nextDouble();
			System.out.println(vet[k]);
			}
		}
	
	public static void ex4l2 (String [] args) { //calcula media da sala e separa conforme ela
		Scanner ent = new Scanner(System.in);
		System.out.print("Digite o num de alunos: ");
		int num = Integer.parseInt(ent.nextLine());
		if(num < 0) {
			System.out.println("Num < 0 | Inicie dnv.");
		}
		double alunos[] = new double[num]; //??
		double notaF, resT = 0, media = 0;
		int acima = 0, abaixo = 0, igual = 0;
		for(int i = 0; i < alunos.length; i++) {
			System.out.printf("Digite a nota do aluno %d nos dois semestres: ", i+1);
			notaF = ((Integer.parseInt(ent.nextLine()) + Integer.parseInt(ent.nextLine())) / 2.0);
			alunos[i] = notaF;
		} System.out.println("As notas foram salvas!");
		for(int i = 0; i < alunos.length; i++) {
			resT = resT + alunos[i];
		} media = resT / alunos.length;
		for(int i = 0; i < alunos.length; i++) {
			if(alunos[i] > media) {
				acima = acima+1;
			} else if (alunos[i] < media) {
				abaixo = abaixo+1;
			} else if (alunos[i] == media){
				igual = igual+1;
			}
		}
		System.out.printf("%d alunos acima da media, %d abaixo e %d iguais", acima, abaixo, igual);
		ent.close();
	}
	
	public static void main (String [] args) { //ex8l2
		        // Exemplo de vetor para inverter
		        int[] vetor = {1, 2, 3, 4, 5};

		        // Exibir o vetor original
		        System.out.println("Vetor original:");
		        exibirVetor(vetor);

		        // Inverter o vetor
		        inverterVetor(vetor);

		        // Exibir o vetor invertido
		        System.out.println("Vetor invertido:");
		        exibirVetor(vetor);
		    }

		    // Método para inverter o vetor
		    public static void inverterVetor(int[] vetor) {
		        int inicio = 0;
		        int fim = vetor.length - 1;

		        while (inicio < fim) {
		            // Trocar elementos nas posições 'inicio' e 'fim'
		            int temp = vetor[inicio];
		            vetor[inicio] = vetor[fim];
		            vetor[fim] = temp;

		            // Avançar para as próximas posições
		            inicio++;
		            fim--;
		        }
		    }

		    // Método para exibir os elementos do vetor
		    public static void exibirVetor(int[] vetor) {
		        for (int i : vetor) {
		            System.out.print(i + " ");
		        }
		        System.out.println();
		}
	
	// próximo pacote
	
}
