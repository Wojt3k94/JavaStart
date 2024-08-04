package Converter;

public class ConvertDistance {

    double metersIntoCentymeters(double x){
        double result = 100 * x;
        return result;
    }

    double metersIntoMilimeters(double x){
        double result = 1000 * x;
        return result;
    }

    double centymetersIntoMeters(double y){
        double result = 100 / y;
        return result;
    }

    double milimetersIntoMeters(double z){
        double result = 1000 / z;
        return result;
    }

}
