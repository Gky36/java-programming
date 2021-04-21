package SaimExamples;

public class PasswordExample
{
    public static void main(String[] args)
    {
      String username="gokay";
      String passwordVerify="gokayy";

      if (username.equals(passwordVerify))
      {
          if (passwordVerify.length()>=5 && !passwordVerify.contains(username))
          {
              System.out.println("Valid Password");
          }
          else
          {
              System.out.println("Invalid password, username should not be in it");
          }
      }
      else
      {
          System.out.println("Invalid password");
      }
    }
}
/*
Given a username and password verify they are valid.
    - The password cannot be less than 5 characters
        -> If it is less print: "Password cannot be less than 5 characters"
        -> If it is more then or equal to 5 print: "Valid password"

    - Also the password should not contain the username
        - If the password has the username in it print:
            "Invalid password, username should not be in it"
            -> Also change the password to have the value: "password"
 */