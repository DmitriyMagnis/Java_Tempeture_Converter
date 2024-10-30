package app;

public class Main {

    public static void main(String[] args) {
        System.out.println("App for temperature converting." );

        double frh = 68;
        double cel = 20;

        double celsius = convFrhToCel(frh);
        double fahrenheit = convCelToFrh(cel);
        System.out.println("Result is celsius: " + celsius);
        System.out.println("Result is Fahrenheit: " + fahrenheit);
    }

    private static double convFrhToCel(double frh) {
        return ((frh - 32) * 5) / 9;
    }

    private static double convCelToFrh(double cel) {
        return (cel * 9 / 5) + 32;
    }
}
