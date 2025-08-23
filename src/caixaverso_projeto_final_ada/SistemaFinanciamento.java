package caixaverso_projeto_final_ada;

import java.util.Scanner;

import caixaverso_projeto_final_ada.model.Cliente;
import caixaverso_projeto_final_ada.model.Financiamento;
import caixaverso_projeto_final_ada.model.FinanciamentoImovel;

public class SistemaFinanciamento {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Financiamento financiamento = null;
		System.out.println("############ SISTEMA DE FINANCIAMENTO ###########");
		System.out.print(
				" ================ MENU PRINCIPAL ================ \n1 - Financiamento de Imóvel\n2 - Financiamento de Veículo"
						+ "\n3 - Listar Financiamentos de Imóveis\n4 - Listar Financiamentos de Veículos"
						+ "\n0 - Sair\n\nEscolha uma opção: ");
		int opcao = input.nextInt();
		input.nextLine();

		if (opcao == 1 || opcao == 2) {
			System.out.print("Nome: ");
			String nome = input.nextLine();
			System.out.print("Idade: ");
			int idade = input.nextInt();
			System.out.print("Renda: ");
			double renda = input.nextDouble();
			System.out.print("Valor do bem: ");
			double valorBem = input.nextDouble();

			Cliente cliente = new Cliente(nome, idade, renda);

			switch (opcao) {
			case 1: financiamento = new FinanciamentoImovel(cliente, valorBem);break;
			}
			
			financiamento.caluculoFinanciamento();

		}
		input.close();
	}

}
