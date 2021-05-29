package day23_string_manupulation_while_loop;

public class SMSMessage {
    public static void main(String[] args){
        String message = "Sender: [Nadir] From Number<(518) 564 7896> " +
                "         Maessage:{Hello, lets code some java}";
       int start = message.indexOf("[");
       int end = message.indexOf("]");

        System.out.println(message.substring(start+1,end));
        String sender = message.substring(start+1,end);
        System.out.println("sender = "+ sender);

        String mobile = message.substring(message.indexOf("<")+1,message.indexOf(">"));
        System.out.println("mobile = "+mobile);

        String text = message.substring(message.indexOf("{")+1,message.indexOf("}"));
        System.out.println(text);
         sender = sender.trim();//trim methode removes empty spaces from
        // begining and ending of the string value
        if (sender.equals("Nadir")){
            System.out.println("Message from Nadir");



        }
    }

}
