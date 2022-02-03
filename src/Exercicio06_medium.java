import javax.swing.JOptionPane;

public class Exercicio06_medium {

    public static void main(String[] args) {

        int fatorial, i;
        String fatorialDigitadoString = JOptionPane.showInputDialog("Digite um número para calcular o fatrial");

       fatorial = Integer.parseInt(fatorialDigitadoString);
       i = fatorial;

        while (i > 1) {
            fatorial = fatorial * (i -1);
            i--;

        }
        System.out.println("O fatorial do numero digitado é " + fatorial);

        
    }

}
