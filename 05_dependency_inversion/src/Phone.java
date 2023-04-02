import java.util.Objects;
import java.util.Optional;

public class Phone implements Notifier{
    public String generateWeatherAlert(String weatherConditions) {
        return(Objects.equals(weatherConditions,"rainy")) ? "It is rainy" : null;
    }

    @Override
    public void sendNotification(String weatherConditions) {
        Optional<String> alert = Optional.ofNullable(generateWeatherAlert(weatherConditions));
        alert.ifPresent(System.out::print);
    }
}
