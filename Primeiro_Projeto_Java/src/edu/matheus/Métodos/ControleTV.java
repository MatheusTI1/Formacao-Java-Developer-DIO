package edu.matheus.Métodos;

public class ControleTV {
    public static void main(String[] args) {
        
        SmartTV tvSmart = new SmartTV();
        System.out.println("A TV está ligada? " + tvSmart.ligada);
        System.out.println("Canal atual: " + tvSmart.canal);
        System.out.println("Volume atual: " + tvSmart.volume);

        tvSmart.ligar();
        System.out.println("Novo Status = A TV está ligada? " + tvSmart.ligada);
        
        tvSmart.aumentarVolume();
        System.out.println("O volume atual é: " + tvSmart.volume);

        tvSmart.diminuirVolume();
        System.out.println("O volume atual é: " + tvSmart.volume);

        tvSmart.descerCanal();
        System.out.println("O canal atual é: " + tvSmart.canal);

        tvSmart.subirCanal();
        System.out.println("O canal atual é: " + tvSmart.canal);

        tvSmart.mudarCanal(10);
        System.out.println("O canal atual é: " + tvSmart.canal);
    }
}
