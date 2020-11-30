programa
{
	
	funcao inicio()
	{
		/*
		 * 2) Elabore um sistema que leia as variáveis C e N, respectivamente 
		 * código e número de horas trabalhadas de um operário. E calcule o salário 
		 * sabendo-se que ele ganha R$ 10,00 por hora. Quando o número de horas exceder 
		 * a 50 calcule o excesso de pagamento armazenando-o na variável E, caso 
		 * contrário zerar tal variável. A hora excedente de trabalho vale R$ 20,00. 
		 * No final do processamento imprimir o salário total e o salário excedente.
		 * 
		 */
		 //VARIAVEIS - INGREDIENTES
		 cadeia C
		 inteiro N=0
		 inteiro E=0
		 real salarioTotal=0.0, salarioExcedente=0.0, salarioBase=0.0

		 const real VALORHORANORMAL = 10.00
		 const real VALORHORAEXCEDENTE = 20.00
		 const inteiro LIMITEHORAS = 50

		 //ENTRADAS
		 escreva("Digite o codigo do funcionario: ")
		 leia(C)
		 escreva("Digite a qtde de horas trabalhadas: ")
		 leia(N)

		 //PROCESSAMENTOS
		 se (N<=LIMITEHORAS) //calculo do normal até 50 horas
		 {
		 	salarioBase = (N*VALORHORANORMAL) //CALCULO DA HORA NORMAL
		 	salarioTotal = salarioBase
		 }
		 senao 
		 {
		 	E = (N - LIMITEHORAS) //CALCULO DA HORA EXTRA
		 	salarioBase = (LIMITEHORAS*VALORHORANORMAL) //CALCULO DO SALARIO BASE
		 	salarioExcedente = E*VALORHORAEXCEDENTE //CALCULO DO SALARIO APENAS EXTRA
		 	salarioTotal = salarioBase+salarioExcedente //SOMATORIO DOS DOIS SALARIOS
		 	
		 }

		 //SAIDAS
		 escreva("\nQuantidade de horas trabalhadas: ", N)
		 escreva("\nQuantidade de horas excedentes: ", E)
		 escreva("\nSalario base: R$ ", salarioBase)
		 escreva("\nSalario excedente: R$ ", salarioExcedente)
		 escreva("\n--------------------------------")
		 escreva("\nSalario total: R$ ", salarioTotal)
		
		 
		 
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1084; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */