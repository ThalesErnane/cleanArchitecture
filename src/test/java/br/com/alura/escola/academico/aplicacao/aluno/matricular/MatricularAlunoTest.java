package br.com.alura.escola.academico.aplicacao.aluno.matricular;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import br.com.alura.escola.academico.aplicacao.aluno.matricular.MatricularAluno;
import br.com.alura.escola.academico.aplicacao.aluno.matricular.MatricularAlunoDto;
import br.com.alura.escola.academico.dominio.aluno.Aluno;
import br.com.alura.escola.academico.dominio.aluno.LogDeAlunoMatriculado;
import br.com.alura.escola.academico.infra.aluno.RepositorioDeAlunosEmMemoria;
import br.com.alura.escola.shared.dominio.CPF;
import br.com.alura.escola.shared.dominio.evento.PublicadorDeEventos;

class MatricularAlunoTest {

	@Test
	void alunoDeveriaSerPersistido() {
	// MOCK -> 	
	RepositorioDeAlunosEmMemoria repositorio = new RepositorioDeAlunosEmMemoria();
    PublicadorDeEventos publicador = new PublicadorDeEventos();
    publicador.adicionar(new LogDeAlunoMatriculado());
	
	MatricularAluno useCase = new MatricularAluno(repositorio, publicador);
	MatricularAlunoDto dados = new MatricularAlunoDto("Fulano", "123.456.789-10", "teste@email.com");
	useCase.executa(dados);
	
	Aluno encontrado = repositorio.buscarPorCPF(new CPF("123.456.789-10"));
	assertEquals("Fulano", encontrado.getNome());
	assertEquals("123.456.789-10", encontrado.getCpf());
	assertEquals("teste@email.com", encontrado.getEmail());
	}

}
