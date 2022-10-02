package edu.najah.eng.solid.di.example2;


public class Emailer {

    public String generateWeatherAlert(String weatherConditions) {
        String alert = "It is " + weatherConditions;
        return alert;
    }
}
