import java.util.Locale;
import java.util.Scanner;
import java.util.InputMismatchException;

// TRATAMENTO DE EXCEÇÕES
public class Try_Catch {
    public static void main(String[] args) {
        try{
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        
        System.out.println("Digite seu  nome: ");
        String nome = scanner.next();

        System.out.println("Digite seu sobrenome: ");
        String sobrenome = scanner.next();

        System.out.println("Digite sua idade: ");
        int idade = scanner.nextInt();

        System.out.println("digite sua altura");
        double altura = scanner.nextDouble();

        System.out.println("Olá, me chamo " + nome.toUpperCase() + " " + sobrenome.toUpperCase());
        System.out.println("Tenho " + idade + " anos ");
        System.out.println("Minha altura é " + altura + "cm ");
        scanner.close();
        }
        catch (InputMismatchException e){
            System.err.println("Os campos idade e altura precisam ser numéricos, utilize '.' ao invés de ',' obrigado.");
        }
        //err sinaliza erro.
    }
}
