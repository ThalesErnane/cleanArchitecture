package br.com.alura.escola.academico.dominio.aluno;

import java.time.LocalDateTime;
import java.util.Map;

import br.com.alura.escola.shared.dominio.CPF;
import br.com.alura.escola.shared.dominio.evento.Evento;
import br.com.alura.escola.shared.dominio.evento.TipoDeEvento;

public class AlunoMatriculado implements Evento {

	private final CPF cpfAluno;
	private final LocalDateTime momento;

	public AlunoMatriculado(CPF cpfAluno) {
		this.cpfAluno = cpfAluno;
		this.momento = LocalDateTime.now();
	}

	@Override
	public LocalDateTime momento() {
		return this.momento;
	}

	public CPF getCpfAluno() {
		return cpfAluno;
	}

	@Override
	public TipoDeEvento tipo() {
		return  TipoDeEvento.ALUNO_MATRICULADO;
	}

	@Override
	public Map<String, Object> informacoes() {
		// chave, valor 
		return Map.of("cpf", cpfAluno);
	}

}
