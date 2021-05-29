package day19_class_vs_object_strings;

public class StringStartsEndsWith {
    public static void main(String[] args){
        String word = "intellij idea";
        System.out.println(word.startsWith("i"));//true
        System.out.println(word.startsWith("in"));//
        System.out.println(word.startsWith("intellij idea"));
        System.out.println("java".startsWith("j"));//true

        System.out.println(word.startsWith("Int"));//false

        System.out.println(word.endsWith("idea"));//true
        System.out.println(word.endsWith("a"));//true

        String name = "irana";
        if (name.endsWith("a")){
            System.out.println("Maybe, it is a female");
        }
        /**
         * Mr. -> man
         * Dr. -> Doctor
         * Mrs.-> Married women
         * Ms.->Single women
         * Sr.->senior
         */
        String firstName = "Dr. Nadir";
        if (firstName.startsWith("Mr.")){
            System.out.println("Man"+firstName);
        }else if(firstName.startsWith("Dr.")) {
            System.out.println("Doctor = "+firstName);
        }else if(firstName.startsWith("Mrs.")) {
            System.out.println("Married women = " +firstName);
        }else if(firstName.startsWith("Ms.")) {
            System.out.println("Single women = " +firstName);
        }else if (firstName.startsWith("Sr")) {
            System.out.println("Senior = "+firstName);
        }else{
            System.out.println("normal name");
        }

        String url = "https://www.irs.com";
        if(url.endsWith(".com")){
            System.out.println("Commercial website");
        }else if (url.endsWith(".ru")){
            System.out.println("Russian website");

        }else if(url.endsWith(".gov")){
            System.out.println("Goverment website");
        }else if(url.endsWith(".edu")){
            System.out.println("Education website");

        }else if(url.endsWith(".org")){
            System.out.println("Organization website");
        }




    }
}
