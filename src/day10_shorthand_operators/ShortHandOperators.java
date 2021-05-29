package day10_shorthand_operators;

public class ShortHandOperators {
    public static void main(String[] args) {
        int cars=10;
        System.out.println("cars in parking lot ="+cars);
        cars = cars + 2;
        System.out.println("cars in parking lot ="+cars);
        cars += 5;
        System.out.println("cars in parking lot ="+cars);
        cars -= 6;
        System.out.println("cars in parking lot  =" +cars);
        cars *=3;
        System.out.println("cars in parking lot = " + cars);

        int electricCars = 13;
        cars += electricCars;//same cars = cars + electricCars;
        System.out.println("cars in parking lot = "+cars);
        String word = "java";
        System.out.println("word = "+word);
        word = word + "programming";
        System.out.println("word = " + word);
        //add " is fun;

        word +=" is fun";
        System.out.println("word = "+word);
        String selenium = "but \"selenium\" is more fun";
        word += selenium;
        System.out.println("word = "+word);
        word += 12345;
        System.out.println("word =  " + word);
        char letter = 'A';
        System.out.println("letter = "+ letter);
        letter +=3;
        System.out.println("letter = "+ letter);
        //add letter 'j';
        letter += 'j';
        System.out.println("letter = "+ letter);
        letter +=1;
        System.out.println("letter = "+letter);
        double parkingFee = 7.50;
        System.out.println("normal parking fee = "+ parkingFee);
         //early bird fee is 50 off
        parkingFee /=2;
        System.out.println("early bird fee = "+parkingFee);
         // wekend parking is fee
        parkingFee -= parkingFee;
        System.out.println("weekend parking fee = "+parkingFee);
        int count = 2;
        System.out.println(count);
        count++;// only one adding 2
        System.out.println(count);
        int num = 10;//10
        num = num+1;//11
        num +=1;//12
        ++num;//12




    }
}
