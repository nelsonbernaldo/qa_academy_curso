import javax.swing.JOptionPane;

public class Exercicio_07easy {

    public static void main(String[] args) {

        double salario, inss = 0.0;
        String salarioStg = "6000.00";
        salario = Double.parseDouble(JOptionPane.showInputDialog("Digite um valor de Salário:"));

        if (salario <= 1045.00) {
            inss = salario * 0.075;
        }

        if (salario >= 1045.01 && salario <= 2089.60) {
            inss = salario * 0.09;
        }

        if (salario >= 2089.60 && salario <= 3134.40) {
            inss = salario * 0.12;
        }

        if (salario >= 3134.40 && salario <= 6101.06) {
            inss = salario * 0.14;
        }

        if (salario > 6101.06) {
            inss = 854.12;
        }

        System.out.println("O valor do inss a ser pago é: " + inss);

    }

}


//7-) Faça um algoritmo para ler um valor de salário, calcular e exibir o valor do INSS a ser pago. Respeitando a tabela abaixo:

 
//Salário de Contribuição (R$)
//Alíquota
// R$ 1.045,00
//,50%
//De R$ 1.045,01 a R$ 2.089,60
//9%
//De R$ 2.089,61 até R$ 3.134,40
//12%
//De R$ 3.134,41 até R$ 6.101,06
//14%

//Inicio Algoritmo 
	
	//Declarar variáveis numéricas: salario, inss; 
	//salario = Ler(“2.089,61”); 

	//SE(salario <= 1.045,00)
	//inss = salario * 0,075; 
	//Fim Se

//SE(salario >= 1.045,01 && salario <= 2.089,60)
	//inss = salario * 0,09; 
	//Fim Se

//SE(salario >= 2.089,61 && salario <= 3.134,40)
	//inss = salario * 0,12; 
	//Fim Se

//SE(salario >= 3.134,41 && salario <= 6.101,06)
	//inss = salario * 0,14; 
	//Fim Se

//SE(salario >= 6.101,06)
//	inss = 6.101,06 * 0,14; 
	//Fim Se


//Exibir: “O Valor do inss a ser pago é R$ ”+ inss; 	

//Console: O Valor do inss a ser pago é R$ 854,15



//Fim Algoritmo 
