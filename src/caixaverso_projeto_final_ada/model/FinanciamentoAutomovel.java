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
			motivo = "Status: Financiamento reprovado \nMotivo: Idade mínima para financiamento de veículo é 18 anos.";
			System.out.println(motivo);
			return;
		}

		double entrada = getValorBem() * 0.10;
		double financiado = getValorBem() - entrada;
		int parcelas = 60;
		double jurosMes = 0.015;
		double parcela = (financiado * jurosMes) / (1 - Math.pow(1 + jurosMes, -parcelas));

		if (parcela > getCliente().getRendaMensal() * 0.20) {
			aprovado = false;
			motivo = "Status: Financiamento reprovado \nMotivo: Parcela superior a 20% da renda.";
			System.out.println(motivo);
		} else {
			aprovado = true;
			System.out.println("Financiamento Aprovado!");
			System.out.println("Entrada: R$ " + df.format(entrada));
			System.out.println("Valor financiado: R$ " + df.format(financiado));
			System.out.println("Número de parcelas: " + parcelas);
			System.out.printf("Parcelas: %d de R$ %.2f%n", parcelas, parcela);
		}
	}
}