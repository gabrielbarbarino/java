import java.util.Scanner;

public class TratamentoProf {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.print("Informe o numerador: ");
        int numerador = teclado.nextInt();

        System.out.print("Informe o dominador: ");
        int dominador = teclado.nextInt();

        int resultado = 0;

        try{
                resultado = numerador / dominador;
            }catch(ArithmeticException e){
                System.out.println("Não foi Possivel Dividir!");
            }catch(Exception e){
                System.out.println("Erro enesperado!"+ e.getMessage());            
            }finally{
                System.out.println("Finalizando...");
            }

            teclado.close();
        }
    }

