package br.com.alura.escola.gameficacao.infra.selo;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import br.com.alura.escola.gameficacao.selo.RepositorioDeSelos;
import br.com.alura.escola.gameficacao.selo.Selo;
import br.com.alura.escola.shared.dominio.CPF;

public class RepositorioDeSelosEmMemoria implements RepositorioDeSelos {

	private List<Selo> selos = new ArrayList<>();

	@Override
	public void adicionar(Selo selo) {
		this.selos.add(selo);
	}

	@Override
	public List<Selo> selosDoALunoDeCPF(CPF cpf) {
		return this.selos.stream().filter(s -> s.getCpfAluno().equals(cpf)).collect(Collectors.toList());
	}

}
