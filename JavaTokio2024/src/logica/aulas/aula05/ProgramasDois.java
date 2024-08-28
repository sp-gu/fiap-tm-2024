package logica.aulas.aula05;
import java.util.Scanner;

public class ProgramasDois {
	
	public static void ex7 (String [] args) { // converte valores entre moedas distintas
		Scanner entrada = new Scanner(System.in);
		System.out.print("Insira o valor em R$ p/ converter: \n");
		Double Reais = entrada.nextDouble();
		 Double dolarC = 5.5 * Reais;
		Double euroC = 6.15 * Reais;
		Double libraC = 7.35 * Reais;
		Double pesoAC = 170.86 * Reais;
		System.out.println("Os valores convertidos sao: ");
		System.out.printf("Dolar: %f\n Euro: %f\n Libra: %f\n "
				+ "Peso Arg.: %f", dolarC, euroC, libraC, pesoAC);
	}
	
	public static void ex9 (String [] args) { //separa centena, dezena e unidade
		Scanner entrada = new Scanner(System.in);
		System.out.print("Insira um num de 1 a 999: \n");
		int num = entrada.nextInt();
		int centena = (num/100) * 100;
		String cS = Integer.toString(centena);
		int dezena = (num/100) * 10;
		String dS = Integer.toString(dezena);
		int uni = num%10;
		String uniS = Integer.toString(uni);
		System.out.printf("Res: %s, %s e %s", cS, dS, uniS);
	}
	
	public static void main (String [] args) { //calcula dias de vida para anos, meses e dias
		Scanner entrada = new Scanner(System.in);
		System.out.print("Insira seus dias de vida: ");
		int num = entrada.nextInt();
		int anos = num/365;
		String anosS = Integer.toString(anos);
		int meses = (num%365) / 30;
		String mesesS = Integer.toString(meses);
		int dias = ((num%365)%30);
		String diasS = Integer.toString(dias);
		System.out.printf("Voce tem: %s anos, %s meses e %s dias", anosS, mesesS, diasS);
	}
}
