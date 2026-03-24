
public class dia_semana {
    void main() {
        int numero = Integer.parseInt(IO.readln("Digite um número de 1 a 7: "));

        String dia = switch (numero) {
            case 1 -> "Domingo";
            case 2 -> "Segunda";
            case 3 -> "Terça";
            case 4 -> "Quarta";
            case 5 -> "Quinta";
            case 6 -> "Sexta";
            case 7 -> "Sábado";
            default -> "Opção inválida!";
        };

        IO.println(dia);
    }
}
