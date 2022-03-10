package br.generation.herancapolimorfismo;

public class Preguica extends Animal implements AnimalAcoes {

	public void emitirSom() {
		System.out.println(getNome() + " Gritando");				
	}	
}
