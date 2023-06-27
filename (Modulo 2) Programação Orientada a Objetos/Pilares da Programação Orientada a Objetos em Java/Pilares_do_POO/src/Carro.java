public class Carro extends Veiculo{
// extends = herança


    // private String chassi;
    // public String getChassi() {
    //     return chassi;
    // }
    // public void setChassi(String chassi) {
    //     this.chassi = chassi;
    // }

    //ambos tem o método ligar mas fazem a mesma função de forma diferente ou seja Polimorfismo
    public void ligar(){
        // Encapsulamento
        conferirCambio();
        conferirCombustivel();
        System.out.println("CARRO LIGADO");
    }
    public void conferirCombustivel(){
        System.out.println("CONFERINDO COMBUSTÍVEL");
    } 
    public void conferirCambio(){
        System.out.println("CONFERINDO CAMBIO em P");
    }  
}
