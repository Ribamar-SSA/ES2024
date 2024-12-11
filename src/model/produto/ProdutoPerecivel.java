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

    public ProdutoPerecivel(int quantidadeNoEstoque) {
        this.quantidadeNoEstoque = quantidadeNoEstoque;
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

    @Override
    public String toString() {
        return "ProdutoPerecivel{" +
                "dataValidade='" + dataValidade + '\'' +
                ", quantidadeNoEstoque=" + quantidadeNoEstoque +
                ", nome='" + nome + '\'' +
                ", preco=" + preco +
                ", codigoSKU='" + codigoSKU + '\'' +
                '}';
    }
}
