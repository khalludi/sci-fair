#include <stdio.h>
#include <stdlib.h>
#include <time.h>

void main() {
    
    clock_t begin, end;
    double time_spent;
    
    begin = clock();
    
    //long startTime = System.nanoTime();

    long N = 100000000;

    long * isPrime = (long *)malloc(N * sizeof(long) + 1);
    
    isPrime[0] = 1;
    isPrime[1] = 1;
    

    for (long i = 2; i <= N; i++) {
        isPrime[i] = 1;
    }

    //mark non-primes <=N using Sieve of Eratosthenes
    for (long i = 2; i * i <= N; i++) {

        //if is a prime,then mark multiples of i as non prime
        for (long j = i; i * j <= N; j++) {
            isPrime[i * j] = 0;
        }
    }
/*
    for (long i = 2; i <= N; i++) {
        if (isPrime[i]) {
            printf("%d, ", i);
        }
    }
*/
    // return memory to the heap
    free(isPrime);

    end = clock();
    time_spent = (double)(end - begin) / CLOCKS_PER_SEC;
    
    printf("\n%f\n", time_spent);
    //System.out.printf("\n%f", (System.nanoTime() - startTime) * .000000001);

}
