import javax.swing.JOptionPane;

public class Execucao {

    public static void main(String[] args) {

        

        String primeiroValor = JOptionPane.showInputDialog("primeiroValor");
        String segundoValor = JOptionPane.showInputDialog("segundoValor");



        Exercicio_3easy exercicio_3easy = new Exercicio_3easy(); 
       System.out.println(exercicio_3easy.retornaValorTrocado(primeiroValor, segundoValor));
    }
    
}
