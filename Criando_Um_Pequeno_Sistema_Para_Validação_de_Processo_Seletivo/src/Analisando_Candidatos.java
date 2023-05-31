public class Analisando_Candidatos {
    public static void main(String[] args) {
        analisarCandidato(2000.0);
        analisarCandidato(1900.0);
        analisarCandidato(4000.0);
    }
    static void analisarCandidato(double salarioPretentido){
        Double salarioBase = 2000.0;
        if (salarioBase > salarioPretentido){
            System.out.println("LIGAR PARA O CANDIDATO");
        }
        else if (salarioBase == salarioPretentido){
            System.out.println("LIGAR PARA O CANDIDATO, COM CONTRA PROPOSTA");
        }
        else{
            System.out.println("AGUARDANDO RESULTADO DOS DEMAIS CANDIDATOS");
        }
    }
}
