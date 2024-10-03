package src.cars;

public class Car {

    // Members of the class 
    protected String make; 
    protected String owner;
    protected String colour; 

    // Constructor (has the same name as the class, no written type- just public)
    public Car() { }

    public Car(String make) {
        this.make = make;
    }

    public Car(String owner, String colour) {
        this.owner = owner;
        this.colour = colour;
    }

    // Getters and setters
    // Make property 
    public void setMake(String m) { this.make = m; }
    public String getMake() { return this.make; }

    // Owner property
    public void setOwner(String o) { this.owner = o; }
    public String getOwner() { return this.owner; }

    // Colour property 
    public void setColour(String c) { this.colour = c; }
    public String getColour() { return this.colour; }


    // Methods - behaviours
    public void info() {
        System.out.printf("Make: %s, Owner: %s\n", this.make, this.owner);

    }


}
