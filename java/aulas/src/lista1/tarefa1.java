package lista1;

import java.util.Scanner;

public class tarefa1 {

	public static void main(String args [])
	{
		
		Scanner leia = new Scanner(System.in);// instaciar o teclado
		//dias = 30
		//mes = 12
		//ano = 365
		//variaveis
		
		int tempoAnos,ano, mes, dia;
		
		//entrada de dados
		System.out.print("Digite o ano do seu nascimento: ");
		ano = leia.nextInt(); //ler o valor
		System.out.print("Digite o mês do seu nascimento: ");
		mes = leia.nextInt();
		System.out.print("Digite o dia do seu nascimento: ");
		dia = leia.nextInt();
		
		//processamento
		tempoAnos = (ano*365)+(mes*30)+dia;
		
		//saida
		System.out.print("Você viveu " + tempoAnos + " dias.");		
		
	}

}
