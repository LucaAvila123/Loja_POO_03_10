public class JogoTabuleiro extends Produto {
    private int idadeMinima;
    
    //dentro desse construtor tem o construtor de Produto por conta do super
    public JogoTabuleiro(String nome, double preco, int idadeMinima){
        super(nome, preco);
        this.idadeMinima = idadeMinima;
    }

    public int getIdadeMinima() {
        return idadeMinima;
    }

    //colocando informações 
    @Override
    public String toString() {
        return "Jogo: " + super.toString() + ", proibido para menores de " + String.valueOf(idadeMinima) + " anos";
    }
}