package br.com.alura.escola.dominio.indicacao;

import java.time.LocalDateTime;

import br.com.alura.escola.dominio.aluno.Aluno;

public class Indicacao {

	private Aluno indicado;

	private Aluno indicante;

	private LocalDateTime dataIndicacao;

	public Indicacao(Aluno indicado, Aluno indicante) {
		this.indicado = indicado;
		this.indicante = indicante;
		this.dataIndicacao = LocalDateTime.now();
	}

	public Aluno getIndicado() {
		return indicado;
	}

	public void setIndicado(Aluno indicado) {
		this.indicado = indicado;
	}

	public Aluno getIndicante() {
		return indicante;
	}

	public void setIndicante(Aluno indicante) {
		this.indicante = indicante;
	}

	public LocalDateTime getDataIndicacao() {
		return dataIndicacao;
	}

	public void setDataIndicacao(LocalDateTime dataIndicacao) {
		this.dataIndicacao = dataIndicacao;
	}

}
