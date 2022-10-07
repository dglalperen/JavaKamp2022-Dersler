package ObjectOrientedConcepts.inheritance;

public class Box {
    public double l;
    public double h;
    public double w;

    public Box(){
        this.l = -1;
        this.h = -1;
        this.w = -1;
    }

    public Box(double l, double h, double w) {
        this.l = l;
        this.h = h;
        this.w = w;
    }

    public Box(Box old){
        this.l = old.l;
        this.h = old.h;
        this.w = old.w;
    }

    public void getInformation(){
        System.out.println("Running the box");
    }
}
