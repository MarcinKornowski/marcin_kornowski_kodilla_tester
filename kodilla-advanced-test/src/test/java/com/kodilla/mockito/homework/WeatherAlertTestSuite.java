package com.kodilla.mockito.homework;

import com.kodilla.notifications.homework.AppClient;
import com.kodilla.notifications.homework.Places;
import com.kodilla.notifications.homework.Terms;
import com.kodilla.notifications.homework.WeatherNotification;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

//import static org.junit.Assert.*;

public class WeatherAlertTestSuite {
    @Test
    public void notSubscribedClientShouldNotReceiveAlerts() {
        WeatherAlert weatherAlert = new WeatherAlert();
        AppClient client1= Mockito.mock(AppClient.class);
        Places places = Mockito.mock(Places.class);
        WeatherNotification weatherNotification = Mockito.mock(WeatherNotification.class);

        weatherAlert.sendAlert(weatherNotification);
        Mockito.verify(client1, Mockito.never()).receive(weatherNotification);
    }

    @Test
    public void subscribedClientShouldReceiveAlertsIfSignedToOneLocation() {
        WeatherAlert weatherAlert = new WeatherAlert();
        AppClient client1 = Mockito.mock(AppClient.class);
        Places place1 = Mockito.mock(Places.class);
        WeatherNotification weatherNotification = Mockito.mock(WeatherNotification.class);

        weatherAlert.addSubscriber(client1, place1);
        weatherAlert.sendAlert(weatherNotification);
        Mockito.verify(client1, Mockito.times(1)).receive(weatherNotification);
    }

    @Test
    public void subscribedClientShouldReceiveAlertsIfSignedToMoreThanOneLocation() {
        WeatherAlert weatherAlert = new WeatherAlert();
        AppClient client1 = Mockito.mock(AppClient.class);
        Places place1 = Mockito.mock(Places.class);
        Places place2 = Mockito.mock(Places.class);
        Places place3 = Mockito.mock(Places.class);
        WeatherNotification weatherNotification = Mockito.mock(WeatherNotification.class);

        weatherAlert.addSubscriber(client1, place1);
        weatherAlert.addSubscriber(client1, place2);
        weatherAlert.addSubscriber(client1, place3);

        weatherAlert.sendAlert(weatherNotification);
        Mockito.verify(client1, Mockito.times(1)).receive(weatherNotification);
    }

    @Test
    public void allSubscribersShouldReceiveTerms() {
        WeatherAlert weatherAlert = new WeatherAlert();
        AppClient client1 = Mockito.mock(AppClient.class);
        AppClient client2 = Mockito.mock(AppClient.class);
        AppClient client3 = Mockito.mock(AppClient.class);
        Places place1 = Mockito.mock(Places.class);
        Places place2 = Mockito.mock(Places.class);
        Places place3 = Mockito.mock(Places.class);
        Terms terms = Mockito.mock(Terms.class);

        weatherAlert.addSubscriber(client1, place1);
        weatherAlert.addSubscriber(client2, place2);
        weatherAlert.addSubscriber(client3, place3);

        weatherAlert.sendTermsAndConditions(terms);
        Mockito.verify(client1, Mockito.times(1)).receiveTerms(terms);
        Mockito.verify(client2, Mockito.times(1)).receiveTerms(terms);
        Mockito.verify(client3, Mockito.times(1)).receiveTerms(terms);

    }

    @Test
    public void unsubscribedSubscribedClientShouldNotReceiveNotification() {
        WeatherAlert weatherAlert = new WeatherAlert();
        AppClient appClient = Mockito.mock(AppClient.class);
        Places place1 = Mockito.mock(Places.class);
        WeatherNotification weatherNotification = Mockito.mock(WeatherNotification.class);

        weatherAlert.addSubscriber(appClient, place1);

        weatherAlert.removeSubscriber(appClient, place1);

        weatherAlert.sendAlert(weatherNotification);
        Mockito.verify(appClient, Mockito.never()).receive(weatherNotification);
    }
}