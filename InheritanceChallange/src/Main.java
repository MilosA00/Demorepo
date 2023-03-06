public class Main {


    public static void main(String[] args) {

       SpecificCar ferrari = new SpecificCar(7,"Is Steering",true,4,"Red","Sport's car","Ferrari");

        ferrari.carIsMoving(ferrari.isMoving());

        System.out.println(ferrari.getBrand());

    }
}