public class Condicional_Banco {
    public static void main(String[] args) {
        double saldo = 29.0;
        double subtrairSaldo = 31.0;

        if (saldo >= subtrairSaldo){
            saldo = saldo - subtrairSaldo;
            System.out.println("seu saldo restant é: " + saldo);
        }
        else {
            saldo = saldo - subtrairSaldo ;
            System.out.println("seu saldo negativo é: " + saldo);
        }
    }
}
