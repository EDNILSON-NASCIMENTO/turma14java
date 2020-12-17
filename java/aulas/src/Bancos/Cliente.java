package Bancos;

import Objetos.Pessoa;

public class Cliente  extends Pessoa
{
	//ATRIBUTOS
	private String CPF;
	
	//CONSTRUTOR
	public Cliente(String nome, char genero, int anoNascimento, String cPF) {
		super(nome, genero, anoNascimento);
		CPF = cPF;
	}

	//ENCAPSULAMENTO
	public String getCPF() 
	{
		return CPF;
	}

	public void corrigeCPF(String CPF) 
	{
		this.CPF = CPF;
	}
	
	
	
	
	
	
	
	
}
