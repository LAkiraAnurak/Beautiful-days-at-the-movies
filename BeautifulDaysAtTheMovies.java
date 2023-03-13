package pack1;

import java.io.*;

class BDATMResult {

    /*
     * Complete the 'beautifulDays' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER i
     *  2. INTEGER j
     *  3. INTEGER k
     */

    public static int beautifulDays(int i, int j, int k) 
    {
    // Write your code here
        int c=0;
        for(int a=i;a<=j;a++)
        {
            int x=a;
            int rev=0;
            while(x!=0)
            {
                int r=x%10;
                rev=rev*10+r;
                x/=10;
            }
            float val=(float)(a-rev)/(float)k;
            if(val<0) val=-val;
            if((val+"").endsWith(".0")) c++;
        }
        return c;
    }

}

public class BeautifulDaysAtTheMovies {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int i = Integer.parseInt(firstMultipleInput[0]);

        int j = Integer.parseInt(firstMultipleInput[1]);

        int k = Integer.parseInt(firstMultipleInput[2]);

        int result = BDATMResult.beautifulDays(i, j, k);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
