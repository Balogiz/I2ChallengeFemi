
import java.util.ArrayList;
import java.util.List;

public class I2Challenge {

    static List sumPairs(int[] arr, int x) {
        int count;
        int sum = 0;
        int n = arr.length;

        List test = new ArrayList();

            
        // Iterate through all elements and sum each pair of number consecutively
        int i;
        for (i = 0; i < arr.length; i++) {
            for(int j=1; j < n ; j++) {
                sum = arr[i++] + arr[j];

                test.add(sum);
            }
        }

            return test;
      

    }
    public static void main(String[] args) {
        int arr[] ={5, 10, 15, 20, 25, 30, 40, 50, 60, 70};

        int x = 110;

        List list  = sumPairs(arr, x); //the algorithm

        System.out.print(list);

        System.out.println("");

        System.out.println("Count is " + list.stream()
                .filter(i -> i.equals(x))
                .count());
    }
}
