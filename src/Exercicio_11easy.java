import javax.swing.JOptionPane;

public class Exercicio_11easy {

    public static void main(String[] args) {
        int numeroDigiado;
        int i = 1;
        String numeroDigitadoStr = JOptionPane.showInputDialog("Digite um número");
        numeroDigiado = Integer.parseInt(numeroDigitadoStr);

        while (i <= 100) {
            numeroDigiado = numeroDigiado + 2;
            System.out.println("O total somado é: " + numeroDigiado);
            i++;

        }

        System.out.println("O total somado é: " + numeroDigiado);

    }

}
