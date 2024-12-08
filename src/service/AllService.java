package service;

import model.Cliente;
import model.produto.Produto;
import model.produto.ProdutoPerecivel;
import model.produto.Venda;
import repository.SimulacaoRepositorio;

public class AllService {
    private SimulacaoRepositorio repository = new SimulacaoRepositorio();

    public void cadastrarProduto(Produto produto) {
        if (repository.getProdutos().contains(produto)) {
            System.out.println("o produto já está cadastrado");
        } else {
            repository.getProdutos().add(produto);
            System.out.println("produto cadastrado com sucesso!!");
        }
    }

    public void atualizarProduto(Produto produtoAntigo, Produto produto) {
        repository.getProdutos().remove(produtoAntigo);
        repository.getProdutos().add(produto);
    }

    public void realizarVenda(Produto produto, Cliente cliente, int qtd) {
        cadastrarCliente(cliente);


        if (produto instanceof ProdutoPerecivel) {
            ProdutoPerecivel produtoPerecivel = (ProdutoPerecivel) produto;

            if (produtoPerecivel.getQuantidadeNoEstoque() > 0) {

                produtoPerecivel.setQuantidadeNoEstoque(produtoPerecivel.getQuantidadeNoEstoque() - qtd);
                Venda venda = new Venda(cliente, produto);
                repository.getVendaList().add(venda);

            } else {
                System.out.println("estoque esgotado");
                return;
            }

        } else {
            Venda venda = new Venda(cliente, produto);
            repository.getVendaList().add(venda);
        }
        System.out.println("o cliente " + cliente.getNome() + " comprou o produto: " + produto.getNome());
        System.out.println("pagamento realizado!!");

    }

    public void verificarEstoque() {
        System.out.println(repository.getProdutos());
    }

    public void cadastrarCliente(Cliente cliente) {
        if (repository.getClienteList().contains(cliente)) {
            System.out.println("O cliente já está cadastrado");
        } else {
            repository.getClienteList().add(cliente);
        }
    }

    private void removerCliente(Cliente cliente) {
        repository.getClienteList().remove(cliente);
        System.out.println("o cliente " + cliente.getNome() + "foi removido!");
    }

    public void listarClientes() {
        System.out.println(repository.getClienteList());
    }
}
