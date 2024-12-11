package main;

import model.Cliente;
import model.produto.Produto;
import model.produto.ProdutoDigital;
import model.produto.ProdutoPerecivel;
import service.AllService;

public class main {
    public static void main(String[] args) {

        AllService allService = new AllService();

        Produto castanha = new Produto();
        castanha.setNome("dwdwq");
        castanha.setPreco(2);
        castanha.setCodigoSKU("dw123x");

        ProdutoPerecivel chocolate = new ProdutoPerecivel(10);
        chocolate.setNome("garoto");
        chocolate.setPreco(10);
        chocolate.setCodigoSKU("gy123s");

        ProdutoDigital windows10 = new ProdutoDigital("sqpa1234");
        windows10.setNome("ultimate");
        windows10.setPreco(2);
        windows10.setCodigoSKU("ft123x");

        Cliente ribamar = new Cliente("Ribamar");
        Cliente gabryell = new Cliente("Gabryel");
        Cliente joandesson = new Cliente("Joandesson");


        allService.listarClientes();
        allService.cadastrarCliente(ribamar);
        allService.cadastrarCliente(gabryell);
        allService.cadastrarCliente(joandesson);
        allService.listarClientes();

        System.out.println("cadastrando produtos");

        allService.verificarEstoque();
        allService.cadastrarProduto(castanha);
        allService.cadastrarProduto(chocolate);
        allService.cadastrarProduto(windows10);

        System.out.println("listando produtos cadastrados:");
        allService.verificarEstoque();

        System.out.println("removendo o ribamar:");
        allService.removerCliente(ribamar);
        System.out.println("listando clientes cadastrados:");
        allService.listarClientes();


    }
}
