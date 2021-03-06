package day59_polymorphism_exceptions;

public class Link implements WebElement{

    public static final String TAG_NAME = "a";

    public void getLinkHref(){
        System.out.println("http://www.java.com");
    }

    @Override
    public void sendKeys(String txt) {
        System.out.println("not supported");
    }

    @Override
    public void click() {
        System.out.println("Clicking the link");
    }

    @Override
    public String getText() {
        return "Oracle java";
    }
}
