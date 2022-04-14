package br.edu.insper.desagil.aula4.atividade;

public class Aluno {
	
	private int identificador;
	private String nome;
	private double CR;
	
	public Aluno(int identificador, String nome, double CR) {
		this.identificador = identificador;
		this.nome = nome;
		this.CR = CR;
	}

	public double getCR() {
		return CR;
	}

	public void setCR(double CR) {
		this.CR = CR;
	}

	public int getIdentificador() {
		return identificador;
	}

	public String getNome() {
		return nome;
	}
	
	
	
	
}
