package caixaverso_projeto_final_ada.model;

public class FinanciamentoImovel extends Financiamento {
	private boolean aprovado;
	private String motivo;

	public FinanciamentoImovel(Cliente cliente, double valorBem) {
		super(cliente, valorBem);
	}

	public FinanciamentoImovel(Cliente cliente, double valorBem, boolean aprovado, String motivo) {
		super(cliente, valorBem);
		this.aprovado = aprovado;
		this.motivo = motivo;
	}
	
	@Override
	public void caluculoFinanciamento() {
		if (getCliente().getIdade() < 21) {
			aprovado = false;
			motivo = "Idade mínima para financiamento de imóvel é 21 anos.";
			return;
		}
		
		//CALCULOS - ACREDITO QUE PODERIA TER FEITO UMA CLASSE PARA CALCULAR, MAS RESOLVI DEIXAR AQUI
		double entrada = getValorBem() * 0.20;
		double financiado = getValorBem() - entrada;
		int parcelas = 360;
		double jurosAno = 0.08;
		double jurosMes = Math.pow(1 + jurosAno, 1.0 / 12) - 1;
		double parcela = (financiado * jurosMes) / (1 - Math.pow(1 + jurosMes, -parcelas));

		if (parcela > getCliente().getRendaMensal() * 0.30) {
			aprovado = false;
			motivo = "Parcela superior a 30% da renda.";
		} else {
			aprovado = true;
			System.out.println("Financiamento Aprovado!");
			System.out.printf("Entrada: R$ %.2f%n", entrada);
			System.out.printf("Parcelas: %d de R$ %.2f%n", parcelas, parcela);
		}
	}
}
