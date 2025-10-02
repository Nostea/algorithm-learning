public class Main {
    static void main(String[] args) {
        // start des sorts
        //what is bubble sort?: the simplest sorting algorithm that works
        // by repeatedly swapping the adjacent elements if they are in the wrong order

        int[] numbers = {7, 12, 9, 11, 3};


        System.out.println("unsorted array");
        for (int num : numbers) {
            System.out.print(num + " ");
        }

        BubbleSort.bubbleSort(numbers);

        System.out.println("Sortiertes Array");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
    }
}
