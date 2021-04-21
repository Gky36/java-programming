package day05_primitives_concatenation;

public class UsingVariables
{
    public static void main(String[] args)
    {
        int num1 = 100;
        int num2 = num1;

        System.out.println(num1);
        System.out.println(num2);

        num1 = 200;
        System.out.println(num1);
        System.out.println(num2);

        int n1= 55;
        int n2= n1;
        int n3= n2;

        System.out.println(n1);
        System.out.println(n2);
        System.out.println(n3);

        n1 = 30;
        System.out.println(n1);

        int inthirasZipCode = 22182;
        int parvinsZipCode = inthirasZipCode;
        System.out.println(inthirasZipCode);
        System.out.println(parvinsZipCode);

        inthirasZipCode = 20007;
        parvinsZipCode = 33131;
        System.out.println(inthirasZipCode);
        System.out.println(parvinsZipCode);
        // intirasZipcode degisti ama parvini effect yapmadi
    }
}

// Ilk ornekte gordugumuz gibi num1 assign num2 yaptik
// Ikinci ornekte de assign yapmadigimiz icn degeri degismedi