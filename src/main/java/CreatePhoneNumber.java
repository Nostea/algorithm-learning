public class CreatePhoneNumber {
    public static String createPhoneNumber(int[] numbers) {

        // "" needed to convert to string concatenation
        String first = "" + numbers[0] + numbers[1] + numbers[2];
        String middle = "" + numbers[3] + numbers[4] + numbers[5];
        String last = "" + numbers[6] + numbers[7] + numbers[8] + numbers[9];

        String phoneNumber = "(" + first + ") " + middle + "-" + last;
        return phoneNumber;

        //return String.format("(%d%d%d) %d%d%d-%d%d%d%d",numbers[0],numbers[1],numbers[2],numbers[3],numbers[4],numbers[5],numbers[6],numbers[7],numbers[8],numbers[9]);
    }
}
