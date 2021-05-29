package day20_string_manipulation;

public class StringIsEmpty {
    public static void main(String[] args){
        String jobTitle = "";
        System.out.println(jobTitle.isEmpty());
        System.out.println(jobTitle.equals(""));
        System.out.println(jobTitle.length() == 0);

        if (jobTitle.isEmpty()){
            System.out.println("JobTitle is missing, please resend");

        }else{
            System.out.println("job title looks good");
        }
        if (jobTitle.equals("")){
            System.out.println("jobTitle is empty");
        }else{
            System.out.println("job title is not empty");
        }

          System.out.println(jobTitle.equals(""));
        if("".equals(jobTitle)){
            System.out.println("jobTitle is empty");
        }else{
            System.out.println("job title is not empty");


            String veggie = "carrots";
            System.out.println(veggie.isEmpty());
            if (!veggie.isEmpty()){
                System.out.println("we have "+veggie);
            }else{
                System.out.println("veggie is empty");
            }
            String word2;
            //it is not empty it is not initialize
            //System.out.println(word2.isEmpty());error

        }

    }

}
