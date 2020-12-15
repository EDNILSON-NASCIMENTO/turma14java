package exemplos;

public abstract class Pet  //generalização de fato
{
	public int idadePet;
	public boolean femea;
	public char especie;//C-anino - F-elino - R-eptil - P-eixe - A-ve
	public String raca;
	
	
	public Pet() {
		
	}
	
	public Pet(char especie)
	{
		this.especie = especie;
	}

	public Pet(boolean femea, char especie, String raca) {
	
		this.femea = femea;
		this.especie = especie;
		this.raca = raca;
		
	}
	
	//METODOS
	
	
	
	
	public String retornaEspecie(char tipoPet) {
		
		String especie;
		if (tipoPet=='C') {
			especie= "Canino";
		} else if (tipoPet=='F') {
			especie = "Felino";
		} else if (tipoPet=='A') {
			especie = "Ave";
		} else if (tipoPet=='P') {
			especie = "Peixe";
		} else 
		{
			especie = "Indefinido";
		}
			
		
		return especie;
	}
	
public String retornaEspecie() {
		
		String texto;
		if (this.especie=='C') {
			texto= "Canino";
		} else if (this.especie=='F') {
			texto = "Felino";
		} else if (this.especie=='A') {
			texto = "Ave";
		} else if (this.especie=='P') {
			texto = "Peixe";
		} else 
		{
			texto = "Indefinido";
		}
			
		
		return texto;
	}
	
	
	
	
}
