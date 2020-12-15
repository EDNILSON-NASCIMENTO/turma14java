package lista3;

import java.util.Scanner;

public class ExemploClasse {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		Triangulo ti1 = new Triangulo();
		Triangulo bia = new Triangulo();
		
		
		double base, base2, altura, altura2; 
		double area, area2;
		
		
		System.out.println("digite a Base: ");
		base = leia.nextDouble();
		System.out.println("digite a altura :");
		altura = leia.nextDouble();
		
		area = (base * altura) / 2;
		
		System.out.printf("Area do triangulo %.2f", area);
		
		System.out.println();
		System.out.println("Segundo triangulo");
		System.out.println("digite a Base: ");
		base2 = leia.nextDouble();
		System.out.println("digite a altura :");
		altura2 = leia.nextDouble();
		
		area2 = (base2 * altura2) / 2;
		
		System.out.printf("Area do triangulo %.2f", area2);
		
		System.out.println("TERCEIRO - triangulo  - OBJETO");
		System.out.println("digite a Base: ");
		ti1.base = leia.nextDouble();
		System.out.println("digite a altura :");
		ti1.altura = leia.nextDouble();
		
	
		System.out.printf("Area do triangulo %.2f", ti1.area());
		
		
		System.out.println("Digite a base:");
		
		
	}

}
