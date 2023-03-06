public class Vihicle {

    private int numberOfGears;
    private String steering;
    private boolean isMoving;

    public Vihicle(int numberOfGears, String steering, boolean isMoving) {
        this.numberOfGears = numberOfGears;
        this.steering = steering;
        this.isMoving = isMoving;
    }

    public int getNumberOfGears() {
        return numberOfGears;
    }

    public String getSteering() {
        return steering;
    }

    public void setNumberOfGears(int numberOfGears) {
        this.numberOfGears = numberOfGears;
    }

    public void setSteering(String steering) {
        this.steering = steering;
    }

    public void setMoving(boolean moving) {
        isMoving = moving;
    }

    public boolean isMoving() {
        return isMoving;
    }

    public void carIsMoving(boolean isMoving){
        if(isMoving)
            System.out.println("Car is moving.");
        else
            System.out.println("Car is parked.");

    }
}
