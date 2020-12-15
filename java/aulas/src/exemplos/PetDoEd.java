package exemplos;

import java.util.Scanner;

import Objetos.Pessoa;
import Objetos.Produto;

public class PetDoEd {

	public static void main(String[] args)
	{
		
		Scanner leia = new Scanner(System.in);
		Pessoa clientepet = new Pessoa();
		Produto produtopet1 = new Produto("RAÇAO PURINA", 10, 250.25);
		Produto produtopet2 = new Produto("Osso plástico", 100, 10);
		char tipoPet;
		Pet dog1 = new Pet(true, 'C', "Labrador" );
		Pet cat1 = new Pet('F');
		Pet pet1 = new Pet('A');
		
		
		
		/*
		System.out.println("PET DO ED!!");
		System.out.println("Olá cliente, por favor digite o seu nome: ");
		clientepet.nome = leia.next();
		System.out.println("Vc prefere ser chamado pelo genero M-masculino ou F-feminino: ");
		clientepet.genero = leia.next().toUpperCase().charAt(0);
		
		System.out.println("Voce deseja comprar produtos para que tipo de pet:");
		System.out.println("F-felino, C-canino, A-Aves P-Peixes: ");
		tipoPet = leia.next().toUpperCase().charAt(0);
		*/
		
		System.out.println(dog1.retornaEspecie());
		System.out.println(cat1.retornaEspecie());
		System.out.println(pet1.retornaEspecie());
		
 		
		
		
		
		

	}

}
