package edu.matheus.Anatomia_Classes;
public class NomeCompleto {
    public static void main(String[] args) {
        String primeiroNome = "José"; // variáveis
        String segundoNome = "Gonsales";

        String nomeCompleto = nomeCompleto (primeiroNome, segundoNome);
        
        System.out.println(nomeCompleto);
    }
    
    public static String nomeCompleto (String primeiroNome, String segundoNome){   //função
        return "Resultado do método = " + primeiroNome.concat(" ").concat(segundoNome);
    }
}
