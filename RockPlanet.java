public class RockPlanet extends Planet {
    int mass;
    int radius;

    public RockPlanet() {

    }

    public RockPlanet(int mass, int radius) {
        this.mass = mass;
        this.radius = radius;
    }

    // Shared Methods
    public String toString() {
        return "This is a rock planet";
    }

    // Unique
    public void composition() {
        System.out.println("Made of rocks and metals.");
    }

    public void compareSizeToGasPlanets() {
        System.out.println("Smaller than gas planets");
    }

    // Accessors
    public int mass() {
        return this.mass;
    }

    public int radius() {
        return this.radius;
    }

    // Mutators
    public void setMass(int mass) {
        this.mass = mass;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }
}
