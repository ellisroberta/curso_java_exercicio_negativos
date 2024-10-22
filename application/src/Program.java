import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número entre 1 e 10: ");
        int n = sc.nextInt();
        System.out.println();

        int[] vetor = new int[n];

        for (int i=0; i<n; i++) {
            System.out.print("Digite um número: ");
            vetor[i] = sc.nextInt();
        }

        System.out.println();
        System.out.println("NUMEROS NEGATIVOS:");

        for (int i=0; i<n; i++) {
            if (vetor[i] < 0) {
                System.out.printf("%d\n", vetor[i]);
            }
        }

        sc.close();
    }
}