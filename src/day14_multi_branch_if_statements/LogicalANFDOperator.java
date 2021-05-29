package day14_multi_branch_if_statements;

public class LogicalANFDOperator {
    public static void main(String[] args){
        System.out.println(true && true);// true
        System.out.println(true && false);// false
        System.out.println(false && false);// false
        System.out.println(false && true);//false
        System.out.println("***************" );

        System.out.println(10>5 && 1 == 1);//true
        System.out.println(3<5 && 7>90);//false
        System.out.println((54==98 && 98<54));//false
        System.out.println(23==32 && 98>76);// false
        System.out.println(10>15 && 5>8);//false



    }

    }
