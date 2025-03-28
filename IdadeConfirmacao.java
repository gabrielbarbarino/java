import javax.swing.*;

public class IdadeConfirmacao {
    public static void main(String[] args) {
        String idade = JOptionPane.showInputDialog("Digite sua idade");
        int idadeConvertida = Integer.parseInt(idade);


       if (idadeConvertida > 0){
           if(idadeConvertida >= 18){
               JOptionPane.showMessageDialog(null, "Você tem "+ idadeConvertida +"! Já é de maior", "Você é de maior!", JOptionPane.INFORMATION_MESSAGE);
           } else {
               JOptionPane.showMessageDialog(null, "Você tem "+ idadeConvertida +"! Já é de menor", "Você é de Menor!", JOptionPane.INFORMATION_MESSAGE);
           }
       } else{
           JOptionPane.showMessageDialog(null, "Idade Inválida!", "ERROO!", JOptionPane.INFORMATION_MESSAGE);
       }

    }
}
