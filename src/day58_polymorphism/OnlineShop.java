package day58_polymorphism;

public abstract class OnlineShop
{
    abstract void buy();
    abstract void sell();
    public void ship(){
        System.out.println("Shipping the purchased items");
    }

}
