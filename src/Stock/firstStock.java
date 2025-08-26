package Stock;

import java.util.ArrayList;

public class firstStock {
    public static void main(String[] args) {
       // arr[] = [100, 180, 260, 310, 40, 535, 695]
        int[] arr= new int[] {100,180,260,310,40,535,695};
        ArrayList<Integer> profits= new ArrayList<Integer>();
        int totalProfit;
        int num= arr[0];
        int min;
        int max;
        ArrayList<Integer> index= new ArrayList<Integer>();
        for(int i=0; i< (arr.length - 1); i++){
            min=arr[0];
            if(arr[i+1]>arr[i]){
                continue;
            }
            else{
                profits.add(min);
                max=arr[i];
                profits.add(max);
                min=arr[i+1];

            }


        }
        System.out.println("profits array is");
        for (int i=0; i< profits.size(); i++){
            System.out.println(profits.get(i));
        }

    }
}
