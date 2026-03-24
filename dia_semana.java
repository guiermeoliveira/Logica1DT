import java.util.Scanner;

public class dia_semana {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número de 1 a 7: ");
        int numero = sc.nextInt();

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

        System.out.println(dia);

        sc.close();
    }
}
