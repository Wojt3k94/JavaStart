package Converter;

public class ConvertTime {

    int hourIntoMinutes(int time){
        int minutes = time * 60;
        return minutes;
    }

    int minutesIntoSeconds(int time){
        int seconds = (time * 60) * 60;
        return seconds;
    }

    int secondsIntoMiliseconds(int time){
        int miliseconds = ((time * 60) * 60) * 1000;
        return miliseconds;
    }
}
