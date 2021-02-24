package ru.skvrez.adapter_example;

import ru.skvrez.adapter_example.shared.CardinalPoints;
import ru.skvrez.adapter_example.shared.City;
import ru.skvrez.adapter_example.shared.GeoCoordinate;

public class MoscowCity implements City {

    private final String name = "Москва";
    private final GeoCoordinate longitude = new GeoCoordinate(37.6173, CardinalPoints.EAST);
    private final GeoCoordinate latitude = new GeoCoordinate(55.7558, CardinalPoints.NORTH);

    @Override
    public String getName() {
        return name;
    }

    @Override
    public GeoCoordinate getLongitude() {
        return longitude;
    }

    @Override
    public GeoCoordinate getLatitude() {
        return latitude;
    }
}
