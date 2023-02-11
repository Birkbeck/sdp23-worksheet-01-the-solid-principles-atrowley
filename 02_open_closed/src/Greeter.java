public class Greeter {
    String formality;
    GreetingTemplate g;

    public Greeter(GreetingTemplate g) {
        this.g = g;
    }

    @Deprecated
    public Greeter() {
        this(new EnglishGreeting());
    }


    public String greet() {
        return g.sayGreeting(formality);
    }

    public void setFormality(String formality) {
        this.formality = formality;
    }
}
