import java.util.ArrayList;

public class CarroController {
    private ArrayList<carro> carros;

    public CarroController() {
        this.carros = new ArrayList<>();
    }

    // Método para adicionar um novo carro
    public void cadastrarCarro(String marca, String modelo, int anoFabricacao) {
        carro novoCarro = new carro(marca, modelo, anoFabricacao);
        carros.add(novoCarro);
    }

    // Método para listar todos os carros
    public String listarCarros() {
        if (carros.isEmpty()) {
            return "Não há carros cadastrados.";
        }

        StringBuilder lista = new StringBuilder("Carros cadastrados:\n");
        for (int i = 0; i < carros.size(); i++) {
            lista.append(i + 1).append(" - ").append(carros.get(i).getMarca())
                    .append(" - ").append(carros.get(i).getModelo()).append("\n");
        }
        return lista.toString();
    }

    // Método para detalhar um carro selecionado
    public String detalharCarro(int indice) {
        if (indice < 0 || indice >= carros.size()) {
            return "Carro não encontrado.";
        }
        return carros.get(indice).detalhesCarro();
    }

    // Retorna a quantidade de carros cadastrados
    public int getTotalCarros() {
        return carros.size();
    }
}
