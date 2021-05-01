package GroupStudies;

public class DuplicatedString {
    public static void main(String[] args) {

        int[] number = {22, 40, 52, 36, 22, 36};


        for (int i = 0; i < number.length; i++) {
            int count = 0;
            for (int j = 0; j < number.length; j++) {
                if (number[i] == number[j]) {
                    count++;
                }
            }
            if (count > 1) {
                System.out.println(number[i]);
            }
        }

    }
}
