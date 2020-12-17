package Objetos;

public abstract class Pessoa 
{
	//atributos //encapsulei
	private String nome;
	private char genero;
	private int anoNascimento;
	
	//construtor
	public Pessoa(String nome, char genero, int anoNascimento) {
		this.nome = nome;
		this.genero = genero;
		this.anoNascimento = anoNascimento;
	}
	
	//resto do encapsulamento - getters and setters
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public char getGenero() {
		return genero;
	}

	public void setGenero(char genero) {
		this.genero = genero;
	}

	public int getAnoNascimento() {
		return anoNascimento;
	}

	public void setAnoNascimento(int anoNascimento) {
		this.anoNascimento = anoNascimento;
	} 
	
	
	public int voltaIdade() 
	{
		if (this.anoNascimento<=1900) {
			System.out.println("Dados invalidos!!!");
			return 0;
		}
		else 
		{
			return 2020 - this.anoNascimento;
		}
		
	}
	
	public int voltaIdade(int anoAtual) 
	{
		if (anoAtual==0 || this.anoNascimento <= 1900) 
		{
			System.out.println("DADOS INVALIDOS!!!");
			return 0;
		} 
		else
		{
			return anoAtual - this.anoNascimento;
		}
		
	}
	
	
	
	

	
	
	
	
	
	
	
}
