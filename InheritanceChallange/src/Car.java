public class Car extends Vihicle{

    private int numberOfWheels;
    private String bodyColor;
    private String typeOfCar;

    public Car (int numberOfGears , String steering, boolean isMoving , int numberOfWheels , String bodyColor , String typeOfCar) {
        super(numberOfGears, steering , isMoving );
        this.numberOfWheels = numberOfWheels;
        this. bodyColor = bodyColor;
        this.typeOfCar = typeOfCar;
    }

    public int getNumberOfWheels() {
        return numberOfWheels;
    }

    public String getBodyColor() {
        return bodyColor;
    }

    public String getTypeOfCar() {
        return typeOfCar;
    }

    public void setNumberOfWheels(int numberOfWheels) {
        this.numberOfWheels = numberOfWheels;
    }

    public void setBodyColor(String bodyColor){
        this.bodyColor = bodyColor;
    }
    public void  setTypeOfCar(String typeOfCar){
        this.typeOfCar = typeOfCar;
    }


}
