package caixaverso_projeto_final_ada.model;


public class Financiamento {
	private Cliente cliente;
	private double valorBem;
	private int prestacoes;	
	
	public Financiamento() {

	}

	public Financiamento(Cliente cliente, double valorBem, int prestacoes) {
		this.cliente = cliente;
		this.valorBem = valorBem;
		this.prestacoes = prestacoes;
	}
	
	
	public void caluculoFinanciamento() {
	}
	
	public void resultadoFinanciamento() {
	}
	
	public double getValorBem() {
		return valorBem;
	}
	public void setValorBem(double valorBem) {
		this.valorBem = valorBem;
	}
	public int getPrestacoes() {
		return prestacoes;
	}
	public void setPrestacoes(int prestacoes) {
		this.prestacoes = prestacoes;
	}
	public Cliente getCliente() {
		return cliente;
	}
	
	
}
