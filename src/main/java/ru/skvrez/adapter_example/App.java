package ru.skvrez.adapter_example;

import ru.skvrez.adapter_example.russia_weather.RussiaWeather;
import ru.skvrez.adapter_example.russia_weather.RussiaWeatherService;
import ru.skvrez.adapter_example.shared.City;

import java.io.IOException;
import java.time.LocalDate;
import java.util.logging.LogManager;
import java.util.logging.Logger;

public class App {
    private static Logger log = Logger.getLogger(App.class.getName());
    public static void main(String[] args) {
        try {
            LogManager.getLogManager().readConfiguration(
                    App.class.getResourceAsStream("/logging.properties"));
        } catch (IOException e) {
            System.err.println("Could not setup logger configuration: " + e.toString());
        }

        RussiaWeather russiaWeather = new RussiaWeatherService();
        RussiaToWorldService russiaToWorldService = new RussiaToWorldService();
        log.info(getWeather(russiaWeather, new MoscowCity(), LocalDate.now()));
        log.info(getWeather(russiaToWorldService, new MoscowCity(), LocalDate.now()));
    }

    public static String getWeather(RussiaWeather russiaWeather, City city, LocalDate localDate) {
        return  russiaWeather.getForeCast(city, localDate);
    }
}
