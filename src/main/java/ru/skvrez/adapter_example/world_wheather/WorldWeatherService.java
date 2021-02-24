package ru.skvrez.adapter_example.world_wheather;

import ru.skvrez.adapter_example.shared.GeoCoordinate;

import java.util.Date;

public class WorldWeatherService implements WorldWeather {

    @Override
    public String getForecastByCoordinates(GeoCoordinate longitude, GeoCoordinate latitude, Date date) {
        return String.format("%s will be sunny", date);
    }
}
