public class Condicao_Ternaria_IF_ELSE_IF_ELSE {
    public static void main(String[] args) {
        int nota = 5;
        String resultado = nota >=7 ? "Aprovado" : nota >=5 && nota <7 ? "Recuperação" : "Reprovado";

        System.out.println(resultado);
    }
}
