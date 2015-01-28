package Ch7;

import java.io.*;

/**
 * Created by khalid on 1/27/15.
 */
public class toUppercase {

    public static void main(String[] args) throws FileNotFoundException, IOException{

        long tStart = System.nanoTime();

        for (int i = 0; i < 100000; i++) {

            File fin = new File("/Users/khalid/IdeaProjects/H2PJava/src/main/java/Ch7/text");
            File fout = new File("/Users/khalid/IdeaProjects/H2PJava/src/main/java/Ch7/text2");

            FileInputStream fis = new FileInputStream(fin);
            FileOutputStream fos = new FileOutputStream(fout);

            //Construct BufferedReader from InputStreamReader
            BufferedReader br = new BufferedReader(new InputStreamReader(fis));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(fos));

            String line = null;
            while ((line = br.readLine()) != null) {
                bw.write(line.toUpperCase());
                bw.newLine();
            }

            br.close();
            bw.close();
        }

        System.out.printf("\n%f", (System.nanoTime() - tStart) * .000000001);
    }
}

