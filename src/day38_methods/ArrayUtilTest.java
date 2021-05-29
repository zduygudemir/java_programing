package day38_methods;

public class ArrayUtilTest {
    public static void main(String[] args) {
      int[] nums = {5, 23, 1, 543, 90} ;
      ArrayUtils.printArray(nums);
      ArrayUtils.printArray(new int[]{3, 4, 876, 8765, 800755, 9});
        System.out.println("sum = "+ArrayUtils.sum(nums));
        System.out.println("sum = "+ArrayUtils.sum(new int[]{3, 4, 876, 8765, 800755, 9}));
        System.out.println(ArrayUtils.contains(new int[]{2, 4, 5, 76, 87,9},9));
        System.out.println(ArrayUtils.contains(nums,5));
    }


}
