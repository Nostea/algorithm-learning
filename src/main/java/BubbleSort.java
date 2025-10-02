public class BubbleSort {
    static void bubbleSort(int[] array) {
        int arrayLength = array.length;

        // einmal alle elemente durchgehen
        for (int i = 0; i < arrayLength - 1; i++) {
            //innere schleife für paarvergleich, mit jedem durchgach 1 zahl weniger sortiert
            for (int j = 0; j < arrayLength - i - 1; j++) { //arraylength = . Mit jedem arraydurchlauf, 1 weniger loop durch die values
                if (array[j] > array[j + 1]) { //wenn zahl j größer ist, als die nächste zahl im array
                    int temp = array[j]; // temporären speicherort für zahl 1/j erstellen
                    array[j] = array[j + 1]; // zahl j ist jetzt die 2.te zahl
                    array[j + 1] = temp; // hier ist jetzt die j zahl drin
                }

            }
        }

    }


}
