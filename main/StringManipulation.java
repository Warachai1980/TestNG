import java.util.Arrays;
import java.util.Locale;

public class StringManipulation {


    public String convertFirstLetterToUppercase(String testWords) {
        String[] words = testWords.split(" ");
        String sentence = "";

        for(String eachWord: words){
            String firstLetter = eachWord.charAt(0) + "";
            String restLetters = eachWord.substring(1);
            sentence += firstLetter.toUpperCase() + restLetters + " ";
        }

        return sentence.trim();
    }

    public String Uppercase(String testWords) {

            String result = "";
            for(String each: testWords.split(" ")){
                result += each.substring(0,1).toUpperCase();
            }
            return result;
        }
}


