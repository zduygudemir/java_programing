package day43_list_custom_classes;

public class Employee {
    //instance/object variables
    String name;
    String jobTitle;

    //instance/object  method
    public void work(){
        System.out.println((name+"work as "+jobTitle));
    }
    public static void main(String[] args){
       Employee emp1 = new Employee();
       emp1.name = "Onurcan Dogru";
       emp1.jobTitle ="SDET";
       emp1.work();

       Employee emp2 = new Employee();
        emp2.name = "Rahib Heydaroy";
        emp2.jobTitle ="Full stack developer";
        emp2.work();
    }

}
