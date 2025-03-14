import java.util.Scanner;

public class VetorAtividade2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[5];
        int maior = 0;
    
        System.out.println("--------------------------------------------");
        System.out.println("           Descubra o maior Numero          ");
        System.out.println("--------------------------------------------");
        for(int i = 0; i < numeros.length; i++){
            System.out.print("Digite o numero: ");
            numeros[i] = sc.nextInt();
            if(numeros[i] > maior){
                maior = numeros[i];
            }
        }

        System.out.println("--------------------------------------------");
        System.out.println("O maior numero do Array é = " + maior);
        sc.close();
    }
}
