public class WeatherTracker {
    String currentConditions;
    Phone phone;
    Emailer emailer;
    Device rainyAlerter;
    Device sunnyAlerter;

    public WeatherTracker() {
        rainyAlerter = new Phone();
        sunnyAlerter = new Emailer();
    }

    public void setCurrentConditions(String weatherDescription) {
        this.currentConditions = weatherDescription;
        if (weatherDescription == "rainy") {
            String alert = rainyAlerter.generateWeatherAlert(weatherDescription);
            System.out.print(alert);
        }
        if (weatherDescription == "sunny") {
            String alert = sunnyAlerter.generateWeatherAlert(weatherDescription);
            System.out.print(alert);
        }
    }
}
