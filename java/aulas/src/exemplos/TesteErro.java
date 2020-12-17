package exemplos;

import java.util.Scanner;

public class TesteErro {

	public static void main(String[] args) 
	{
		Scanner leia = new Scanner(System.in);
		int op;
		int vetor[] = new int[3];
		try 
		{
			System.out.println("Continua 1 - Sim ou 2 - não, 3 é talvez:");
			op = leia.nextInt();
			if (op == 1) 
			{
				System.out.println("Vc escolheu continua!!!");
				
			}
			else if (op ==2) {
				System.out.println("Vc escolheu o 2, para!!!");
			}
			else if (op ==3) {
				System.out.println("Tu escolheu o talvez, dar uma olhada!!!");
			}
			
			for (int x = 0; x<op; x++)
			{
				System.out.println("SEGUNDA PARTE - LOOP numero "+(x+1));
				vetor[x]= x+1;
				System.out.println(vetor[x+1]);
			}
			
		}
		catch (java.util.InputMismatchException e) 
		{
			System.out.println("Vc digitou um tipo diferente, tente de novo: ");
			
		}
		catch (java.lang.ArrayIndexOutOfBoundsException e) 
		{
			System.out.println("Tamanho do vetor foi estourado, xiiiiiiiiii");
		}
		finally {
			System.out.println("VAMOS TER QUE ESTUDAR ERROS!!!");
		}
		
		System.out.println("Fim de programa!!!");
		
	}

}
