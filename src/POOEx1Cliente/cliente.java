package POOEx1Cliente;

public class cliente {
	//atributos;
	private String nomeCliente;
	private String classeBonus;
	private String idadeCliente;

	public cliente (String cliente,String bonus,String idade)
	{
		nomeCliente=cliente;
		classeBonus=bonus;
		idadeCliente=idade;
	}
	
	//metodo;
	public String getDadosCliente()
	{
		String DadosCliente = "Nome do cliente:"+nomeCliente+"\n"+"Classe Bonus:"+classeBonus+"\t"+"Idade:"+idadeCliente+"\n";
		return DadosCliente;
	}
}
