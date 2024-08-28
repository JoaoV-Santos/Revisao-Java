import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a quantidade de números da sequência de Fibonacci que deseja calcular: ");
        int n = scanner.nextInt();

        if (n <= 0) {
            System.out.println("Por favor, insira um número maior que zero.");
        } else {
            System.out.println("Os primeiros " + n + " números da sequência de Fibonacci são:");

            int primeiro = 1, segundo = 1;

            for (int i = 1; i <= n; i++) {
                System.out.print(primeiro + " ");

                int proximo = primeiro + segundo;
                primeiro = segundo;
                segundo = proximo;
            }
        }
        scanner.close();
    }
}
