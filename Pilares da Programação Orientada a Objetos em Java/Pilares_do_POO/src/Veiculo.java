public  abstract class Veiculo {
    // Herança se trata de compartilhar recursos de forma que subclasses herdam da classe superclasse, mas isso não impede que as subclasses tenham suas próprias características.
    private String chassi;
    public void setChassi(String chassi) {
        this.chassi = chassi;
    }
    public String getChassi() {
        return chassi;
    }

    public abstract void ligar();
    // O metodo abstrato apesar de herdar características há a necessidade de definir o como vai ser feito, em cada subclasses.
}   
