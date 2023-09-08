package Models;

public class RoupaInferior extends Produto {

    public RoupaInferior() {}

    public RoupaInferior(String nome, double preco, int quantidade, String genero, String tipo, String  tamanho){
        super(nome, preco, quantidade, genero, tipo, tamanho);
    }
    
    @Override
	public String toString() {
		return "PRODUTO INFERIOR [ " + getNome() + ", PREÇO = " + getPreco() + ", Quantidade = " + getQuantidade() + " ]";
	}
}
