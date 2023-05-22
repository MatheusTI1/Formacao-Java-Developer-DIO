public class Switch_Case {
    public static void main(String[] args) {
        String sigla = "A";
        switch (sigla) {
            case "P":{
                System.out.println("Pequeno");
                break;
            }
            case "M":{
                System.out.println("Medio");
                break;
            }
            case "G":{
                System.out.println("Grande");
                break;
            }
            case "GG":{
                System.out.println("Gigante");
                break;
            }
            default:
                break;
        }
    }
}
