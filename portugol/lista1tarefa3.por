programa
{
	
	funcao inicio()
	{
		//variaveis
		inteiro tempoSegundos 
		//horas, minutos, segundos

		//entradas
		escreva("digite o tempo em segundos: ")
		leia(tempoSegundos)

		//processamentos
		/*
		horas = (tempoSegundos / 3600) //downcasting
		escreva("\nHora[s]: ", horas)
		minutos = ((tempoSegundos % 3600) / 60)
		escreva("\nMinuto[s]: ", minutos)
		segundos = ((tempoSegundos % 3600) % 60)
		escreva("\nSegundo[s]: ", segundos)
		*/
		escreva("Hora[s]:",(tempoSegundos / 3600), "  - minuto[s]: ",((tempoSegundos % 3600) / 60)," segundo[s]:",((tempoSegundos % 3600) % 60), ".")
		
		
		
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 287; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */