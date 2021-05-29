package day30_arrays;

public class forLoopArray {
    public static void main(String[] args){
        int biggestNum=0;

        int[] data ={32,532,12,5454,22,123,543,999,321,3};
        int smallestNum=data[0];
        for(int number : data){
            System.out.println(number);
            if (number>biggestNum){
                biggestNum=number;
            }
        }

            for(int n :data){
                System.out.print(n + " ");
                if(n<smallestNum){
                    smallestNum = n;

                }
            }

        System.out.println("\n Biggest Number: "+biggestNum);
        System.out.println(" Smallest number:  "+smallestNum);

        // repeat above with for loop
        System.out.println("---------For Loop--------");
        for(int i=0; i<data.length; i+=5){
            System.out.println(data[i]);
        }
        //print last value in array using length
        System.out.println("Last value: "+data[data.length-1]);

        //print all numbers back loops
        System.out.println("write the array back word" +
                "");
         for (int idx=data.length-1; idx>=0; idx--){
             System.out.print(data[idx]+" ");
         }


    }
}
