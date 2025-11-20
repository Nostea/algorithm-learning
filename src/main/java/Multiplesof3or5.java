import java.util.ArrayList;

public class Multiplesof3or5 {

    public int solveMultiplesOf3or5(int number) {
        // 10
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        ArrayList<Integer> resultArray = new ArrayList<Integer>();

        for (int i = 1; i <= number; i++) {
            numbers.add(i);
            System.out.println(numbers.get(i));
/*
            if (numbers.get(i) <= number && (numbers.get(i) % 3 == 0) || (numbers.get(i) % 5 == 0)) {
                return resultArray.add(i);
            }
*/
        }


        int result = 0;
        return result;
    }

}
