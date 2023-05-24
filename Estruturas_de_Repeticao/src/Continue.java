public class Continue {
    // Continue = continuar, muda o fluxo da interação no momento que ele for chamado sem parar a execução.

    public static void main(String[] args) {
        for(int numero = 1; numero <=5; numero ++){
            if(numero==3)
                continue;

                System.out.println(numero);
        }
    }
}
