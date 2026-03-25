public class comercio_industria {
    void main() {
        double consumo = Double.parseDouble(IO.readln("Digite o consumo de energia em kWh: "));

        double valor;

        if (consumo <= 10) {
            valor = 44.95;
        } else if (consumo <= 20) {
            valor = consumo * 8.75;
        } else if (consumo <= 50) {
            valor = consumo * 16.76;
        } else {
            valor = consumo * 17.46;
        }

        IO.println(String.format("Valor da conta: R$ %.2f%n", valor));
    }
}
