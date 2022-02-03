import javax.swing.JOptionPane;

public class Exercicio_5easy {

    public static void main(String[] args) {

        // int primeiroNumero, segundoNumero, terceiroNumero;

        // String primeiroDigitoStg = JOptionPane.showInputDialog("Digite o primeiro
        // numero");
        // String segundoDigitoStg = JOptionPane.showInputDialog("Digite o segundo
        // numero");
        // String terceiroDigitoStg = JOptionPane.showInputDialog("Digite o terceiro
        // numero");

        // primeiroNumero = Integer.parseInt(primeiroDigitoStg);
        // segundoNumero = Integer.parseInt(segundoDigitoStg);
        // terceiroNumero = Integer.parseInt(terceiroDigitoStg);

        // System.out.println("A soma dos tres números é" + (primeiroNumero+
        // segundoNumero));

        String primeiroNumero = JOptionPane.showInputDialog("10");
        String segundoNumero = JOptionPane.showInputDialog("20");
        String terceiroNumero = JOptionPane.showInputDialog("30");

        int numero = Integer.parseInt(primeiroNumero + segundoNumero + terceiroNumero);

        numero = 10;
        numero = 20;
        numero = 30;

        System.out.println("A soma dos numeros" + primeiroNumero + segundoNumero + terceiroNumero);

    }

}

// 5-) Faça um algoritmo para ler três números inteiros, armazenar em variáveis,
// e exibir a soma, a subtração, multiplicação e a média dos três números
// digitados.

// Algoritmo

// Declarar variaveis do tipo inteiro: primeiroNumero, segundoNumero,
// terceiroNumero;

// primeiroNumero = Ler(“10”);
// segundoNumero= Ler(“20”);
// terceiroNumero= Ler(“40”);

// Exibir: “A soma dos três números digitados é: ” +( primeiroNumero+
// segundoNumero+ terceiroNumero);
// Console: A soma dos três números digitados é: 70

// Exibir: “A subtração dos três números digitados é: ” +( primeiroNumero-
// segundoNumero- terceiroNumero);

// Exibir: “A multiplicação dos três números digitados é: ” +( primeiroNumero*
// segundoNumero* terceiroNumero);

// Exibir: “A média dos três números digitados é: ” +( primeiroNumero+
// segundoNumero+ terceiroNumero)/3;

// Fim Algoritmo
