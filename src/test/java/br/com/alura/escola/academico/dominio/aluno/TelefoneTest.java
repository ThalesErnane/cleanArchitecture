package br.com.alura.escola.academico.dominio.aluno;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

import br.com.alura.escola.academico.dominio.aluno.Telefone;

class TelefoneTest {

	@Test
	void naoDeveriaCriarTelefoneComDDDInvalidos() {
        assertThrows(IllegalArgumentException.class,
                () -> new Telefone(null, "123456789"));
        
        assertThrows(IllegalArgumentException.class,
                () -> new Telefone("", "123456789"));
        
        
        assertThrows(IllegalArgumentException.class,
                () -> new Telefone("1", "123456789"));
	}
		
	@Test
	void naoDeveriaCriarTelefoneComNumerosInvalidos() {
        assertThrows(IllegalArgumentException.class,
                () -> new Telefone("11", null));
        
        assertThrows(IllegalArgumentException.class,
                () -> new Telefone("11", ""));
        
        
        assertThrows(IllegalArgumentException.class,
                () -> new Telefone("11", "123"));
	}
	
	
	@Test
	void DeveriaPermetirCriarTelefoneComDDDENumerosValidos() {
		String ddd = "11";
		String numero = "123456789";
		
		Telefone telefone = new Telefone(ddd, numero);
		assertEquals(ddd, telefone.getDdd());
		assertEquals(numero, telefone.getNumero());
	}

}
