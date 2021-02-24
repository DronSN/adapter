package ru.skvrez.adapter_example;

import ru.skvrez.adapter_example.russia_weather.RussiaWeather;
import ru.skvrez.adapter_example.shared.City;
import ru.skvrez.adapter_example.world_wheather.WorldWeather;
import ru.skvrez.adapter_example.world_wheather.WorldWeatherService;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;

public class RussiaToWorldService implements RussiaWeather {

    private WorldWeather worldWeather = new WorldWeatherService();

    @Override
    public String getForeCast(City city, LocalDate date) {
        return getWorldForecast(city, date);
    }

    private String getWorldForecast(City city, LocalDate localDate) {
        Date date = java.util.Date.from(localDate.atStartOfDay()
                .atZone(ZoneId.systemDefault())
                .toInstant());
        String worldForecast = worldWeather.getForecastByCoordinates(city.getLatitude(), city.getLongitude(), date);
        return String.format(translate(worldForecast, city));
    }

    private String translate(String text, City city) {
        String translatedText = text;
        return String.format("В городе %s будет следующая погода: %s", city.getName(), translatedText);
    }
}
