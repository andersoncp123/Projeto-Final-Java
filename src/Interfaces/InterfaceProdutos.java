package Interfaces;

import java.util.List;

import Models.Produto;

public interface InterfaceProdutos {
    
    public void cadastrarProduto (String nome, double preco, int quantidade, String genero, String tipo, String tamanho); 

    public void removerProduto(int indice);

    public void atualizarProduto(int indice);

    public void mostrarProdutos();

    public List<Produto> getProdutoCadastrados();

}