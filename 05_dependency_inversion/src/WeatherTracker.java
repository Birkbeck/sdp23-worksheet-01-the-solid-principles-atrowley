import java.util.List;

public class WeatherTracker {
    String currentConditions;
    List<Notifier> notifiers;

    public WeatherTracker(List<Notifier> notifiers) {
        this.notifiers = notifiers;
    }

    public void setCurrentConditions(String weatherDescription) {
        this.currentConditions = weatherDescription;
        for(Notifier n : notifiers){
            n.sendNotification(weatherDescription);
        }
    }
}
