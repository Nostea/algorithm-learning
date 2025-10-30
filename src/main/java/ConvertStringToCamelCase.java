public class ConvertStringToCamelCase {

    public static void main(String[] args) {
        System.out.println(ConvertStringToCamelCase.toCamelCase("the-stealth-warrior"));
        System.out.println(ConvertStringToCamelCase.toCamelCase("The-Stealth-Warrior"));
        System.out.println(ConvertStringToCamelCase.toCamelCase("the_stealth-warrior"));
    }

        /*
            Complete the method/function so that it converts dash/underscore delimited words into camel casing.
            The first word within the output should be capitalized only if the original word was capitalized
            (known as Upper Camel Case, also often referred to as Pascal case).
            The next words should be always capitalized.

            __Examples__

            "the-stealth-warrior" gets converted to "theStealthWarrior"

            "The_Stealth_Warrior" gets converted to "TheStealthWarrior"

            "The_Stealth-Warrior" gets converted to "TheStealthWarrior"
        */

    static String toCamelCase(String string) {

        /*
            - convert - and _ delimited words into camelCase
            - first word only capitalized if it was input Capitalized
            - words after - _ capitalized
        */

        //split string using regex
        //String[] arr = s.split("[, ?.@]");
        String input = "the-stealth-warrior";

        String[] array = string.split("[-_]");

        /*
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        System.out.println("====");
        */
        

        for (int j = 1; j < array.length; j++) { // erstes wort egal
            String tempSubstring = array[j].substring(0, 1).toUpperCase() + array[j].substring(1); // H + allo
            array[j] = tempSubstring;
            //System.out.println(array[j]);
        }
        String word1 = array[0];


        StringBuilder output = new StringBuilder();

        for (String word : array) {
            output.append(word);
        }

        String newOutput = output.toString();
        //System.out.println("______");
        //System.out.println(newOutput);

        return newOutput;
    }
}

