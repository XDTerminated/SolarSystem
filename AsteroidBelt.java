public class AsteroidBelt extends SolarSystem {
    private int numOfAsteroids;
    private String biggestAsteroidName;

    public AsteroidBelt() {

    }

    public AsteroidBelt(int numOfAsteroids, String biggestAsteroidName) {
        this.numOfAsteroids = numOfAsteroids;
        this.biggestAsteroidName = biggestAsteroidName;
    }

    // Shared Methods
    public String toString() {
        return "This is an Asteroid Belt";
    }
    // Unique Methods
    public void leaveBelt() {
        System.out.println("An asteroid has left the belt");
    }

    public void asteroidOrbit() {
        System.out.println("The asteroids orbit the star");
    }
    // Accessors
    public int getNumOfAsteroids() {
        return this.numOfAsteroids;
    }

    public String getBiggestAsteroidName() {
        return this.biggestAsteroidName;
    }
    // Mutators
    public void setNumOfAsteroids(int numOfAsteroids) {
        this.numOfAsteroids = numOfAsteroids;
    }

    public void setBiggestAsteroidName(String biggestAsteroidName) {
        this.biggestAsteroidName = biggestAsteroidName;
    }

}
