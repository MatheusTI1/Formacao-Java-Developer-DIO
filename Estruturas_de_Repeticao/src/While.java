import java.util.concurrent.ThreadLocalRandom; //gera um numero aleatorio.
public class While {
    // While = (enquanto), enquanto  uma condição for válida, o bloco do código será executado.
    // Enquanto joão não gastar sua mesada de 50 reais em doce ele não vai parar até que isso aconteça.
    public static void main(String[] args) {
        double mesada = 50.0;
        while(mesada>0){
            double valorDoce = valorAleatorio();
            if(valorDoce > mesada)
                valorDoce = mesada;
            
            System.out.println("Doce do valor: " + valorDoce + " Adicionando no carrinho");
            mesada = mesada - valorDoce;
        }
        System.out.println("Mesada: " + mesada);
        System.out.println("João gatou toda a sua mesada em doces");
    }
    private static double valorAleatorio(){
        return ThreadLocalRandom.current().nextDouble(2,8);
    }
}
