#include <stdio.h>
#include <time.h>

double calc_pi () {

    long counter = 1;
    double Ret = 0.0;
    long i;
    for(i = 1; counter <= 1000000000L; i = i + 2) {
        if(counter % 2 != 0 ) {
            Ret = Ret + ((double) 4 / i);
        }
        else {
            Ret = Ret - ((double) 4 / i);
        }
        counter += 1;
    }
    return Ret;
}

void main() {

    clock_t begin, end;
    double time_spent;    
    
    begin = clock();
    //long tStart = System.nanoTime();

    printf("The calculated value of pi is ...\n");
    printf("%f\n", calc_pi());

    end = clock();
    time_spent = (double)(end - begin) / CLOCKS_PER_SEC;
    
    printf("\n%f\n", time_spent);
    //System.out.printf("\n%f", (System.nanoTime() - tStart) * .000000001);
}
