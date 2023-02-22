package WeatherApp;

public class WeatherApp {
    public static void main(String[] args) {
        // OB HAVO HAQIDA MA'LUMOT
        WeatherInfo info1 = new WeatherInfo("Tashkent", "Uzbekistan", 13, "Sunny");
        WeatherInfo info2 = new WeatherInfo("Samarkand", "Uzbekistan", 12.3, "Cloudy");

        // ob-havo prognozlarini yaratish
        WeatherForecast forecast1 = new WeatherForecast("San Francisco", "USA", 18.7, "Partly cloudy", "Wednesday");
        WeatherForecast forecast2 = new WeatherForecast("Paris", "France", 8.9, "Rainy", "Thursday");

        // print out the weather information and forecasts
        System.out.println(info1.toString());
        System.out.println(info2.toString());
        System.out.println(forecast1.toString());
        System.out.println(forecast2.toString());
    }
}

// OB HAVO HAQIDA MALUMOT
class WeatherInfo {
    private String city;//SHAHAR
    private String country;//MAMLAKAT
    private double temperature;//TEMPERATURA
    private String description;//HOLAT

    public WeatherInfo(String city, String country, double temperature, String description) {
        this.city = city;
        this.country = country;
        this.temperature = temperature;
        this.description = description;
    }

    public String getCity() {
        return city;
    }

    public String getCountry() {
        return country;
    }

    public double getTemperature() {
        return temperature;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return "Ob-havo " + city + ", " + country + ": " + temperature + " daraja Selsiy, " + description;
    }
}

//Ob-Havo Ma'lumoti
class WeatherForecast extends WeatherInfo {
    private String date;

    public WeatherForecast(String city, String country, double temperature, String description, String date) {
        super(city, country, temperature, description);
        this.date = date;
    }

    public String getDate() {
        return date;
    }

    @Override
    public String toString() {
        return "Ob-havo ma'lumoti " + getCity() + ", " + getCountry() + " on " + date + ": " + getTemperature() +
                " daraja Selsiy, " + getDescription();
    }
    }



