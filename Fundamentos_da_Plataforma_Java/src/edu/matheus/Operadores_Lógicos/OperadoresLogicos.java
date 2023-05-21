package edu.matheus.Operadores_Lógicos;

public class OperadoresLogicos {
    public static void main(String[] args) {



        //Atribuição
        //classe Operadores.java
        String nome = "GLEYSON";
        int idade = 22;
        double peso = 68.5;
        char sexo = 'M';
        boolean doadorOrgao = false;
        // Date dataNascimento = new Date();



        // Aritméticos
        double soma = 10.5 + 15.7;
        int subtração = 113 - 25;
        int multiplicacao = 20 * 7;
        int divisao = 15 / 3;
        int modulo = 18 % 3;
        double resultado = (10 * 7) + (20/4);




        // Concatenação
        String nome1 = "João";
        String nome2 = "Paulo";
        String nomeCompleto = nome1 + nome2;
        System.out.println(nomeCompleto);
        
        String nomeCompleto2 = "LINGUAGEM" + "JAVA";  
        //qual o resultado das expressoes abaixo?
        String concatenacao ="?"; 

        concatenacao = 1+1+1+"1";

        concatenacao = 1+"1"+1+1;

        concatenacao = 1+"1"+1+"1";

        concatenacao = "1"+1+1+1;

        concatenacao = "1"+(1+1+1);
        


        //Unários   
        int numero = 5;   
        //Imprimindo o numero negativo
        System.out.println(- numero);
        // Transformando numero  em negativo
        numero = - numero;
        // Transformando numero positivo novamente
        numero =  numero * -1;
        //incrementando numero em mais 1 numero, imprime 6
        numero ++;
        System.out.println(numero);
        //incrementando numero em mais 1 numero, imprime 7
        System.out.println(numero ++);// ops algo de errado não está certo
        System.out.println(numero);// agora sim, numero virou 7
        //ordem de precedencia conta aqui
        System.out.println(++ numero);
        boolean verdadeiro = true;
        System.out.println("Inverteu " + !verdadeiro);
        //alterando valor da variavel
        verdadeiro = !verdadeiro;
        System.out.println(verdadeiro);



        // Ternário
        // classe Operadores.java
        int a, b;
        a = 5;
        b = 6;
        /* EXEMPLO DE CONDICIONAL UTILIZANDO UMA ESTRUTURA IF/ELSE
        if(a==b)
        resultado = "verdadeiro";
        else
        resultado = "falso";
        */
        //MESMA CONDICIONAL, MAS DESSA VEZ, UTILIZANDO O OPERADOR CONDICIONAL TERNÁRIO
        //Operação booleana
        //            se a for igual a b retornar verdedeiro se não retornar falso
        String resultadoTernario = (a==b) ? "verdadeiro" : "falso";
        System.out.println(resultadoTernario);



        //Relacionais
        int numero1 = 1;
        int numero2 = 2;

        if(numero1 > numero2)
            System.out.print("Numero 1 maior que numero 2");

        if(numero1 < numero2)
            System.out.print("Numero 1 menor que numero 2");

        if(numero1 >= numero2)
            System.out.print("Numero 1 maior ou igual que numero 2");

        if(numero1 <= numero2)
            System.out.print("Numero 1 menor ou igual que numero 2");

        if(numero1 != numero2)
            System.out.print("Numero 1 é diferente de numero 2");

        

        //Comparações avançadas
        String nomeUM = "JAVA";
        String nomeDois = "JAVA";
        System.out.println(nomeUM == nomeDois); //true

        String nomeTres = new String("JAVA");
        
        System.out.println(nomeUM == nomeTres); //false

        String nomeQuatro = nomeTres;

        System.out.println(nomeTres == nomeQuatro); //true
        
        //equals na parada
        System.out.println(nomeUM.equals(nomeDois)); //??
        System.out.println(nomeDois.equals(nomeTres)); //??
        System.out.println(nomeTres.equals(nomeQuatro)); //??




        //Lógicos ou Tabela Verdade
        boolean condicao1=true;

        boolean condicao2=true;

        /* Aqui estamos utilizando o operador lógico E para fazer a união de duas 
        expressões. 
        É como se estivesse escrito:
        "Se Condicao1 e Condicao2 forem verdadeiras, executar código"
        */

        if(condicao1 && condicao2)
            System.out.print("Os dois valores precisam ser verdadeiros");;

        if(condicao1 && (7>9))
        System.out.print("Os dois valores precisam ser verdadeiros");;

        //Se condicao1 OU condicao2 for verdadeira, executar código.
        if(condicao1 || condicao2)
            System.out.print("Um dos valores precisa ser verdadeiro");

        //Depuração  "ao clicar no botão vermelho é ativado a depuração que vai depurar 
        // linha por linha"
    }
}
