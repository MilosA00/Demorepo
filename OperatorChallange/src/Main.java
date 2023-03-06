public class Main {
    public static void main(String[] args) {

        double x = 20;
        double y = 80;
        double z = (x + y)*100;

         double remainder = z % 40;

        boolean isRemainder = remainder == 0 ? true : false;

        if (isRemainder)
            System.out.println("All good");
        else
            System.out.println("Got some remainder.");

    }
}