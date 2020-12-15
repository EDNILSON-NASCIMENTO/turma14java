package exemplos;

import java.util.Random;
import java.util.Scanner;

public class Simulado {

	public static void main(String[] args) {
		
		
		Scanner leia = new Scanner(System.in);
		String clientes[] = {"Ed", "Geandro", "Fatima", "Jessis"};
		double salarios[] = new double[4];
		int dias[]= new int[4];
		Random rand = new Random(); //1-31
		int diaUsuario=0;
	
		for (int x=0; x<4; x++) {
			dias[x]= rand.nextInt(31)+1;
			salarios[x] = 1045.50;
			System.out.println("Nome"+clientes[x]+" Salario: "+salarios[x]+" dia correcao: "+dias[x]);
		}
		System.out.println("Digite o dia de correção ");
		diaUsuario = leia.nextInt();
		System.out.println("apos correção");
		for (int x=0; x<4; x++) {
			if (dias[x]==diaUsuario) {
				salarios[x] = salarios[x]+(salarios[x]*0.10);
			}
				
			System.out.println("Nome"+clientes[x]+" Salario: "+salarios[x]+" dia correcao: "+dias[x]);
		}
		
	}

}
