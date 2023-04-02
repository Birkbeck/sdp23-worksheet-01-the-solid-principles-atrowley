import java.util.Objects;
import java.util.Optional;

public class Emailer implements Notifier {
    public String generateWeatherAlert(String weatherConditions) {
        return (Objects.equals(weatherConditions, "sunny")) ? "It is sunny" : null;
    }

    @Override
    public void sendNotification(String weatherConditions) {
        Optional<String> alert = Optional.ofNullable(this.generateWeatherAlert(weatherConditions));
        alert.ifPresent(System.out::print);
    }
}
