import java.util.HashMap;
import java.util.Map;

public class CountingDuplicates {
    public static int duplicateCount(String text) {
        Map<Character, Integer> charCount = new HashMap<>();

        String lowerText = text.toLowerCase();

        for (char letter : lowerText.toCharArray()) {
            charCount.put(letter, charCount.getOrDefault(letter, 0) + 1);
        }

        int duplicates = 0;
        for (int count : charCount.values()) {
            if (count > 1) {
                duplicates++;
            }
        }

        return duplicates;
    }
}
