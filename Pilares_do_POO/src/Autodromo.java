public class Autodromo {
    public static void main(String[] args) {
        Carro jeep =  new Carro();
        jeep.setChassi("123456");

        // jeep.conferirCambio();
        // jeep.conferirCombustivel();
        // Encapsulamento:
        // apesar de ser possível o usuário conferir esses fatos "cambio e combustível" não há a necessidade da pessoa ter que fazer isso toda a vez que for ligar o carro. Para solucionar isso vamos fazer o encapsulamento, ou seja vamos esconder ações do usuário que serão visíveis apenas em sua própria classe, ou seja apenas na classe carro. Ao ligar o veículo o próprio veículo se certificara de conferir os aspectos que foram apresentados.
        jeep.ligar();

        Moto z400 = new Moto();
        z400.setChassi("654321");
        
        z400.ligar();

        Veiculo Prototipo = z400;

        Prototipo.ligar();
    }
}
