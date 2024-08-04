package Converter;

public class Converter {

    public static void main(String[] args) {
        double x = 1;
        double y = 100;
        double z = 1000;
        int time = 1;

        ConvertDistance convertDistance = new ConvertDistance();
        System.out.println( x + " metrów to " + convertDistance.metersIntoCentymeters(x) + "centymetrów");
        System.out.println( x + " metrów to " + convertDistance.metersIntoMilimeters(x) + "milimetrów");
        System.out.println( y + " centymetrów to " + convertDistance.centymetersIntoMeters(y) + "milimetrów");
        System.out.println( z + " milimetrów to " + convertDistance.milimetersIntoMeters(z) + "metrów");


        ConvertTime convertTime = new ConvertTime();
        System.out.println(time +  "h = " + convertTime.hourIntoMinutes(time) + " minutes");
        System.out.println(time +  "minutes = " + convertTime.minutesIntoSeconds(time) + " seconds");
        System.out.println(convertTime.minutesIntoSeconds(time) +  "seconds = " + convertTime.secondsIntoMiliseconds(time) + " milicesonds");
    }



}
