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

    @Override
    public String toString() {
        return "Age: " + age + " Mass: " + mass + " Number Of Moons: " + numOfMoons + " Distance From Star: " + distanceFromStar;
    }

    



    // Accessors
    @Override
    public int getAge() {
        return this.age;
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

}
