import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class ReplaceWithAlphabetPosition {

    public static String replaceWithAlphabetPosition(String text) {

        ArrayList<Character> letterList = new ArrayList<>();
        ArrayList<Integer> numberList = new ArrayList<>();
        text = text.replaceAll("[^a-zA-Z]", "").toLowerCase();

        HashMap<Character, Integer> alphabetMap = new HashMap<>();

        alphabetMap.put('a', 1);
        alphabetMap.put('b', 2);
        alphabetMap.put('c', 3);
        alphabetMap.put('d', 4);
        alphabetMap.put('e', 5);
        alphabetMap.put('f', 6);
        alphabetMap.put('g', 7);
        alphabetMap.put('h', 8);
        alphabetMap.put('i', 9);
        alphabetMap.put('j', 10);
        alphabetMap.put('k', 11);
        alphabetMap.put('l', 12);
        alphabetMap.put('m', 13);
        alphabetMap.put('n', 14);
        alphabetMap.put('o', 15);
        alphabetMap.put('p', 16);
        alphabetMap.put('q', 17);
        alphabetMap.put('r', 18);
        alphabetMap.put('s', 19);
        alphabetMap.put('t', 20);
        alphabetMap.put('u', 21);
        alphabetMap.put('v', 22);
        alphabetMap.put('w', 23);
        alphabetMap.put('x', 24);
        alphabetMap.put('y', 25);
        alphabetMap.put('z', 26);

        //{a=1, b=2, c=3, d=4, e=5, f=6, g=7, h=8, i=9, j=10, k=11, l=12, m=13, n=14, o=15, p=16, q=17, r=18, s=19, t=20, u=21, v=22, w=23, x=24, y=25, z=26}

        for (int i = 0; i < text.length(); i++) {
            letterList.add(text.charAt(i));
        }
        System.out.println(letterList);

        for (int i = 0; i < letterList.size(); i++) {
            numberList.add(alphabetMap.get(letterList.get(i)));
        }

        String result = "";
        for (int i = 0; i < numberList.size(); i++) {
            result += numberList.get(i) + " ";
        }

        return result.trim();
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        //String input = "The sunset sets at twelve o' clock.";
        System.out.println(replaceWithAlphabetPosition(input));
    }
}
