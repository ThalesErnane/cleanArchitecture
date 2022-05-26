package br.com.alura.escola.gameficacao.selo;

import java.util.List;

import br.com.alura.escola.shared.dominio.CPF;

public interface RepositorioDeSelos {
	
	void adicionar(Selo selo);
	List<Selo> selosDoALunoDeCPF(CPF cpf);

}
