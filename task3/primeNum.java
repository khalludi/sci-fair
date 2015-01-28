package Ch7;

/**
 * Created by khalid on 12/7/14.
 */
public class primeNumGen {

    public static void main(String[] args) {

        long startTime = System.nanoTime();

        int N = 100000000;

        boolean isPrime[] = new boolean[N + 1];

        for (int i = 2; i <= N; i++) {
            isPrime[i] = true;
        }

        //mark non-primes <=N using Sieve of Eratosthenes
        for (int i = 2; i * i <= N; i++) {

            //if is a prime,then mark multiples of i as non prime
            for (int j = i; i * j <= N; j++) {
                isPrime[i * j] = false;
            }
        }

        System.out.printf("\n%f", (System.nanoTime() - startTime) * .000000001);

    }
}

