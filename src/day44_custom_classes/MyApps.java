package day44_custom_classes;

public class MyApps
{
    public static void main(String[] args)
    {
      //String app = "uber";
      App uberApp = new App(); //create new object
      uberApp.open(); // call open method using object variable

      //opening Uber app - version= 3.5
      uberApp.name = "Uber";
      uberApp.version = 3.5;
      uberApp.open();

      uberApp.version = 4.0;
      uberApp.open(); // open new version


    }
}
