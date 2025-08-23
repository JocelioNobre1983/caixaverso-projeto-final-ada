package caixaverso_projeto_final_ada.entity;

import java.math.BigDecimal;

public class Cliente {
	private String nome;
	private int idade;
	private BigDecimal rendaMensal;
	private BigDecimal valorBem;
	
	public Cliente() {
	}

	public Cliente(String nome, int idade, BigDecimal rendaMensal, BigDecimal valorBem) {
		this.nome = nome;
		this.idade = idade;
		this.rendaMensal = rendaMensal;
		this.valorBem = valorBem;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public BigDecimal getRendaMensal() {
		return rendaMensal;
	}

	public void setRendaMensal(BigDecimal rendaMensal) {
		this.rendaMensal = rendaMensal;
	}

	public BigDecimal getValorBem() {
		return valorBem;
	}

	public void setValorBem(BigDecimal valorBem) {
		this.valorBem = valorBem;
	}
	
			
}
