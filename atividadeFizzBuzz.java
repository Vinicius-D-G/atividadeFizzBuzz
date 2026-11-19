
import java.util.Scanner;

void main() {
    Scanner teclado = new Scanner(System.in);

    System.out.print("Digite um número N: ");
    int N = teclado.nextInt();

    for (int i = 1; i <= N; i++) {
        if (i % 3 == 0 && i % 5 == 0) {
            System.out.println("FizzBuzz");
        } else if (i % 3 == 0) {
            System.out.println("Fizz");
        } else if (i % 5 == 0) {
            System.out.println("Buzz");
        } else {
            System.out.println(i);
        }
    }

    teclado.close();
}
