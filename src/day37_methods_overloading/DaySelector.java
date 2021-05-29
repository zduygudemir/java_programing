package day37_methods_overloading;

public class DaySelector {
public static void main(String[] args){
    System.out.println(getDayName(1));
    System.out.println(getDayName(5));


    String day ="";
    //loop from 1 to 8 and call the getDayName with loop variable
     for (int i=1; i<9; i++){
         System.out.println(i+" = "+ getDayName(i));
         day += getDayName(i)+" ";
     }
    System.out.println(day);
     String today = getDayName(6);
    System.out.println("today = " + today);
    String someDay =getDayName(0);
    if (someDay.equals(null)){
        System.out.println("someDay is null for invalid day");
    }
    System.out.println(getDayNameV2(4));

}
public static String getDayName(int day){
    switch(day){
        case 1:
            return "Monday";
            //break; //unreachable code, because return already exits the method
        case 2: return "Tuesday";
        case 3: return "Wednesday";
        case 4: return "Thursday";
        case 5: return "Friday";
        case 6: return "Saturday";
        case 7: return "Sanday";
        default:
            System.out.println("ERROR: invalid day - "+ day);
            return null;// nothing no object

    }

}
    public static String getDayNameV2(int day){
    String dayName;
    switch(day){
        case 1: dayName = "Monday";break;
        case 2:
            dayName = "Tuesday";
            break;
        case 3:
            dayName = "Wednesday";
            break;
        case 4:
            dayName = "Thursday";
            break;
        case 5:
            dayName = "Friday";
            break;
        case 6:
            dayName = "Saturday";
            break;
        case 7:
            dayName = "Sunday";
            break;
        default:
            System.out.println("invalid day !"+day);
            dayName = null;
    }
        return dayName;
    }

}
