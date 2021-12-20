package HerançaEncapsulamento;

public class testeAnimal {

	public static void main(String[] args) 
	{
	cachorro c = new cachorro();
	cavalo g = new cavalo();
	preguiça p = new preguiça();
	
	c.setNome("Rex");
	c.setIdade(5);
	c.som();
	System.out.println("O cachorro "+ c.getNome()+" tem "+c.getIdade()+" anos " );
	}

}
