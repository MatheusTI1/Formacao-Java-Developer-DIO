public class Computador {
    public static void main(String[] args) {
        // Abrindo MSN messenger
        MSN msn = new MSN ();

        // Sem o encapsulamento o usuário tera que fazer todas essas ações toda vez que enviar a mensagem de forma manual
        // msn.validarConectadoInternet();
        // msn.enviarMensagem();
        // msn.savlarHistoricoMensagem();
        // msn.receberMensagem();

        // já com o encapsulamento o toda vez que ele disparar uma mensagem todas as ações serão efetuadas de forma automática sem que o usuário se quer veja o processo que levou

        msn.enviarMensagem();
        
        msn.receberMensagem();
    }
}
