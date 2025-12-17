public class DetectPangram {

    public static boolean check(String sentence) {
        char[] alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();

        String trimmedSentence = sentence.replaceAll("[^a-zA-Z]", "").toLowerCase();
        char[] sentenceArray = trimmedSentence.toCharArray();

        for (char charInAlphabet : alphabet) {
            boolean found = false;
            for (char charInSentence : sentenceArray) {
                if (charInAlphabet == charInSentence) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        check("The quick brown fox jumps over the lazy dog");
        System.out.println(check("The quick brown fox jumps over the lazy dog"));
    }
}
