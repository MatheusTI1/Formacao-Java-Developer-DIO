public class Computador {
    public static void main(String[] args) {
        // Abrindo MSN messenger
        System.out.println("Telegram");        
        Telegram tlg = new Telegram();
        tlg.enviarMensagem();
        tlg.receberMensagem();

        System.out.println("\nMSN");
        Msn msn = new Msn();
        msn.enviarMensagem();
        msn.receberMensagem();

        System.out.println("\nFacebook");
        Facebook fcb = new Facebook();
        fcb.enviarMensagem();
        fcb.receberMensagem();
        

        // Sem o encapsulamento o usuário tera que fazer todas essas ações toda vez que enviar a mensagem de forma manual
        // msn.validarConectadoInternet();
        // msn.enviarMensagem();
        // msn.savlarHistoricoMensagem();
        // msn.receberMensagem();

        // já com o encapsulamento o toda vez que ele disparar uma mensagem todas as ações serão efetuadas de forma automática sem que o usuário se quer veja o processo que levou

    }
}
