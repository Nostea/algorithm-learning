public class IfElse {

    public static void getTicketPrice(int age, boolean isStudent) {
        if (age < 12) {
            System.out.println("age: " + age + " Price: 5Euro");
        } else if (age > 65) {
            System.out.println("age: " + age + " Price: 7Euro");
        } else if (age > 18 && isStudent == true) {
            System.out.println("age: " + age + " Price: 8Euro");
        } else {
            System.out.println("age: " + age + " Price: 12Euro");
        }
    }

    public static void findMax(int a, int b, int c) {
        if (a >= b && a >= c) {
            System.out.println(a);
        } else if (b >= a && b >= c) {
            System.out.println(b);
        } else {
            System.out.println(c);
        }
    }


    public static void main(String[] args) {

        getTicketPrice(8, false);     // sollte 5 sein
        getTicketPrice(11, true);     // sollte 5 sein

        getTicketPrice(20, true);     // sollte 8 sein
        getTicketPrice(25, true);     // sollte 8 sein

        getTicketPrice(30, false);    // sollte 12 sein
        getTicketPrice(50, false);    // sollte 12 sein

        getTicketPrice(66, false);    // sollte 7 sein
        getTicketPrice(70, true);     // sollte 7 sein (Senior hat Vorrang vor Student)

        getTicketPrice(12, false);    // sollte 12 sein (nicht mehr Kind)
        getTicketPrice(65, false);    // sollte 12 sein (noch kein Senior)

        System.out.println("---------");
        findMax(5, 10, 3);      // sollte 10 sein
        findMax(15, 5, 20);     // sollte 20 sein
        findMax(30, 30, 30);    // sollte 30 sein
        findMax(-5, -10, -3);   // sollte -3 sein
        findMax(100, 50, 75);   // sollte 100 sein
    }


}
