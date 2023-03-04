package lesson1;

public class les11_dz1 {
    public static void main(String[] args) {
        int i,j;
        boolean isPrime;

        for (i = 1; i <= 1000; i++) {
            isPrime = true;

            for (j = 2; j < i; j++) {
                if (i%j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.print(i + " ");
            }
        }
    }
}
