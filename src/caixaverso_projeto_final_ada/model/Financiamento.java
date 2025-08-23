package caixaverso_projeto_final_ada.model;

public class Financiamento {
	private Cliente cliente;
	private double valorBem;

	public Financiamento() {
		super();
	}

	public Financiamento(Cliente cliente, double valorBem) {
		this.cliente = cliente;
		this.valorBem = valorBem;
	}

	public void caluculoFinanciamento() {
	}

	public double getValorBem() {
		return valorBem;
	}

	public void setValorBem(double valorBem) {
		this.valorBem = valorBem;
	}

	public Cliente getCliente() {
		return cliente;
	}

}
