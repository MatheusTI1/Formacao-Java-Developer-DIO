public class For_em_Arrays {
    public static void main(String[] args) {
// arrays é um conjunto de elementos de um tipo correspondente. Podemos ter um array de String, int, dogs, funcionários, clientes e etc. No exemplo a seguir temos um array de alunos do tipo String, representando o nome deles, cada nome ou elemento é separado por uma virgula.

// ATENÇÃO EM ARRAYS O INDICE  SE INICIA A PARTIR DO 0 OU SEJA 0, 1, 2, 3, 4 e etc. PORTANTO O X DEVE COMEÇAR NO 0 EM NOSSA VARIÁVEL. CASO CONTRARIO ELE PULARIA O ALUNO DO ARRAY ZERO (FELIPE).
        String alunos[] = { "FELIPE", "JONAS", "JULIA", "MARCOS" };
// x representa o elemento do array.
// "int x=0". é a nossa inicialização.
// "x<alunos.length;" (length é tamanho) é a nossa condição.
// "x++" incrementação.
// variável + expressão de inicialização + incrementação.

	for (int x=0; x<alunos.length; x++) {

		System.out.println("O aluno no indice x=" + x + " é " + alunos[x]);
	}
    }
}
