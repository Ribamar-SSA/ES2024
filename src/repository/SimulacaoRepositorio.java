package repository;

import model.Cliente;
import model.produto.Produto;
import model.produto.Venda;

import java.util.ArrayList;
import java.util.List;

public class SimulacaoRepositorio {


    private List<Produto> produtos = new ArrayList<>();
    private List<Cliente> clienteList = new ArrayList<>();
    private List<Venda> vendaList = new ArrayList<>();

    public List<Venda> getVendaList() {
        return vendaList;
    }

    public List<Produto> getProdutos() {
        return produtos;
    }

    public List<Cliente> getClienteList() {
        return clienteList;
    }

}
