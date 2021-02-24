package ru.skvrez.adapter_example.russia_weather;

import ru.skvrez.adapter_example.shared.City;

import java.time.LocalDate;

public class RussiaWeatherService implements RussiaWeather {
    @Override
    public String getForeCast(City city, LocalDate date) {
        return String.format("На дату %s погода в городе %s будет солнечная", date, city.getName());
    }
}
