import java.util.Random;

public class GuessTheDoorGame {

    public static double winCountChange = 0.0;
    public static double winCountKeepDoor = 0.0;
    public static double simulationCountChangeDoor = 0.0;
    public static double simulationCountKeepDoor = 0.0;

    public static int[] generateDoorCombinations() {
        int[] doorArray1 = {3, 0, 0}; //0, 3 = preis, 1=user türauswahl;
        int[] doorArray2 = {0, 3, 0}; //1
        int[] doorArray3 = {0, 0, 3}; //2

        Random random = new Random();
        int[][] allPossibleDoorArrays = {doorArray1, doorArray2, doorArray3}; // ein Array von int Arrays
        int[] doorArray = allPossibleDoorArrays[random.nextInt(3)];  // 0,1,2
        return doorArray;
    }

    //Strategieauswahl   1 = change, 2 = keep
    public static void runSimulation(int strategy, int[] doorArray, int userPick, int gameMasterDoorPick) {
        // 3 Türen
        // 1 Tür wird vom spieler ausgewählt, NICHT geöffnet
        // Moderator: öffnet eine Tür die NICHT vom spieler ausgewählt ist, UND NICHT den preis hat.
        //Simulation schreiben: Programm abhängig von Wert n dieses Spiel n-mal für jede strategie WECHSELN oder NICHTWECHSELN ausführen
        //Mittlere erfolgschance für jede strategie ausgeben

        //Beispiel ausgabe:
        //Wechseln: 0.5
        //Nichtwechseln: 0.

        System.out.println("There are 3 doors. Behind one of them is the prize! Pick from door 1,2,3");

        System.out.println("The game master opens door:" + gameMasterDoorPick);
        // 1 = geöffnete tür, an position x wird die tür mit wert 1 geöffnet
        doorArray[gameMasterDoorPick - 1] = 1;

        //System.out.println("Do you want to switch which door to open? y or n");
        //char userCharInput = scanner.next().charAt(0);

        // {1,3,0]
        int oldUserPick = userPick;

        if (strategy == 1) {
            //userCharInput == 'y') {
            System.out.println("You picked " + userPick + ", GM already opened: " + (gameMasterDoorPick) + " Opening remaining door");
            //userPick = scanner.nextInt(); // nicht validiert, user input version

            for (int i = 1; i <= 3; i++) { // auswählen der übrigen tür, nach ausschlussskriterium
                if (i != oldUserPick && i != gameMasterDoorPick) {
                    userPick = i;
                    break;
                }
            }
            simulationCountChangeDoor += 1.0;
            if (doorArray[userPick - 1] == 3) {
                winCountChange += 1.0;
                //System.out.println("You won!!! " + userPick + " has the prize. STRAT=Switch");
            } else {
                //System.out.println("You lost :( Door" + userPick + "has no Prize. STRAT=Switch");
            }


        } else if (strategy == 2) {
            //else if (userCharInput == 'n') {
            System.out.println("Opening door " + userPick);
            simulationCountKeepDoor += 1.0;
            if (doorArray[userPick - 1] == 3) {
                winCountKeepDoor += 1.0;
                //System.out.println("You won!!! " + userPick + " has the prize. STRAT=Keep");
            } else {
                //System.out.println("You lost :( Door" + userPick + "has no Prize. STRAT=Keep");
            }

        } else {
            System.out.println("Only y or n allowed");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        int n = 1000;
        int max = 3; // range 1-3
        System.out.println(n + " Wiederholungen der Runden______");

        for (int i = 1; i <= n; i++) {
            // Zufallswerte EINMAL pro Durchgang generieren
            int[] doorArray = generateDoorCombinations();
            int userPick = (int) (Math.random() * max) + 1;
            int gameMasterDoorPick = (int) (Math.random() * max) + 1;

            //gm darf nicht die tür mit preis wählen & nicht die usertü wählen
            while (userPick == gameMasterDoorPick || doorArray[gameMasterDoorPick - 1] == 3) {
                gameMasterDoorPick = (int) (Math.random() * max) + 1;
            }

            runSimulation(1, doorArray.clone(), userPick, gameMasterDoorPick);
            runSimulation(2, doorArray.clone(), userPick, gameMasterDoorPick);
        }

        double averageSuccessSwitch = winCountChange / simulationCountChangeDoor;
        double averageSuccessKeep = winCountKeepDoor / simulationCountKeepDoor;


        System.out.println("_________________");
        System.out.println("mittlere Erfolgswahrscheinlichkeit SWITCH: " + averageSuccessSwitch + "   " + "totalgames= " + simulationCountChangeDoor + "   " + "wins= " + winCountChange);
        System.out.println(("mittlere Erfolgswahrscheinlichkeit KEEP:" + averageSuccessKeep + "   " + "totalgames= " + simulationCountKeepDoor + "   " + "wins= " + winCountKeepDoor));

    }

}

