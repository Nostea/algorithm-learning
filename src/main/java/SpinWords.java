public class SpinWords {

    public static String spinWords(String sentence) {

        String[] splitSentence = sentence.split(" ");

        for (int i = 0; i < splitSentence.length; i++) { // durch die 3 Wörter iterieren

            if (splitSentence[i].length() >= 5) {
                char[] mirroredWordArray = new char[splitSentence[i].length()];

                for (int j = 0; j < splitSentence[i].length(); j++) {
                    mirroredWordArray[j] = splitSentence[i].charAt(splitSentence[i].length() - 1 - j);
                }
                String mirroredWord = new String(mirroredWordArray);
                splitSentence[i] = mirroredWord;
            }
        }

        return String.join(" ", splitSentence);
    }

    public static void main(String[] args) {
        spinWords("Hey fellow warriors");
        System.out.println(spinWords("Hey fellow warriors")); //Hey wollef sroirraw
    }
}
