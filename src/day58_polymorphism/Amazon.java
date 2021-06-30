package day58_polymorphism;

public class Amazon extends OnlineShop implements Prime
{
    @Override
    void buy() {
        System.out.println("Buying items on amazon.com");
    }

    @Override
    void sell() {
        System.out.println("Selling items on Amazon");
    }

    @Override
    public void primeShipping() {
        System.out.println("amazon shipping");
    }
}
