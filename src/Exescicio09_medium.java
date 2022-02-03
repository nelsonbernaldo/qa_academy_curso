import javax.swing.JOptionPane;

public class Exescicio09_medium {

    public static void main(String[] args) {

        String[] alunosVetor = new String[5];
        int[] numeroAlunosVetor = new int[5];
        int i = 0;

        while (i < 5) {
            alunosVetor[i] = JOptionPane.showInputDialog("Digite o nome do aluno:");
            numeroAlunosVetor[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite o numero do aluno"));
            i++;

        }

        i = 0;

        while (i < 5) {
            System.out.println("Nome do aluno: " + alunosVetor[i] + "-" + "Número do aluno" + numeroAlunosVetor[i]);
            i++;

        }
    }

}
