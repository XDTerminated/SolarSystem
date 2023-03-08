public class Planet extends SolarSystem {
    private int age;
    private int mass;
    private int numOfMoons;
    private int distanceFromStar;

    public Planet() {

    }

    public Planet(int age, int mass, int numOfMoons, int distanceFromStar) {
        this.age = age;
        this.mass = mass;
        this.numOfMoons = numOfMoons;
        this.distanceFromStar = distanceFromStar;
    }

    // Shared Methods
    @Override
    public String toString() {
        return "Age: " + age + " Mass: " + mass + " Number Of Moons: " + numOfMoons + " Distance From Star: " + distanceFromStar;
    }

    // Unique Methods
    public void doesContainLife() {
        System.out.println("Planet does contain life");
    }

    public void doesNotContainLife() {
        System.out.println("Planet does not contain life");
    }

    
    // Accessors
    @Override
    public String getAge() {
        return "The planet is " + this.age + " years old";
    }

    public int getMass() {
        return this.mass;
    }

    public int numOfMoons() {
        return this.numOfMoons();
    }

    public int distanceFromStar() {
        return this.distanceFromStar;
    }

    // Mutators
    public void setDistanceFromStar(int distanceFromStar) {
        this.distanceFromStar = distanceFromStar;
    }

    public void setNumOfMoons(int numOfMoons) {
        this.numOfMoons = numOfMoons;
    }

}
