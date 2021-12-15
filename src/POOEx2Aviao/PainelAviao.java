package POOEx2Aviao;

public class PainelAviao {

	public static void main(String[] args) {
		aviao aviao1 = new aviao("Boeing","Latam","Ligado","Decolagem autorizada");
		aviao aviao2 = new aviao("AirBus","Gol","Desligado","Negado");
		aviao aviao3 = new aviao("Boeing","Malaysia Airlines","Ligado","Em voo");
		aviao aviao4 = new aviao("Embraer","Latam","Ligado","Em voo");
		System.out.println(aviao1.getDadosVoo());
		System.out.println(aviao2.getDadosVoo());
		System.out.println(aviao3.getDadosVoo());
		System.out.println(aviao4.getDadosVoo());
	}

}
