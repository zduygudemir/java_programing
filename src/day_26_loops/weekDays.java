package day_26_loops;

public class weekDays {
    public static void main(String[] args){

        for (int n = 1; n<=10; n++){
            switch(n){
                case 1:
                    System.out.println(n+" - Monday");
                    break;
                case 2:
                    System.out.println(n+" - Tuesday");
                    break;
                case 3:
                    System.out.println(n+" - Wednesday");
                    break;
                case 4:
                    System.out.println(n+" - Thursday");
                    break;
                case 5:
                    System.out.println(n+" - Friday");
                    break;
                case 6:
                    System.out.println(n+" - Saturday");
                    break;
                case 7:
                    System.out.println(n+" - Sunday");
                default:
                    System.out.println(n+" - No such day, it is java day");
                    break;


            }
        }

    }

}
