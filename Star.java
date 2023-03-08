public class Star extends SolarSystem {
    private int diameter;
    private int lifeSpan;

    public Star() {

    }

    public Star(int diameter, int lifeSpan) {
        this.diameter = diameter;
        this.lifeSpan = lifeSpan;
    }


    // Shared Methods
    public String toString() {
        return "This is a star";
    }

    // Unique Methods
    public void solarFlare() {
        System.out.println("Solar Flare");
    }

    public void shine() {
        System.out.println("shine");
    }

    // Accessors
    public int getDiameter() {
        return this.diameter;
    }

    public int getlifeSpan() {
        return this.lifeSpan;
    }


    // Mutators
    public void setDiameter(int diameter) {
        this.diameter = diameter;
    }

    public void setLifeSpan(int lifeSpan) {
        this.lifeSpan = lifeSpan;
    }
}
