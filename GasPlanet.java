public class GasPlanet extends Planet {
    String name;
    boolean isHabitable;
    int population;

    public GasPlanet() {

    }

    public GasPlanet(String name, int population, boolean isHabitable) {
        this.name = name;
        this.population = population;
        this.isHabitable = isHabitable;
    }

    // Shared
    public String toString() {
        return "This is planet " + this.name;
    }

    // Unique
    public void planetOrbit() {
        System.out.println("The planet orbits the star");
    }

    public void rotate() {
        System.out.println("The planet rotates about its axis");
    }

    // Accessors
    public String getName() {
        return this.name;
    }

    public boolean getIsHabitable() {
        return this.isHabitable;
    }

    public int getPopulation() {
        return this.population;
    }
    // Mutators

    public void setName(String name) {
        this.name = name;
    }

    public void setIsHabitable(boolean isHabitable) {
        this.isHabitable = isHabitable;
    }

    public void setPopulation(int population) {
        this.population = population;
    }
    
}
