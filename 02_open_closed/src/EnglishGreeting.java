public class EnglishGreeting implements GreetingTemplate{

    @Override
    public String sayGreeting(String formality) {
        if (formality == "formal") {
            return "Good evening";
        } else if (formality == "casual") {
            return "Goodday?";
        } else if (formality == "intimate") {
            return "Hello darling!";
        } else {
            return "Hello.";
        }
    }
}
