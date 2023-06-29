package Apps;
public abstract class ServicoMensagemInstantanea {
    // Abstração para você ser você precisa fazer
    // exemplo: para você ser um "ServicoMensagemInstantanea" você deve enviar e receber mensagens.
    
    public abstract void enviarMensagem();
    public abstract void receberMensagem();
    // com isso você deve determinar nas classes filhas, os métodos a serem utilizados, no caso enviarMensagem() e receberMensagem() para defini-las como ServicoMensagemInstatanea.

    // Protected é utilizada quando queremos que as classes filhas consiga visualizar, diferente do public que todos visualizam e do privado que apenas a classe que tem a implementação pode visualiza-la.

    protected void validarConectadoInternet(){
        System.out.println("Validando se está conectado a internet");
    }
}