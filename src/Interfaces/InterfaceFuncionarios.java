package Interfaces;

import Models.Funcionario;


public interface InterfaceFuncionarios {

    public void adicionarFuncionario(String nome , String cpf);

    public void removerFuncionario();

    public void atualizarFuncionario();

    public Funcionario getListaEspec();

    
}