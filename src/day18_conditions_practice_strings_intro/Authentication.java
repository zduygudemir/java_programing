package day18_conditions_practice_strings_intro;

public class Authentication {
    public static void main(String[] args){
        int last4SSN = 4563;
        int pinCode =1234;
        int expLast4SSN =3243;
        int expPinCode = 1235;
        if (last4SSN==expLast4SSN && pinCode==expPinCode){
            System.out.println("Authentication successful");
        }else{
            System.out.println("Authentication unsuccessful");

            if(last4SSN!=expLast4SSN) {
            System.out.println("last4SSN not match");
            }
            if( pinCode!=expPinCode) {
                System.out.println("pinCode not match");
            }

        }

    }
}
