public class Imprimindo_uma_lista_com_os_candidatos_selecionados {
    public static void main(String[] args) {
        imprimirSelecionados();
    }
    static void imprimirSelecionados(){
        String [] candidatos = {"MICAEL", "JONAS", "MATHEUS", "PEDRO", "GUILHERME"};

        System.out.println("Imprimindo a lista de candidatos informando o indice do elemento");

        for (int i = 0; i < candidatos.length; i++) {
            System.out.println("O candidato de n" + (i+1) + "  é o " + candidatos[i]);
        }

        System.out.println("forma abreviada de interação for each");
        
        for(String candidato: candidatos ){
            System.out.println("O candidato selecionado foi " + candidato);
        }
    }
}
    