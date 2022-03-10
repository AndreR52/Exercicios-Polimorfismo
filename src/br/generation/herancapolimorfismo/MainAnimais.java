package br.generation.herancapolimorfismo;

public class MainAnimais extends Animal {

	public static void main(String[] args) {
		
		Cachorro cac = new Cachorro();
		Cavalo cav = new Cavalo();
		Preguica pre = new Preguica();
		
		cac.setNome("Cachorro");
		cac.setIdade(8);
		
		cav.setNome("Cavalo");
		cav.setIdade(12);
		
		pre.setNome("Preguiça");
		pre.setIdade(3);
		
		System.out.println("O " + cac.getNome() + " tem " + cac.getIdade() + " anos");
		
		System.out.println("O " + cav.getNome() + " tem " + cav.getIdade() + " anos");
		
		System.out.println("A " + pre.getNome() + " tem " + pre.getIdade() + " anos");
		
		cac.emitirSom();
		
		cac.correr();
		
		cav.emitirSom();;
		
		cav.correr();
		
		pre.emitirSom();
		
		pre.subirEmArvore();
		
		
	}

}
