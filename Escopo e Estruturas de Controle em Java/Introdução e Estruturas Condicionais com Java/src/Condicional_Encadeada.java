public class Condicional_Encadeada {
    public static void main(String[] args) {
        
        int nota = 10;

        if (nota >= 7 && nota < 10)
        System.out.println("Aprovado");
        
        else if (nota >= 5 && nota <7 )
        System.out.println("Recuperação");

        else if (nota == 10)
        System.out.println("Bolsa de Icentivo");

        else
        System.out.println("Reprovado");
    }
}
