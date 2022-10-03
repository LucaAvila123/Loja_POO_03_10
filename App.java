public class App {
    public static void main(String[] args) {
        //um vetor precisa de um construtor para seu tamanho máximo
        //tudo é objeto
        Produto vetorProdutos[] = new Produto[5];

        Livro capitaesDaAreia = new Livro("Capitães da Areia", 20, "Jorge Amado");
        JogoTabuleiro bancoImobiliario = new JogoTabuleiro("Banco Imobiliário", 70, 6);
        Livro estado_eRevolucao = new Livro("O Estado e a Revolução", 35, "Lenin");
        JogoTabuleiro jogoDaVida = new JogoTabuleiro("Jogo da Vida", 50, 4);
        Livro CalculoI = new Livro("Calculo, volume 1", 140, "James Stewart");

        vetorProdutos[0] = capitaesDaAreia;
        vetorProdutos[1] = bancoImobiliario;
        vetorProdutos[2] = estado_eRevolucao;
        vetorProdutos[3] = jogoDaVida;
        vetorProdutos[4] = CalculoI;

        for (Produto produto : vetorProdutos) {
            System.out.println(produto.toString());
        }
    }
}
