import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class SocksMerchant {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        //BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("C:\\Users\\adkhu\\OneDrive\\Documents\\Java practice")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] ar = new int[n];

        String[] arItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arItem = Integer.parseInt(arItems[i]);
            ar[i] = arItem;
        }

        int result = sockMerchant(n, ar);
        System.out.println(result);

        //bufferedWriter.write(String.valueOf(result));
        //bufferedWriter.newLine();

        //bufferedWriter.close();

        scanner.close();
    }

    static int sockMerchant(int n, int[] ar) {

        System.out.println("n= "+ n + " ar= " + Arrays.toString(ar) + " size =" + ar.length);

        HashSet<Integer> uniqueSet = new HashSet<Integer>();

        for (int i = 0; i<n ; i++){
            uniqueSet.add(ar[i]);
        }

        System.out.println("uniqueSet=" + uniqueSet);

        int[] arr = new int[uniqueSet.size()];

        Iterator<Integer> iterUniqueSet = uniqueSet.iterator();

        int finalCount=0;

        while(iterUniqueSet.hasNext()){
            int uniqueNum = iterUniqueSet.next();
            System.out.println(" in While loop uniqueNum= " +uniqueNum);
            int count=0;

            for(int k =0 ; k < ar.length; k++){
                if (ar[k] == uniqueNum){
                    count++;
                }
            }
            finalCount = finalCount + (count/2) ;

        }


        return finalCount;


    }
}
