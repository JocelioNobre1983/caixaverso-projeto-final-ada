package caixaverso_projeto_final_ada.model;

import java.text.DecimalFormat;

public class FinanciamentoImovel extends Financiamento {
	DecimalFormat df = new DecimalFormat("#.00");
	
	public FinanciamentoImovel(Cliente cliente, double valorBem) {
		super(cliente, valorBem);
	}

	@Override
	public void calculoFinanciamento() {
		if (getCliente().getIdade() < 21) {
			motivo = "Status: Reprovado \nMotivo: Idade mínima para financiamento de imóvel é 21 anos.";
            System.out.println(motivo);
            return;
		}
		
		double entrada = getValorBem() * 0.20;
		double financiado = getValorBem() - entrada;
		int parcelas = 360;
		double jurosAno = 0.08;
		double jurosMes = Math.pow(1 + jurosAno, 1.0 / 12) - 1;
		double parcela = (financiado * jurosMes) / (1 - Math.pow(1 + jurosMes, -parcelas));

		if (parcela > getCliente().getRendaMensal() * 0.30) {
			aprovado = false;
            motivo = "Status: Financiamento reprovado \nMotivo:Parcela superior a 30% da renda.";
            System.out.println("Nome: " + cliente.getNome());
            System.out.println(motivo);
            System.out.println();
		} else {
			aprovado = true;
			System.out.println("Financiamento Aprovado!");
			System.out.printf("Entrada: R$ %.2f%n", entrada);
			System.out.printf("Valor financiado: R$ %.2f%n", financiado);
			System.out.println("Número de parcelas: " + parcelas);
			System.out.printf("Parcelas: %d de R$ %.2f%n", parcelas, parcela);
		}
	}
}
