public class SpecificCar extends Car{

    private String brand;

    public SpecificCar(int numberOfGears, String steering, boolean isMoving, int numberOfWheels, String bodyColor, String typeOfCar, String brand) {
        super(numberOfGears, steering, isMoving, numberOfWheels, bodyColor, typeOfCar);
        this.brand = brand;
    }

    public String getBrand(){
        return brand;
    }

    public void setBrand(String brand){
        this.brand = brand;
    }

}
