package br.com.alura.escola.aplicacao.aluno.matricular;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import br.com.alura.escola.dominio.aluno.Aluno;
import br.com.alura.escola.dominio.aluno.CPF;
import br.com.alura.escola.infra.aluno.RepositorioDeAlunosEmMemoria;

class MatricularAlunoTest {

	@Test
	void alunoDeveriaSerPersistido() {
	// MOCK -> 	
	RepositorioDeAlunosEmMemoria repositorio = new RepositorioDeAlunosEmMemoria();
	MatricularAluno useCase = new MatricularAluno(repositorio);
	MatricularAlunoDto dados = new MatricularAlunoDto("Fulano", "123.456.789-10", "teste@email.com");
	useCase.executa(dados);
	
	Aluno encontrado = repositorio.buscarPorCPF(new CPF("123.456.789-10"));
	assertEquals("Fulano", encontrado.getNome());
	assertEquals("123.456.789-10", encontrado.getCpf());
	assertEquals("teste@email.com", encontrado.getEmail());
	}

}
