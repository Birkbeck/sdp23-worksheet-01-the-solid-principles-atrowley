import java.util.Objects;

public class StandardGreeting implements Greeting {
    @Override
    public String sayGreeting(String formality) {
        if (Objects.equals(formality, "formal")) {
            return "Good evening";
        } else if (Objects.equals(formality, "casual")) {
            return "Goodday?";
        } else if (Objects.equals(formality, "intimate")) {
            return "Hello darling!";
        } else {
            return "Hello.";
        }
    }
}
