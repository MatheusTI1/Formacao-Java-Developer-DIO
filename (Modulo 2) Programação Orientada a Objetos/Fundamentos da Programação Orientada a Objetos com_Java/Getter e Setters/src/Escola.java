public class Escola {
    public static void main(String[] args) {
        Aluno  Felipe =  new Aluno();
        Felipe.setNome("Felipe");
        Felipe.setIdade(12);
        Felipe.setSexo("Masculino");

        System.out.println("O aluno " + Felipe.getNome() + " tem " + Felipe.getIdade() + " anos, sexo: " + Felipe.getSexo());
    }
    
}
