programa
{
	inclua biblioteca Matematica --> mat
	
	funcao inicio()
	{
		/* objetivo
		 * 8. O custo ao consumidor de um carro novo é a soma do 
		 * custo de fábrica com a percentagem do distribuidor e dos 
		 * impostos (aplicados ao custo de fábrica). Supondo que a 
		 * percentagem do distribuidor seja de 28% e os impostos de 45%, 
		 * escrever um sistema que leia o custo de fábrica de um carro e 
		 * escreva o custo ao consumidor. 
		 *  
		 */
		//variaveis
		real custoConsumidorCarro=0
		real custoFabricaCarro
		real percentagemDistribuidor=0 // documentação - camelCase
		real impostosPrecoFabrica=0
		

		const real VALORDISTRIBUIDOR = 0.28 //28%  clean code
		const real VALORIMPOSTOS = 0.45 //  0.45%
		const real VALOR_ADICIONAL = 0.15 //15%

		//entradas
		escreva("Digite o preço de fabrica do carro:")
		leia(custoFabricaCarro)

		//processamentos - modo de preparo
		
		 impostosPrecoFabrica = (custoFabricaCarro * VALORIMPOSTOS)
		 percentagemDistribuidor = (custoFabricaCarro * VALORDISTRIBUIDOR)
		 custoConsumidorCarro = (custoFabricaCarro + impostosPrecoFabrica + percentagemDistribuidor)

		 //saida
		 escreva("Custo final carro novo é: ",mat.arredondar(custoConsumidorCarro, 2))
		 
	}
	
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 593; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */