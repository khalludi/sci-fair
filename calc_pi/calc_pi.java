package Ch5;

/**
 * Created by khalid on 10/2/14.
 */
public class Calc_Pi {

    public double calc_pi () {

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

    public static void main(String[] args) {

        long tStart = System.nanoTime();

        Calc_Pi pi = new Calc_Pi();

        System.out.println("The calculated value of pi is ...");
        System.out.println(pi.calc_pi());

        System.out.printf("\n%f", (System.nanoTime() - tStart) * .000000001);
    }
}

