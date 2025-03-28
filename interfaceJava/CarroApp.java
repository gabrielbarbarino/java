import javax.swing.*;

public class CarroApp {
    public static void main(String[] args) {
        CarroController controller = new CarroController();
        boolean continuar = true;

        while (continuar) {
            String menu = "Escolha uma opção:\n"
                    + "1 - Cadastrar Carro\n"
                    + "2 - Listar Carros\n"
                    + "3 - Detalhar Carro\n"
                    + "4 - Sair";

            int opcao = Integer.parseInt(JOptionPane.showInputDialog(menu));

            switch (opcao) {
                case 1:
                    // Cadastro de carro
                    String marca = JOptionPane.showInputDialog("Informe a marca do carro:");
                    String modelo = JOptionPane.showInputDialog("Informe o modelo do carro:");
                    int anoFabricacao = Integer.parseInt(JOptionPane.showInputDialog("Informe o ano de fabricação do carro:"));
                    controller.cadastrarCarro(marca, modelo, anoFabricacao);
                    JOptionPane.showMessageDialog(null, "Carro cadastrado com sucesso!");
                    break;

                case 2:
                    // Listar carros
                    String lista = controller.listarCarros();
                    JOptionPane.showMessageDialog(null, lista);
                    break;

                case 3:
                    // Detalhar carro
                    if (controller.getTotalCarros() == 0) {
                        JOptionPane.showMessageDialog(null, "Não há carros cadastrados.");
                    } else {
                        int indice = Integer.parseInt(JOptionPane.showInputDialog("Informe o número do carro para detalhes:"));
                        String detalhes = controller.detalharCarro(indice - 1); // Ajuste para índice começar de 0
                        JOptionPane.showMessageDialog(null, detalhes);
                    }
                    break;

                case 4:
                    // Sair
                    JOptionPane.showMessageDialog(null, "Saindo...");
                    continuar = false;
                    break;

                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida. Tente novamente.");
                    break;
            }
        }
    }
}
