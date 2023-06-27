public class For_Each_Arrays {
    public static void main(String[] args) {
        String alunos [] =  {"FELIPE","JONAS","JULIA","MARCOS"};
// Declaração do laço for "for()"
// Declaração da várivel "String aluno"
// ":" a cada interação de alunos o aluno atual do indice atual vai atualizar automaticamente essa variável.
// "String aluno" váriavel de escopo / visvel somente dentro do escopo.
        for(String aluno : alunos){
            System.out.println("Nome do aluno é " + aluno);
        }
    }
}
