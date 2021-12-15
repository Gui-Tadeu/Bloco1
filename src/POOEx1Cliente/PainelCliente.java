package POOEx1Cliente;

public class PainelCliente {

	public static void main(String[] args) {
		cliente cliente1 = new cliente("João Santocristo","5","33");
		cliente cliente2 = new cliente("Jhonny B. Good","3","22");
		cliente cliente3 = new cliente("Kurty Kobain","12","27");
		cliente cliente4 = new cliente("Mago de SãoTomé","33","22");
		System.out.println(cliente1.getDadosCliente());
		System.out.println(cliente2.getDadosCliente());
		System.out.println(cliente3.getDadosCliente());
		System.out.println(cliente4.getDadosCliente());
	}

}
