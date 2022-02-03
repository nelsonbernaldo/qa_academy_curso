import javax.swing.JOptionPane;

public class Exercicio_06easy {

    public static void main(String[] args) {

        double nota1, nota2, resultado;
        String nota1Stg, nota2Stg;

        nota1Stg = JOptionPane.showInputDialog("Por favor, digite a primeira nota:");
        nota2Stg = JOptionPane.showInputDialog("Por favor, digite a primeira nota:");

        nota1 = Double.parseDouble(nota1Stg);
        nota2 = Double.parseDouble(nota2Stg);
        resultado = (nota1 + nota2) / 3;

        if (resultado > 5) {
            System.out.println("Você esta Aprovado");

        }
        if (resultado < 5) {
            System.out.println("Você está Reprovado");
        }
        if (resultado == 5) {
            System.out.println("Você esta de Exame");
        }

    }

}




//6-) Faça um algoritmo para ler duas notas, calcular a média. 
//E SE - a média > 5 Exibir aprovado;
//E a média < que 5 exibir reprovado;
//Se media = 5 exibir exame. 

//Inicio Algoritmo 
	
//Declarar variáveis do tipo numérico: nota1, nota2, resultado; 
//nota1 = Ler (“9”); 
//nota2 = Ler(“8”); 
//resultado = (nota1+ nota2)/2; 

//SE (resultado > 5)
 //Exibir: “Aprovado”;
//Fim SE

//SE (resultado < 5)
// Exibir: “Reprovado”;
//Fim SE

//SE NÃO
 ///Exibir: “Exame”;
//Fim SE

//im Algoritmo 
