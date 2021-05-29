package day38_methods;

public class ArrayUtils {
    public static void main(String[] args){

    }
    public static void printArray(int[] nums){
        for(int i=0; i<nums.length; i++){
            System.out.print(nums[i]+" ");
        }
        System.out.println();
    }
    public static int sum(int[] nums){
      int sum=0;
        for(int n : nums){
            sum+=n;
        }
        return sum;
    }
    public static boolean contains(int[] nums,int num){
        for(int n : nums) {
            if ( n == num ){
                return true;
            }
        }
        return false;

    }



}
