package day43_list_custom_classes;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class MethodsWithListReturn {
    public static void main(String[] args){
        //1 second = 1_000_000_000 nanoseconds
         long start = System.nanoTime();

       List<Integer>mlnNums = getIntegerList();//returns readArrayList object. no need new Array

        System.out.println("mlnNums = " + mlnNums);
        long end = System.nanoTime();
        double listSeconds = (end-start)/1_000_000_000.0;
        System.out.println("ArrayList time = "+(end - start));
        System.out.println("ArrayList time second = "+listSeconds);

        long st=System.nanoTime();
        int[] arr = getIntegerArray();
        long en = System.nanoTime();
        double seconds = (en-st)/1_000_000_000.0;
        System.out.println("Array time = " +(en-st));
        System.out.println("Array time seconds = "+seconds);

    }
    /**
     * getIntegerList
     * return List<Integer>
     *  loops from 0 -1000_00
     *  and add numbers
     *
     */
    public static List<Integer>getIntegerList(){

         List<Integer> nums= new ArrayList<>();
         //loop and assign numbers
        for(int i=0; i<=1000_000; i++){
       nums.add(i);
        }
        return nums;//return the value

    }
    /**
     * getIntegerArray
     * no params
     * return int[]
     *  loops from 0 -1000_00
     *  and add to int[] then return it
     *
     */
    public static int [] getIntegerArray(){
        //declare empty array with size - 1_000_001
        int[] nums = new int[1_000_001];
        for(int i=0; i<=1_000_000; i++){
            nums[i] = i;
        }
        return nums;
    }
    /**
     * getDays
     */

}
