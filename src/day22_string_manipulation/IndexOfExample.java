package day22_string_manipulation;

public class IndexOfExample {
    public IndexOfExample() {
    }

    public static void main(String[] args){
        String technologies = "java, html, css, selenium, testing,maven,cucumber";
        //first comma
        System.out.println(technologies.indexOf(","));
       // last comma
        System.out.println(technologies.lastIndexOf(","));

        int indexOfJava = technologies.indexOf("java");
        System.out.println("java is at index "+indexOfJava);

        int idxOfCss = technologies.indexOf("css");
        System.out.println("css is at index "+ idxOfCss);

        int indexOfCucumber = technologies.indexOf("cucumber");
        System.out.println("cucumber is at index "+indexOfCucumber);

        int indexOfSql = technologies.indexOf("sql");// not present -1
        System.out.println("sql is at index "+indexOfSql);

        if (technologies.contains("maven")){
            System.out.println("maven is present");

        }else{
            System.out.println("maven is  not present");
        }

        if (technologies.indexOf("maven") > -1){
            System.out.println("maven is present");
        }else{
            System.out.println("maven is  not present");

        }

        String word = "hello";
        word.indexOf("h");//0
        word.indexOf("el");//1
        word.indexOf("lo");//3
        word.indexOf("j");//-1
        word.indexOf("wold");//-1
        word.indexOf("tomato");//-1

    }
}
