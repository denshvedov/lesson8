package ru.ifmo.md.lesson8.DataClasses;

public class City {
    private final String cityName;
    private final String countryName;
    private final int woeid;

    public City(String cityName, String countryName, int woeid) {
        this.cityName = cityName;
        this.countryName = countryName;
        this.woeid = woeid;
    }

    public String getCityName() {
        return cityName;
    }

    public String getCountryName() {
        return countryName;
    }

    public int getWoeid() {
        return woeid;
    }

    public String toString() {
        return cityName + ", " + countryName + ", " + woeid;
    }
}
