import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            double n = scanner.nextInt();
            int m = scanner.nextInt();
            double sum = 0;
            for (int i = 0; i < m; i++) {
                sum += n;
                n = Math.sqrt(n);
            }
            System.out.printf("%.2f\n",sum);
        }
    }
}
