package caixaverso_projeto_final_ada.model;

public class Financiamento {
	private Cliente cliente;
	private double valorBem;
	public boolean aprovado;
	protected String motivo;

	public Financiamento() {
		super();
	}

	public Financiamento(Cliente cliente, double valorBem) {
		this.cliente = cliente;
		this.valorBem = valorBem;
	}

	public void calculoFinanciamento() {
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

	public boolean isAprovado() {
		return aprovado;
	}

	public void setAprovado(boolean aprovado) {
		this.aprovado = aprovado;
	}

	public String getMotivo() {
		return motivo;
	}

}
