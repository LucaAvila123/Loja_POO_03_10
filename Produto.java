public class Produto {
    //os atributos de nome e preco são comuns a todas as subclasses
    private String nome;
    private double preco;

    //bom colocar construtor explícito
    public Produto(String nome, double preco){
        this.nome = nome;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }
    //o método toString é da classe Object, logo, toda subclasse (ou seja, qualquer classe declarada) precisa de Override
    @Override
    public String toString() {
        return nome.toString() + "; Preço: " + Double.toString(preco);
    }
}