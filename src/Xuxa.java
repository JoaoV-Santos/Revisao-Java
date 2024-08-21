import java.util.Scanner;

public class Xuxa {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Informe o numero de patinhos:");
        int n = scn.nextInt();
        int x = n;
        System.out.println();

        while (n>0) {
            System.out.println(n + " patinhos foram passear\n" +
                    "Além das montanhas\n" +
                    "Para brincar\n" +
                    "A mamãe gritou: Quá, quá, quá, quá");

            if (n >= 3)
                System.out.println("Mas só " + (n-1) + " patinhos voltaram de lá.");
            else if (n == 2)
                System.out.println("Mas só " + (n-1) + " patinho voltou de lá.");
            else if (n == 1)
                System.out.println("Mas nenhum patinho voltou de lá.");

            System.out.println();

            n -= 1;
        }

        System.out.println("A mamãe patinha foi procurar\n" +
                "Além das montanhas\n" +
                "Na beira do mar\n" +
                "A mamãe gritou: Quá, quá, quá, quá\n" +
                "E os " + x + " patinhos voltaram de lá.");
    }
}
