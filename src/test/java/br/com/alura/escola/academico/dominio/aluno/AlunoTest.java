package br.com.alura.escola.academico.dominio.aluno;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import br.com.alura.escola.academico.dominio.aluno.Aluno;
import br.com.alura.escola.academico.dominio.aluno.Email;
import br.com.alura.escola.shared.dominio.CPF;

class AlunoTest {
	
	private Aluno aluno;
	
	@BeforeEach
	void beforeEach() {
		this.aluno = new Aluno(new CPF("123.456.789-00"), "Fulano da Silva", new Email("fulano@gmail.com"));
	}

	@Test
	void deveriaPermitirAdicionar1Telefone() {
		this.aluno.adicionarTelefone("11'", "985488545");
		assertEquals(1, this.aluno.getTelefones().size());
	}
	
	@Test
	void deveriaPermitirAdicionar2Telefones() {
		this.aluno.adicionarTelefone("11'", "985488545");
		this.aluno.adicionarTelefone("11'", "888888882");
		assertEquals(2, this.aluno.getTelefones().size());
	}
	
	@Test
	void deveriaPermitirAdicionar3Telefones() {
		assertThrows(IllegalArgumentException.class, () -> {
			this.aluno.adicionarTelefone("11'", "985488545");
			this.aluno.adicionarTelefone("11'", "888888888");
			this.aluno.adicionarTelefone("11'", "999999999");
		});

	}

}
