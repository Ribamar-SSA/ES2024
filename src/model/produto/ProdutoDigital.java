package model.produto;

public class ProdutoDigital extends Produto{
    private String licenca;

    public ProdutoDigital(String licenca) {
        this.licenca = licenca;
    }

    public String getLicenca() {
        return licenca;
    }

    public void setLicensa(String licensa) {
        this.licenca = licensa;
    }
}
