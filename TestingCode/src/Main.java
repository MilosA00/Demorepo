import java.util.*;

public class Main {

    private static Map<String , Planets> solarSystem = new HashMap<>();
    private static Set<Planets> planets = new HashSet<>();

    public static void main(String[] args) {

        System.out.println("Test Test");


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