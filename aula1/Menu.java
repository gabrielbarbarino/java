import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int op = 0;

        while(op != 5) {
            System.out.println("\n ==== MENU  ====");
            System.out.println("1 - CADASTRADAR");
            System.out.println("2 - LISTAR");
            System.out.println("3 - ALTERAR");
            System.out.println("4 - REMOVER");
            System.out.println("5 - SAIR");
            System.out.println("DIGITE A OPÇÃO: ");
            op = teclado.nextInt();

            switch (op) {
                case 1:
                    System.out.println();
                    break;
                case 2:
                    System.out.println();
                    break;
                case 3:
                    System.out.println();
                    break;
                case 4:
                    System.out.println();
                    break;
                case 5:
                    System.out.println();
                    break;
                default:
                    System.out.println("Opção invalida!");
                    break;
            }
        }

        teclado.close();
    }
}