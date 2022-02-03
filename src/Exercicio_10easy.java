public class Exercicio_10easy {

    public static void main(String[] args) {

        double valorJuros, taxaJuros = 0.05, valorInvestimento, valorTotal;
        valorInvestimento = 1000.00;
        valorJuros = (10 * taxaJuros) * valorInvestimento;
        valorTotal = valorJuros + valorInvestimento;

        System.out.println("Valor investido: R$ " + valorInvestimento);
        System.out.println("Valor do juros R$ " + valorJuros);
        System.out.println("Valor total com juros R$ " + valorTotal);
    }

}
