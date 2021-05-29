package day14_multi_branch_if_statements;

public class YesOrNo {
    public static void main(String[] args){
        System.out.println("Are sure you wnt to delete this file?");
        char selection='y';
        boolean answer;
        String result;

        if (selection =='y'){
            System.out.println("your file be deleted");
           answer = true;
           result = "deleted";


        }else{
            System.out.println("your file deletion is canceled");
            answer=false;
            result = "not deleted";
        }
        System.out.println("Did file get deleted? - "+ answer);
        System.out.println(result);
    }
}
