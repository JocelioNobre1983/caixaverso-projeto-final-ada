package caixaverso_projeto_final_ada;

import java.util.ArrayList;
import java.util.Scanner;

import caixaverso_projeto_final_ada.model.Cliente;
import caixaverso_projeto_final_ada.model.Financiamento;
import caixaverso_projeto_final_ada.model.FinanciamentoAutomovel;
import caixaverso_projeto_final_ada.model.FinanciamentoImovel;

public class SistemaFinanciamento {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		ArrayList<Financiamento> lista = new ArrayList<>();
		ArrayList<FinanciamentoImovel> listaImovel = new ArrayList<FinanciamentoImovel>();
		ArrayList<FinanciamentoAutomovel> listaAutomovel = new ArrayList<FinanciamentoAutomovel>();
		int opcao;
		do {
		System.out.println();
		System.out.println("############ SISTEMA DE FINANCIAMENTO ###########");
		System.out.print(
				" ================ MENU PRINCIPAL ================ \n1 - Financiamento de Imóvel\n2 - Financiamento de Veículo"
						+ "\n3 - Listar Financiamentos de Imóveis\n4 - Listar Financiamentos de Veículos"
						+ "\n0 - Sair\n\nEscolha uma opção: ");
		opcao = input.nextInt();
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
			System.out.println();

			Cliente cliente = new Cliente(nome, idade, renda);
			
			Financiamento financiamento = null;
			switch (opcao) {
			case 1: financiamento = new FinanciamentoImovel(cliente, valorBem);
			listaImovel.add((FinanciamentoImovel) financiamento); break;
			case 2: financiamento = new FinanciamentoAutomovel(cliente, valorBem); 
			listaAutomovel.add((FinanciamentoAutomovel) financiamento); break;
			}
			
			financiamento.calculoFinanciamento();
			lista.add(financiamento);
			}
		
		if(opcao == 3) {
			System.out.println();
			System.out.println("Financiamentos de imóveis: ");
			for(FinanciamentoImovel f : listaImovel) {
				System.out.println("Cadastrto: " + f.getCliente());
			}
		}
		
		if(opcao == 4) {
			System.out.println();
			System.out.println("Financiamentos de veículos: ");
			for(FinanciamentoAutomovel f : listaAutomovel) {
				System.out.println("Cadastrto: " + f.getCliente());
				}
			}
		}while (opcao != 0);

    	System.out.println("Programa encerrado.");
		
		input.close();
	}

}
