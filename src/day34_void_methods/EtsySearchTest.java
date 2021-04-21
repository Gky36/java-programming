package day34_void_methods;

public class EtsySearchTest {
    public static void main(String[] args) {
        System.out.println("---Satrt ETSY Search smoke Test-----");
        openBrowser();
        navigateToEtsyUrl();
        searchForWoodenSpoon();
        verifyResultsAreDisplayed();
        System.out.println("__________-good night ##########");
    }

    public static void openBrowser() {
        System.out.println("1. Launching chrome browser");
        System.out.println("2. browser are refreshed");
    }

    public static void navigateToEtsyUrl() {
        System.out.println("3. Navigate to https://www.etsy.com/");
        System.out.println("4. the features are clickable");
    }

    public static void searchForWoodenSpoon() {
        System.out.println("5. Pass: verify Etsy home page is displayed");
        System.out.println("6. wood spoon types in search engine and clicked");
    }

    public static void verifyResultsAreDisplayed() {
        System.out.println("7. Pass; search result are successfully displayed");
        System.out.println("8. 9 pages of wooden spoon saples displayed");
    }

}
