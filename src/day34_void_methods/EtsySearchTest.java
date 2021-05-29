package day34_void_methods;

public class EtsySearchTest {
    public static void main(String[] args){
        System.out.println("---Starting Etsy Search Smoke Test---");
        openBrowser();
        navigateToEtsyUr();
        searchForWoodenSpoon();
        verifyResultsAreDisplayed();
        System.out.println("---Etsy Search Smoke test completed Test - PASS -");

    }
    public static void openBrowser(){
        System.out.println("launching Chrome browser");

    }
    public static void navigateToEtsyUr(){
        System.out.println("Navigating to https://www.etsy.com/");

    }
    public static void searchForWoodenSpoon(){
        System.out.println("PASS: Verify Etsy home page is displayed");
        System.out.println("Type 'Wooden spoon' in search field and click search");

    }
    public static void verifyResultsAreDisplayed(){
        System.out.println("PASS: Search result are successfully displayed");

    }
}
