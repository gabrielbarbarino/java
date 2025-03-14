public class Numero{
    public static void main(String args[]){
        try{
            int resultado = 10/0;
        }catch(ArithmeticException e){
            System.out.println("Erro: divisão invalida!");
        } finally {
            System.out.println("Finaçizando...");
        }
    }
}
