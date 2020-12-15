package lista3;

import java.util.Scanner;

import exemplos.Pessoa;

public class areaFiguras {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		Triangulo teste1 = new Triangulo();
		Pessoa usuario = new Pessoa();
		
		System.out.println("Area de figuras");
		System.out.println("digite o nome do usuario");
		
		usuario.nome = leia.nextLine();
		System.out.println("Digite o ano de nascimento: ");
		usuario.anoNascimento = leia.nextInt();
		
		System.out.printf("boa tarde %s, sua idade é %d anos, vamos calcular figuras\n", usuario.nome, usuario.idade());
		
		System.out.println("Digite a base: ");
		teste1.base = leia.nextDouble();
		System.out.println("Digite a altura: ");
		teste1.altura = leia.nextDouble();
		System.out.printf("Area do triangulo é igual a %.2f", teste1.area());
		
	}

}
