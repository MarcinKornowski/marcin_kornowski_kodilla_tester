package com.kodilla.mockito.homework;

import com.kodilla.notifications.homework.AppClient;
import com.kodilla.notifications.homework.Places;
import com.kodilla.notifications.homework.Terms;
import com.kodilla.notifications.homework.WeatherNotification;

import java.util.HashMap;
import java.util.Map;

public class WeatherAlert {

    private Map<AppClient, Places> clientsAndPlaces = new HashMap<>();
    //dodaje uzytkownika / dodaje miejsce
    public void addSubscriber(AppClient appClient, Places places) {
        for(Map.Entry<AppClient, Places> clientEntry : clientsAndPlaces.entrySet()) {
            if(clientEntry.getKey().equals(appClient)) {
                clientEntry.getKey().addPlace(places);
            }
        }
        clientsAndPlaces.put(appClient, places);
    }

    //usuwa miejsce / usuwa użytkownika
    public void removeSubscriber(AppClient appClient, Places places) {
        for(Map.Entry<AppClient, Places> clientEntry : clientsAndPlaces.entrySet()) {
            if(clientEntry.getKey().equals(appClient)) {
                clientEntry.getKey().removePlace(places);
            }
        }
        clientsAndPlaces.remove(appClient);
    }

    //wysyła alert do zapisanych uzytkowników
    public void sendAlert(WeatherNotification weatherNotification) {
        if(clientsAndPlaces.entrySet().size() > 0) {
            this.clientsAndPlaces.forEach((appClient, places) -> appClient.receive(weatherNotification));
        }
    }

    //wysyła regulamin do wszystkich uzytkowników
    public void sendTermsAndConditions(Terms terms) {
        this.clientsAndPlaces.forEach(((appClient, places) -> appClient.receiveTerms(terms)));
    }

}
