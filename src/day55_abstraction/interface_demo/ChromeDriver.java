package day55_abstraction.interface_demo;

public class ChromeDriver implements WebDriver
{
    // CLASS implements interface, and must override abstract methods
    // abstract method without body a

    @Override
    public void get(String url) {
        System.out.println("ChromeDriver - navigating to "+url);
    }

    @Override
    public void findElement(String locator) {
        System.out.println("ChromeDriver - locating element by "+locator);
    }

    @Override
    public void quit() {
        System.out.println("ChromeDriver - quiting ");
    }

    @Override
    public String getTitle() {
        return "Wooden spoon title";
    }
}
