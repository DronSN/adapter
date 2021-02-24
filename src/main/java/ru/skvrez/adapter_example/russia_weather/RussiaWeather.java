package ru.skvrez.adapter_example.russia_weather;

import ru.skvrez.adapter_example.shared.City;

import java.time.LocalDate;

public interface RussiaWeather {

    String getForeCast(City city, LocalDate date);
}
