package day37_methods_overloading;

public class WarmUpMethod_01
{
    public static void main(String[] args)
    {
      loginVoid("cybertekStudent", "abcd123"); //positive test/ sunny day
      loginVoid("cybertek","answer");   // negative test/ rainy day scenario

      login("cybertekStudent","abcd123");
//    System.out.println(loginVoid("cybertekStudent", "abcd123")); ERROR- VOID- no return value
      System.out.println(login("cybertekStudent","abcd123"));

      if (login("cybertekStudent","abcd123"))
      {
          System.out.println("login successful, welcome to Canvas");
          System.out.println("Select the course to continue");
      }
      else
          {
              System.out.println("Login Failed");
      }

      boolean isLoginSuccess=login("Nadir","Mountain");
        System.out.println("isLoginSuccess = "+isLoginSuccess);

      if (login("nadir","mountain"))
      {
          System.out.println("Welcome to Canvas, Select the course");
      }
      else
      {
          System.out.println("Something wrong with your credentials");
      }

    }

    public static void loginVoid( String Username, String password)
    {
       String secretName="cybertekStudent";
       String secretPassword="abcd123";

       if (Username.equalsIgnoreCase(secretName)  && password.equals(secretPassword))
       {
           System.out.println("Login successful, welcome CybertekStudent!");
       }
       else
           {
           System.out.println("Incorrect username or password");
       }

    }

    public static boolean login(String userName, String password)
    {
        String secretName="cybertekStudent";
        String secretPassword="abcd123";
        return userName.equalsIgnoreCase(secretName)  && password.equals(secretPassword);
    }

}

/*
1) Positive test, to make sure functionality is working as expected.
Valid username, + valid password then i write automation steps for that using my automation framework

2) negative tests, to make sure application is not allowing invalid values, and showing errors.
 */