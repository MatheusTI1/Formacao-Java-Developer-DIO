package app;

import pacote1.dog;
import pacote2.person;

public class main {
    public static void main(String[] args) {
        System.out.println("Comando Main Enviado, Resposta do dog.java recebida: ");
        dog dogUM = new dog();
        person pessoaUM = new person();
        dogUM.bark();
        pessoaUM.hello();
    }
}
