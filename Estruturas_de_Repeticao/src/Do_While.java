import java.util.Random;
public class Do_While {
    // DO While  (faça enquanto) enquanto  uma condição for válida, o bloco do código será executado, estretanto o do while testa a condição após executar o código, significando que mesmo que a condição seja inválida ele vai executar ao menos uma vez.
    public static void main(String[] args) {
        System.out.println("Discando...");
		
		do {
			//excutando repetidas vezes até alguém atender
			System.out.println("Telefone tocando");
		
		}while(tocando());
		
		System.out.println("Alô !!!");
	}
	private static boolean tocando() {
		boolean atendeu = new Random().nextInt(3)==1;
		System.out.println("Atendeu? " + atendeu);
		//negando o ato de continuar tocando
		return ! atendeu;
    }
}
