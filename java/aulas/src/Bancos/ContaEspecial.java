package Bancos;

public class ContaEspecial extends ContaCorrente
{
	private double valorLimite;
	private double valorCadastroLimite;

	
	//encapsulamento
	
	public ContaEspecial(int numeroConta, double valorLimite) {
		super(numeroConta);
		this.valorLimite = valorLimite;
		
		
	}

	public double getValorLimite() {
		return valorLimite;
	}

	public void setValorLimite(double valorLimite) {
		this.valorLimite = valorLimite;
	}
	
	
	@Override
	public boolean testarSaldo(double valor) {
		
		boolean teste;
		if (valor <= super.getSaldo()) 
		{
			teste = true;
		} 
		else if (valor <= (this.valorLimite+super.getSaldo()))
		{
			// 100 saldo 1000 limite  valor pedido: 200 reais
			//1000 + (200)
			double valorCredito=valor - super.getSaldo();
			super.credito(valorCredito);
			this.valorLimite = this.valorLimite - valorCredito;
			teste = true;
		}
		else
		{
			teste = false;
		}
		
		return teste;
	}
	
	
	 public void registraLimite() 
	 {
		if (valorLimite<=0) {
			System.out.println("Valor zerado, impossivel realizar!!!");
		}
		else {
			this.valorCadastroLimite = this.valorLimite;
		}
		
	}
	
	
	public void devolverLimite() {
		if (this.valorLimite < this.valorCadastroLimite) 
		{
			double diferenca;
			diferenca = this.valorCadastroLimite - this.valorLimite;
			super.debito(diferenca);
			this.valorLimite += diferenca;
			
		}
	}
	
	
	
}
