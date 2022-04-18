package Chapter_8;

public class Metric {

    /**
     * The milesToKilometers method converts a
     * distance in miels to kilometers
     * @param m
     * @return
     */
    public static double milesToKilometers(double m){
        return m * 1.609;
    }

    public static double kilometersToMiles(double k){
        return k / 1.609;
    }
}
