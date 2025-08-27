import java.util.ArrayList;
import java.util.Arrays;

public class Klargest {

        public static void main(String[] args) {
            int[] array1= new int[] {1, 23, 12, 9, 30, 2, 50};
            ArrayList<Integer> check= new ArrayList<Integer>();
             check= Largest(array1, 3);
            Object[] arr = check.toArray();
            System.out.println(Arrays.toString(arr));

        }

    public static ArrayList<Integer> Largest(int[] arr, int k) {
        // Your code here
        Arrays.sort(arr);
        int size=arr.length;
        int check= size-k;
        ArrayList<Integer> array1 = new ArrayList<Integer>();
        for(int i=size-1; i>=check; i--){
            array1.add(arr[i]);
        }
        return array1;
    }

    }

