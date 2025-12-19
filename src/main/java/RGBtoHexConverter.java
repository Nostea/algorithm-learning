public class RGBtoHexConverter {

    public static String rgb(int r, int g, int b) {

        r = Math.max(0, Math.min(255, r));
        g = Math.max(0, Math.min(255, g));
        b = Math.max(0, Math.min(255, b));

        /*
        if (r > 255) {
            r = 255;
        } else if (r < 0) {
            r = 0;
        }

        if (g > 255) {
            g = 255;
        } else if (g < 0) {
            g = 0;
        }

        if (b > 255) {
            b = 255;
        } else if (b < 0) {
            b = 0;
        }
        */

        String hexR = String.format("%02X", r);
        String hexG = String.format("%02X", g);
        String hexB = String.format("%02X", b);

        return hexR + hexG + hexB;
    }

    public static void main(String[] args) {
        System.out.println(rgb(0, 0, 0));
        System.out.println(rgb(1, 2, 3));
        System.out.println(rgb(255, 255, 255));
        System.out.println(rgb(254, 253, 252));
        System.out.println(rgb(-20, 275, 125));
    }
}
