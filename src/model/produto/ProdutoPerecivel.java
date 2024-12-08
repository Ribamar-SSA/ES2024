package model.produto;

public class ProdutoPerecivel extends  Produto{
    private String dataValidade;
    private int quantidadeNoEstoque;

    public int getQuantidadeNoEstoque() {
        return quantidadeNoEstoque;
    }

    public void setQuantidadeNoEstoque(int quantidadeNoEstoque) {
        this.quantidadeNoEstoque = quantidadeNoEstoque;
    }

    public ProdutoPerecivel() {
        this.dataValidade = dataValidade;
    }

    public ProdutoPerecivel(String dataValidade) {
        this.dataValidade = dataValidade;
    }

    public String getDataValidade() {
        return dataValidade;
    }

    public void setDataValidade(String dataValidade) {
        this.dataValidade = dataValidade;
    }


}
