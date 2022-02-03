import javax.swing.JOptionPane;

public class Exercicio05_medium {

    public static void main(String[] args) {

        int numeroDigitado, menorNumero = 0, i = 1;
        String numeroDigitadoString;

        while (i <= 5) {
            numeroDigitadoString = JOptionPane.showInputDialog("Digite um número");
            numeroDigitado = Integer.parseInt(numeroDigitadoString);

            if (numeroDigitado < menorNumero || i == i) {
                menorNumero = numeroDigitado;

            }
            i++;

            System.out.println("O numero: " + menorNumero + "é o menor");

        }

    }

}
