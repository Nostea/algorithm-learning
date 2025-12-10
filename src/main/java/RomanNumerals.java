import java.util.ArrayList;
import java.util.Scanner;

public class RomanNumerals {
    public static void main(String[] args) {
        /*
        Das Programm soll nach der Eingabe einer römischen Zahl, bestehend aus mehreren römischen Zeichen die entsprechende Dezimalzahl ausgeben (I = 1, V = 5, X = 10, L = 50, C = 100, D = 500, M = 1000). Eine Verarbeitung soll bis zur Dezimalzahl 3999 möglich sein. Es muss keine Eingabeprüfung stattfinden.

        Die Regeln für römische Zahlen lauten:

        Additionsregel: Alle Zeichen nebeneinander werden addiert. Kleinere Zahlen folgen größeren, also zum Beispiel XVII = 10+5+1+1 = 17.
        Maximal 3 gleiche Zeichen: Es dürfen nur maximal 3 gleiche Zeichen aufeinander folgen
        (also: III, XXX, CCC oder MMM). Die Zahlzeichen V, L, D stehen nie mehrfach, denn bspw. VV wäre ja X.
        Subtraktionsregel: Steht ein kleines Zahlzeichen (wie I) vor einem größeren (wie V), so wird es abgezogen. Also 4 wäre IV (1 vor 5). Es darf immer nur ein Zeichen vorangestellt werden (erlaubt sind I, X und C).
        Reihenfolge bei Subtraktion: Eine bestimmte Reihenfolge ist bei der Subtraktion einzuhalten:

        I (1) darf nur von V (5) und X (10) abgezogen werden. Erlaubt sind also nur IV und IX.
        X (10) darf nur von L (50) und C (100) abgezogen werden. Erlaubt sind also nur XL und XC.
        C (100) darf nur von D (500) und M (1000) abgezogen werden. Erlaubt sind also nur CD und CM.
         */

        Scanner scanner = new Scanner(System.in);
        System.out.print("Bitte geben sie eine römische Zahl ein(1 - 3999): ");
        String romanNumeral = scanner.next().trim().toUpperCase();

        /* Wichtige test cases:
         I = 1
         MMMCMXCIX = 3999
         CDXLIV = 444
         MCMXC = 1990
         */

        ArrayList<String> romanNumeralList = new ArrayList<String>(); // 4

        for (int j = 0; j < romanNumeral.length(); j++) {
            romanNumeralList.add(romanNumeral.substring(j, j + 1)); //
        }

        ArrayList<Integer> parsedNumberList = new ArrayList<Integer>();
        String letter;
        for (int j = 0; j < romanNumeralList.size(); j++) {
            letter = romanNumeralList.get(j);
            switch (letter) {
                case "M":
                    parsedNumberList.add(1000);
                    break;
                case "D":
                    parsedNumberList.add(500);
                    break;
                case "C":
                    parsedNumberList.add(100);
                    break;
                case "L":
                    parsedNumberList.add(50);
                    break;
                case "X":
                    parsedNumberList.add(10);
                    break;
                case "V":
                    parsedNumberList.add(5);
                    break;
                case "I":
                    parsedNumberList.add(1);
                    break;
                default:
                    System.out.println("Fehler!");
                    break;
            }
        }

        System.out.println("step1: " + parsedNumberList);

        // 10,5,1,1
        // MMMCMXCIV -> 1000,1000,1000,100,1000,10,100,1,5
        // Wenn aktuelles zeichen < nächstes zeichen   wende dann die Substraktionsregel an 100 < 1000, das heisst 1000-100 = 900

        for (int i = 0; i < parsedNumberList.size(); i++) {
            // fall: nächster buchstabe ist gleich groß oder kleiner. Addition
            if (i != parsedNumberList.size() - 1) { // solange nich am endindex der schleife (wegen vorausschauendem check prinzip unten)
                if (parsedNumberList.get(i) < parsedNumberList.get(i + 1)) {
                    parsedNumberList.set(i, parsedNumberList.get(i + 1) - parsedNumberList.get(i)); // an der Position 4, soll der wert von der Rechnung pos5-pos4 eingetragen werden
                    parsedNumberList.remove(i + 1); // löscht den höheren Listeneintrag, damit nur das ergebnis übrig bleibt
                    // 1000,1000,1000,900,>>>10,100<<<,>>>1,5<<<
                    // 1000, 1000, 1000, 900,
                    //i = i - 1; <- für sauberkeit den index zurück damit die neue zahl mit in den algorthmus neu gecheckt wird. Aber nicht notwendig weil es sowieso schon funktioniert
                } else if (parsedNumberList.get(i) == parsedNumberList.get(i + 1)) {
                    System.out.println("gleich, nix wird ersetzt");
                } else {
                    System.out.println("größereZahl > kleinereZahl, nix wird ersetzt,  default");
                }
            } else {
                System.out.print("");
            }

        }

        System.out.println("step2: " + parsedNumberList);
        int resultNumber = 0;
        for (int i = 0; i < parsedNumberList.size(); i++) {
            resultNumber += parsedNumberList.get(i);
        }

        System.out.println("Die römische Zahl " + romanNumeral + " entspricht der Dezimalzahl: " + resultNumber + ".");
    }
}
