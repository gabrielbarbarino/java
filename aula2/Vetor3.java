public class Vetor3 {
    public static void main(String[] args) {
        String[] nomes = {"Alice", "Paulo", "Bruno", "Carlos", "Diana"};
        Double[] notas = {8.5, 5.7, 4.8, 9.2, 6.8};

        System.out.println("Notas dos Alunos: ");
        for(int i = 0; i < nomes.length; i++){
            System.out.println("Nome: "+ nomes[i] + " = " + notas[i]);
        }
    }
}
