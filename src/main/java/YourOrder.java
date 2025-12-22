import java.util.ArrayList;
import java.util.Arrays;

public class YourOrder {

    public static String assignOrder(String input) {
        if(input.isEmpty()) {
            return "";
        }
        String[] wordArray = input.split(" ");
        ArrayList<String> wordList = new ArrayList<>(Arrays.asList(wordArray));
        ArrayList<String> sortedOrder = new ArrayList<>();


        for(int j = 1; j <= 9; j++) {
            String temp = "" + j;
            for(int i = 0; i < wordArray.length; i++) {
                if(wordList.get(i).contains(temp)){
                    sortedOrder.add(wordList.get(i));
                }
            }
        }

        return String.join(" ", sortedOrder);
    }

    public static void main(String[] args) {
        assignOrder("is2 Thi1s T4est 3a");
        System.out.println(assignOrder("is2 Thi1s T4est 3a"));

    }
}

/*
Your task is to sort a given string. Each word in the string will contain a single number. This number is the position the word should have in the result.

Note: Numbers can be from 1 to 9. So 1 will be the first word (not 0).

If the input string is empty, return an empty string. The words in the input String will only contain valid consecutive numbers.

Examples
"is2 Thi1s T4est 3a"  -->  "Thi1s is2 3a T4est"
"4of Fo1r pe6ople g3ood th5e the2"  -->  "Fo1r the2 g3ood 4of th5e pe6ople"
""  -->  ""
 */
