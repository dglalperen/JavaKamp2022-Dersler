package ObjectOrientedConcepts.species;

public class Human extends Species{
    private String name;

    public Human(int age, String name) {
        super(age);
        this.name = name;
    }

    public Human(String name) {
        this.name = name;
    }
}
