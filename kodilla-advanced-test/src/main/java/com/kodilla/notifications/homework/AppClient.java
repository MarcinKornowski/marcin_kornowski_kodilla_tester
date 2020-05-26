package com.kodilla.notifications.homework;

public interface AppClient {
    void receive(WeatherNotification weatherNotification);
    void receiveTerms(Terms terms);
    void addPlace(Places places);
    void removePlace(Places places);
}
