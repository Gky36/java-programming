package day60_exceptions;

public class ThrowingException
{
    public static void main(String[] args) {
        System.out.println("lets create exceptions");
//        RuntimeException e = new RuntimeException();
//        throw e;
        throw new RuntimeException();
    }
}
