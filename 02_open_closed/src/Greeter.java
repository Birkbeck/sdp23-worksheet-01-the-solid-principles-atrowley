public class Greeter {
    String formality;
    Greeting greeting;

    public Greeter() {
        this(new StandardGreeting());
    }

    public Greeter(Greeting greeting){
        this.greeting = greeting;
    }

    public String greet() {
       return greeting.sayGreeting(formality);
    }

    public void setFormality(String formality) {
        this.formality = formality;
    }
}

