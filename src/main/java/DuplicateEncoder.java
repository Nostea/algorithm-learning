import java.util.HashMap;
import java.util.Map;

public class DuplicateEncoder {

    public static String encode(String word) {
        char[] wordCharacters = word.toLowerCase().toCharArray();
        Map<Character, Integer> duplicatesMap = new HashMap<>();
        StringBuilder encodedWord = new StringBuilder();

        for (Character c : wordCharacters) {
            duplicatesMap.put(c, duplicatesMap.getOrDefault(c, 0) + 1);
        }

        for (char c : wordCharacters) {
            if (duplicatesMap.get(c) == 1) {
                encodedWord.append("(");
            } else {
                encodedWord.append(")");
            }
        }

        return encodedWord.toString();
    }

    public static void main(String[] args) {
        // (((   ()()()   )())())   ))((
        System.out.print(encode("din"));
        System.out.print("   ");
        System.out.print(encode("recede"));
        System.out.print("   ");
        System.out.print(encode("Success"));
        System.out.print("   ");
        System.out.print(encode("(( @"));
    }
}
