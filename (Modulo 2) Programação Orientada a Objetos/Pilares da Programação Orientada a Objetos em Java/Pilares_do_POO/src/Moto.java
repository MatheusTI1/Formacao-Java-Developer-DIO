public class Moto extends Veiculo{
    // Criamos o parâmetro chassi em duas classes diferentes, imagine que temos diversos veículos, caminhão, trator e etc isso geraria uma redundância gigantes para solucionar isso usamos a herança na classe Veiculo e todo veiculo que criarmos deve herdar a classe veiculo.


    // private String chassi;
    // public String getChassi() {
    //     return chassi;
    // }
    // public void setChassi(String chassi) {
    //     this.chassi = chassi;
    // }

    // ambos tem o método ligar mas fazem a mesma função de forma diferente ou seja Polimorfismo
    public void ligar(){
        // Encapsulamento
        System.out.println("MOTO LIGADA");
    }
    
}
