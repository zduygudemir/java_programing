package day18_conditions_practice_strings_intro;

public class FizzBuzz {
    public static void main(String[] args){
        int number = 15;
        if (number%3==0 && number%5==0){
            System.out.println(number+ " number divisible by 3 and 5 FizzBuzz");

        }else if(number %3 == 0){
            System.out.println(number +" is Fizz number");
        }else if(number % 5 ==0){
            System.out.println(number + " is Buzz number");

        }
    }
}

