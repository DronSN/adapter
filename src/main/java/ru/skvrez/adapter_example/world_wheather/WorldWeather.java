package ru.skvrez.adapter_example.world_wheather;

import ru.skvrez.adapter_example.shared.GeoCoordinate;
import java.util.Date;

public interface WorldWeather {

    String getForecastByCoordinates(GeoCoordinate longitude, GeoCoordinate latitude, Date date);

}
