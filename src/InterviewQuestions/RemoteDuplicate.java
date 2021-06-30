package InterviewQuestions;

public class RemoteDuplicate
{
    /**
     * Write a return method that can remove the duplicated values from String
     *
     * Ex:  removeDup("AAABBBCCC")  ==> ABC
     */

    public static String removeDup(String str)
    {
        String result = "";

        for (int i=0; i<str.length(); i++)
        {
            if (!result.contains(""+str.charAt(i)))
            {
                result +=""+str.charAt(i);
            }
        }
        return result;

    }
}
