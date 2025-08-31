
public class medianOfTwoArrays {
   /* public static void main(String[] args) {
        int[] array1= new int[] {1,4};
        int[] array2= new int[] {2,3};
        ArrayList<Integer> together= new ArrayList<Integer>();
        for(int i=0; i<array1.length; i++){
            together.add(array1[i]);
        }
        for(int j=0; j<array2.length; j++){
            together.add(array2[j]);
        }
        together.sort(null);
        int size= together.size();
        int index= size/2;
        if(size%2==0){
            float median= (float) (together.get(index) + together.get(index - 1)) /2;
            System.out.println("The median is "+median);
        }
        else{
            int median=(together.get(index));
            System.out.println("The median is "+median);
        }
    } */

    public static void main(String[] args) {
        anotherSolutionForMedian object1= new anotherSolutionForMedian();
        int[] arr1= new int[]{1,4};
        int[] arr2= new int[] {2,3};
        double result= object1.findMedianSortedArrays(arr1, arr2);
        System.out.println("the median is "+ result);
    }

}
