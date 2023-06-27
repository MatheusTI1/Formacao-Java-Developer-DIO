package edu.matheus.Métodos;

public class SmartTV {
    // Um método deve ser nomeado como uma ação correr, andar , voar e etc
    // Seguir o padrão camelCase exemplos: calcularImposto, atravessarRua
    //TV
    //Definindo estado inicial
    boolean ligada = false;
    int canal = 1;
    int volume = 25;

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

    public void subirCanal (){
        canal ++;
    }

    public void descerCanal (){
        canal --;
    }
    
    public void mudarCanal (int novoCanal){
        canal = novoCanal;
    }
    
}
