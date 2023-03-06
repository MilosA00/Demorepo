import java.util.*;

public class Main {

    private static Map<String , Planets> solarSystem = new HashMap<>();
    private static Set<Planets> planets = new HashSet<>();

    public static void main(String[] args) {

//        Planets tempMoon = new Planets("Moon", 27);
//        Planets temp = new Planets("Earth",88);
//        solarSystem.put(temp.getName(), temp);
//        planets.add(temp);
//        temp.addMoon(tempMoon);
//
//        Planets body = solarSystem.get("Earth");
//
//
//        for (Planets planets: body.getSatellites())
//            System.out.println(planets.getName());

        Scanner scanner = new Scanner(System.in);

        System.out.println("Hello! My name is Vega.");
        System.out.println("I was created in 2030.");
        System.out.println("Please, remind me your name.");

       String name = scanner.next();
        System.out.println(name);

        /* a strange /* // /* single-line comment */
        /*/*
            yet another comment
        */
        System.out.println(((12241 % 100) / 10) % 10);
        scanner.nextInt();

        System.out.println("What a great name you have, {yourName}!");


//        System.out.print("**");
//        System.out.println();
//        System.out.println("**");
//        System.out.print("**");
//        System.out.println("OXX");
//        System.out.println("OXO");
//        System.out.println("XOX");


    }
    public static int binarySearch(ArrayList<Integer> list, int numberToFind){

        int lowPoint = 0;
        int highPoint = list.size() - 1 ;


        while(lowPoint <= highPoint){
            System.out.print(".");
            int middleValue = (lowPoint + highPoint) / 2;
            int middleNumber = list.get(middleValue);

            if(middleNumber == numberToFind)
                return middleValue;

            if (middleNumber > numberToFind){
                highPoint = middleValue - 1;
            }
            else
                lowPoint = middleValue + 1;

        }





        return -1;
    }

    public static ArrayList<Integer> arrSorter(ArrayList<Integer> arrList){

        for(int i = 0; i < arrList.size(); ++i) {

            for(int j = i + 1; j < arrList.size(); j++) {
                if (arrList.get(i) > arrList.get(j)) {
                    int temp;
                    temp = arrList.get(i);
                    arrList.set(i , arrList.get(j));
                    arrList.set(j, temp);
                }
            }
        }
        return arrList;
    }

}