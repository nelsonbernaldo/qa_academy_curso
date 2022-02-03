public class Exercicios_08easy {

    public static void main(String[] args) {

        double salario, salarioLiquido = 0.0, impostoDeRenda = 0;
        String salarioStg = "6000";
        salario = Double.parseDouble(salarioStg);

        if (salario <= 1903.98) {
            impostoDeRenda = 0;
            salarioLiquido = salario - impostoDeRenda;

        }
        if (salario >= 1903.99 && salario <= 2826.65) {
            impostoDeRenda = (salario * 0.075) - 142.80;
            salarioLiquido = salario - impostoDeRenda;

        }

        if (salario >= 2826.66 && salario <= 3751.05) {
            impostoDeRenda = (salario * 0.15) - 352.80;
            salarioLiquido = salario - impostoDeRenda;

        }

        if (salario >= 3751.06 && salario <= 4664.68) {
            impostoDeRenda = (salario * 0.225) - 636.13;
            salarioLiquido = salario - impostoDeRenda;
        }
        if (salario > 4664.68) {
            impostoDeRenda = (salario * 0.275) - 869.36;
            salarioLiquido = salario - impostoDeRenda;

        }

        System.out.println("Seu salario Bruto será: R$" + salario);
        System.out.println("Seu salario Liquido será: R$" + salarioLiquido);
        System.out.println("O valor a ser pago de imposto de renda será: R$" + impostoDeRenda);

    }

}
