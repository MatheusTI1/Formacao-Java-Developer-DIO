import java.util.concurrent.ThreadLocalRandom;
public class Selecionando_Candidatos {
    public static void main(String[] args) {
        selecaoCandidatos();
    }
    static void selecaoCandidatos(){
        String [] candidatos = {"FELIPE","MÁRCIA","JULIA","PAULO","AUGUSTO","MÔNICA","FABRÍCIO","MIRELA","DANIELA","JORGE"};

        int candidatosSeelcionados = 0;
        int candidatosAtual = 0;
        double salarioBase = 2000.0;
        
        while(candidatosSeelcionados < 5 && candidatosAtual < candidatos.length){
            String candidato = candidatos[candidatosAtual];
            double salarioPretentido = valorPretendido();

            System.out.println("O candidato " + candidato + " Solicitou este valor de salário " + salarioPretentido );
            if (salarioBase >= salarioPretentido) {
                System.out.println("O candidato " + candidato + " foi seleciondado para vaga");
                candidatosSeelcionados++;
            }
            candidatosAtual++;
        }
        System.out.println("Candidatos selecionados " + candidatosSeelcionados);
        System.out.println("Candidatos consultados " + candidatosAtual);
    }


    static double valorPretendido() {
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
   }
}
