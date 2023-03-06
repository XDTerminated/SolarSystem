public class SolarSystem {

    private int numberOfPlanets;
    private int numberOfStars;
    private int age;

    private int randNum = (int) Math.floor(Math.random() * 2);

    public SolarSystem() {

    }

    public SolarSystem(int numberOfPlanets, int numberOfStars, int age) {
        this.numberOfPlanets = numberOfPlanets;
        this.numberOfStars = numberOfStars;
        this.age = age;
    }


    // Shared Methods
    public String toString() {
        return "This Solar System has " + numberOfPlanets + " planets and " + numberOfStars + " stars";
    }

    public void explode() {
        System.out.println("The Solar System exploded");
    }

    // Unique Methods
    public void move() {
        System.out.println("The Solar System moves through the solar system.");
    }

    public void containsLife() {
        if (this.randNum == 0) {
            System.out.println("Does not have life");
        } else {
            System.out.println("Does conaint life.");
        }
    }

    
    // Accessors
    public int getNumberOfPlanets() {
        return this.numberOfPlanets;
    }

    public int getNumberOfStars() {
        return this.numberOfStars;
    }

    public int getAge() {
        return "The Solar System is: " + age + " years old";
    }

    // Mutators
    public void setNumberOfPlanets(int numberOfPlanets) {
        this.numberOfPlanets = numberOfPlanets;
    }

    public void setNumberOfStars(int numberOfStars) {
        this.numberOfStars = numberOfStars;
    }


}