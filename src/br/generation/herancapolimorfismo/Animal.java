package br.generation.herancapolimorfismo;

public class Animal implements AnimalAcoes{
	
	
	private String nome;
	private int idade;	

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	@Override
	public void emitirSom() {
		System.out.print(getNome());
		
		
	}

	@Override
	public void correr() {
		System.out.println(getNome() + " correndo");
		
	}

	@Override
	public void subirEmArvore() {
		System.out.println(getNome() + " subindo em arvore");
	}

}
