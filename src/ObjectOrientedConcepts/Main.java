package ObjectOrientedConcepts;

import ObjectOrientedConcepts.inheritance.Box;
import ObjectOrientedConcepts.species.Human;

public class Main {
    public static void main(String[] args) {
        Human alperen = new Human(22, "alperen");

        Box box = new Box(10,5,5);

        System.out.println(box.l + " " +  box.h + " " +  box.w);
    }
}
