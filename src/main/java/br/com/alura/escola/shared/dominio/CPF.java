package br.com.alura.escola.shared.dominio;

public class CPF {

	// Mapa de Conexto - Shared Kernel
	// http://www.fabriciorissetto.com/blog/ddd-bounded-context/
	private String numero;

	public CPF(String numero) {
		if (numero == null || !numero.matches("^\\d{3}\\.\\d{3}\\.\\d{3}\\-\\d{2}$")) {
			throw new IllegalArgumentException("CPF Inválido");
		}

		this.numero = numero;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	@Override
	public String toString() {
		return numero;
	}

}
