public class Produto {
    private String dsDetalhes;
    private String cdProduto;
    private String nmProduto;
    private Double vlPreco;
    private Character flAtivo;
    private Integer qtProdutos;

    public Produto (String cdProduto, String nmProduto,
                    Double vlPreco, String dsDetalhes, Character flAtivo){
        this.cdProduto = cdProduto;
        this.nmProduto = nmProduto;
        this.dsDetalhes = dsDetalhes;
        this.vlPreco = vlPreco;
        this.flAtivo = flAtivo;
    }

    public void adicionarEstoque(int quantidade) {
        this.qtProduto += quantidade;
    }
    public void removerEstoque(int quantidade){
        if (int quantidade > this.qtProduto){
            System.out.println("Estoque insuficiente");
            return;
        }
    }
    public String getDsDetalhes() {
        return dsDetalhes;
    }

    public void setDsDetalhes(String dsDetalhes) {
        this.dsDetalhes = dsDetalhes;
    }

    public String getCdProduto() {
        return cdProduto;
    }

    public void setCdProduto(String cdProduto) {
        this.cdProduto = cdProduto;
    }

    public String getNmProduto() {
        return nmProduto;
    }

    public void setNmProduto(String nmProduto) {
        this.nmProduto = nmProduto;
    }

    public Double getVlPreco() {
        return vlPreco;
    }

    public void setVlPreco(Double vlPreco) {
        this.vlPreco = vlPreco;
    }

    public Character getFlAtivo() {
        return flAtivo;
    }
    public void setFlAtivo(Character flAtivo) {
        this.flAtivo = flAtivo;
    }
}
}
