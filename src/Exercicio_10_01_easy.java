public class Exercicio_10_01_easy {

    public static void main(String[] args) {
        double valorJuros = 0.0, taxaJuros = 0.05, valorInvestimento, valorTotal, ano = 1;
        valorInvestimento = 1000.00;

        while (ano <= 10) {

            valorJuros = valorJuros + (valorInvestimento * taxaJuros);
            ano = ano + 1;

        }

        valorTotal = valorJuros + valorInvestimento;
        System.out.println("Valor investido: R$ " + valorInvestimento);
        System.out.println("Valor do juros: R$ " + valorJuros);
        System.out.println("Valor total com juros: R$ " + valorTotal);

    }
}
