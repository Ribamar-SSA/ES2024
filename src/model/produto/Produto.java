package model.produto;

public class Produto {
     String nome;
     double preco;
     String codigoSKU;


    public String getCodigoSKU() {
        return codigoSKU;
    }

    public void setCodigoSKU(String codigoSKU) {
        this.codigoSKU = codigoSKU;
    }


    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }


    @Override
    public String toString() {
        return "Produto{" +
                "nome='" + nome + '\'' +
                ", preco=" + preco +
                ", codigoSKU='" + codigoSKU + '\'' +
                ", quantidadeEstoque=" + quantidadeEstoque +
                '}';
    }
}
