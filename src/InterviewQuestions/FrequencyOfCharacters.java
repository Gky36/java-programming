package InterviewQuestions;

public class FrequencyOfCharacters
{
    /**
     * Write a return method that can find the frequency of characters
     *      *
     *      * Ex:  FrequencyOfChars("AAABBCDD") ==> A3B2C1D2
     */

    public static void main(String[] args)
    {
        FrequencyOfCharacters pew = new FrequencyOfCharacters();
        System.out.println(pew.frequencyOfChars("AAABBCDDA"));
    }

    public String frequencyOfChars(String word){
        String result = "";
        for (int i = 0; i < word.length(); i++) {
            int count = 0;
            for (int j = 0; j < word.length(); j++) {
                if(word.charAt(i) == word.charAt(j)){
                    count++;
                }
            }
            if(!result.contains(""+word.charAt(i))) {
                result += "" + word.charAt(i) + count;
            }
        }
        return result;
    }
}
