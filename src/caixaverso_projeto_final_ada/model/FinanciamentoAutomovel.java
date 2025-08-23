package caixaverso_projeto_final_ada.model;

import java.text.DecimalFormat;

public class FinanciamentoAutomovel extends Financiamento {
	DecimalFormat df = new DecimalFormat("#.00");

	public FinanciamentoAutomovel(Cliente cliente, double valorBem) {
		super(cliente, valorBem);
	}

	@Override
	public void calculoFinanciamento() {
		if (getCliente().getIdade() < 18) {
			motivo = "Idade mínima para financiamento de imóvel é 18 anos.";
			System.out.println("Financiamento Reprovado!");
			System.out.println("Motivo: " + motivo);
			return;
		}

		double entrada = getValorBem() * 0.20;
		double financiado = getValorBem() - entrada;
		int parcelas = 48;
		double jurosMes = 0.0015;
		double parcela = (financiado * jurosMes) / (1 - Math.pow(1 + jurosMes, -parcelas));

		if (parcela > getCliente().getRendaMensal() * 0.20) {
			aprovado = false;
			motivo = "Parcela superior a 20% da renda.";
			System.out.println("Financiamento Reprovado!");
			System.out.println("Motivo: R$ " + df.format(parcela) + " - " + motivo);
		} else {
			aprovado = true;
			System.out.println("Financiamento Aprovado!");
			System.out.println("Entrada: R$ " + df.format(entrada));
			System.out.println("Valor financiado: R$ " + df.format(financiado));
			System.out.printf("Parcelas: %d de R$ %.2f%n", parcelas, parcela);
		}
	}
}