package app;

public class Main {

    public static void main(String[] args) {
        System.out.println("App for temperature converting." );

        double frh = 68;

        double celsius = convFrhToCel(frh);

        System.out.println("Result is celsius: " + celsius);

    }

    private static double convFrhToCel(double frh) {
        return ((frh - 32) * 5) / 9;
    }

}
