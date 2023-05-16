package edu.matheus.Métodos;

public class ExplicandoEscopoSmartTV {
    // Um método deve ser nomeado como uma ação correr, andar , voar e etc
    // Seguir o padrão camelCase exemplos: calcularImposto, atravessarRua
    //TV
    //Definindo estado inicial


    // As três variáveis a seguir são atributos a nivel de classe então toda a minha classe pode 
    // acessa-la e alterar seus  atributos, Ou seja o Public void "mudarCanal" pode acessa-la e 
    // alterar o valor da mesma.
    // Porem  não podemos adicionar o "novoCanal" ao "descerCanal", pois a variável não
    // é reconhecida, porque ela veio como parâmetro no bloco do método anterior e não está presente
    // no próximo método, ou seja esta fora de seu escopo.
    boolean ligada = false;
    int canal = 1;
    int volume = 25;

    public void mudarCanal (int novoCanal){
        canal = novoCanal;
    }

    public void descerCanal (){
        canal --;
    }

    public void subirCanal (){
        canal ++;
    }

    public void ligar (){
        ligada = true;
    }

    public void desligar() {
        ligada = false;
        
    }

    public void aumentarVolume (){
        volume = volume + 5 ;
        System.out.println("TV --Volume atual " + volume + "--");
    }

    public void diminuirVolume (){
        volume = volume - 5;
        System.out.println("TV --Volume atual " + volume + "--");
    }
    
}
