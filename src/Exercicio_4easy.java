import javax.swing.JOptionPane;

public class Exercicio_4easy {

    public static void main(String[] args) {

        String numeroDigitado = JOptionPane.showInputDialog("Numero digitado:");

        int numero = Integer.parseInt(numeroDigitado);

        // Integer.parseInt(s) converte tudo que vem como String para inteiro

        int numeroInteiro = (numero * 2);

        System.out.println("Numero digitado " + numeroInteiro);

    }

}

// 4-) Faça um algoritmo para ler um número inteiro, armazenar em uma variável,
// calcular o dobro, e exibir.

// Iniciar Algoritmo

// Declarar variável do tipo Numerico/Inteiro: numeroDigitado, resultado;
// numeroDigitado = Ler (“10”);
// resultado = numeroDigitado * 2;
// Exibir: “O dobro do número digitado é: ” + resultado;

// Fim Algoritmo

// Console: O dobro do número digitado é: 20
