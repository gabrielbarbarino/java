public class carro {
    private String marca;
    private String modelo;
    private int anoFabricacao;

    public carro(String marca, String modelo, int anoFabricacao) {
        this.marca = marca;
        this.modelo = modelo;
        this.anoFabricacao = anoFabricacao;
    }

    // Getters e Setters
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAnoFabricacao() {
        return anoFabricacao;
    }

    public void setAnoFabricacao(int anoFabricacao) {
        this.anoFabricacao = anoFabricacao;
    }

    // Método para mostrar os detalhes do carro
    public String detalhesCarro() {
        return "Marca: " + marca + "\nModelo: " + modelo + "\nAno de Fabricação: " + anoFabricacao;
    }
}
