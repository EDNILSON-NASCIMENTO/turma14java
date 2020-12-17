package loja;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Empresa.Funcionario;
import Empresa.Terceiro;

public class VendaLoja {

	public static void main(String[] args) 
	{
		
		//instanciação completa de objeto
		Scanner leia = new Scanner(System.in);
		
		//usar uma interface
		List<Produto> prodlista = new ArrayList<>();
		
		prodlista.add(new Produto("CAMISA POLO","BEST-001",50.25));
		prodlista.add(new Produto("CALÇA JEAN","BEST-002",80.00));
		prodlista.add(new Produto("CAMISETA","BEST-003",20.00));
		
		System.out.println("PRODUTOS PARA COMPRA");
		System.out.println("CODIGO\t\tPRODUTO\t\t\tVALOR UNITARIO");
		for (Produto visao : prodlista) 
		{
			System.out.println(visao.getCodigo()+"\t"+visao.getNomeProduto()+"\t\t"+visao.getPrecoUnitario());
		}
		
		
		/*
		
		
		System.out.print("Quantos funcionarios tu vai cadastrar ?");
		int qtde = leia.nextInt();
		for (int x=1; x<= qtde; x++) 
		{
			System.out.printf("FUNCIONARIO %d - DIGITE OS DADOS:\n",x);
			System.out.println("Funcionario terceiro[S/N]: ");
			char op = leia.next().toUpperCase().charAt(0);
			System.out.print("Digite o nome: ");
			String nome = leia.next();
			System.out.print("Horas mensais: ");
			int horas = leia.nextInt();
			System.out.println("Qual o valor hora: ");
			double valor = leia.nextDouble();
			if (op =='S') 
			{
				System.out.println("Digite o adicional terceiro: ");
				double adicional = leia.nextDouble();
				lista.add(new Terceiro(nome,horas,valor,adicional));
			}
			else 
			{
				lista.add(new Funcionario(nome,horas,valor));
			}
					
		}
		System.out.println();
		System.out.println("PAGAMENTOS");
		for (Funcionario func : lista) 
		{
			System.out.println(func.getNome()+" - horas:"+func.getHorasMensais()+ " - valor hora: "+func.getValorHora()+" salario: "+func.pagamentoSalario());
		}
*/
	}
	

}
