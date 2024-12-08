package main;

import model.Cliente;
import model.produto.Produto;
import model.produto.ProdutoPerecivel;
import service.AllService;

public class main {
    public static void main(String[] args) {


        Produto produto = new Produto();
        produto.setNome("dwdwq");

        Cliente cliente = new Cliente();

        ProdutoPerecivel produtoPerecivel = new ProdutoPerecivel();
        produtoPerecivel.setNome("processador");

        AllService allService = new AllService();

        allService.realizarVenda(produto,cliente,1);
        allService.realizarVenda(produtoPerecivel,cliente,2);



    }
}
