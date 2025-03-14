import java.util.ArrayList;

public class ArrayListaNomes {
    public static void main(String[] args) {
        ArrayList<String> nomes = new ArrayList<>();
        
        nomes.add("Anderson");
        nomes.add("BOB");
        nomes.add("Carol");

        System.out.println("Primeiros nomes: " +nomes);

        // Acessando Elementos pelo indice
        System.out.println(nomes.get(0));

        // Interração sobre Elementos
        for(String nome: nomes){
            System.out.println(nome);
        }

        // removendo elementos

        nomes.remove("bob");
        System.out.println("Após remoção a lista é: " + nomes);
    }   
}
