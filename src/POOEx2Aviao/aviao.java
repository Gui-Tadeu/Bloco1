package POOEx2Aviao;

public class aviao {
	private String nomeAviao;
	private String empresaAviao;
	private String statusMotor;
	private String statusVoo;

	public aviao (String aviao,String empresa,String motor,String voo)
	{
		nomeAviao=aviao;
		empresaAviao=empresa;
		statusMotor=motor;
		statusVoo=voo;
	}
	
	//metodo;
	public String getDadosVoo()
	{
		String DadosAviao = "Avi�o:"+nomeAviao+"\n"+"Companhia a�rea:"+empresaAviao+"\n"+"Status Motor:"+statusMotor+"\n"+"Status de voo:"+statusVoo+"\n";
		return DadosAviao;
	}
}
