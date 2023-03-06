import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    private static final HashMap<Integer,Locations>locations = new HashMap<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        locations.put(0,new Locations(0,"You are sitting in front of a computer learning Java"));
        locations.put(1,new Locations(1,"You are standing at the end of a road before a small brick building"));
        locations.put(2,new Locations(2,"You are at the top of a hill"));
        locations.put(3,new Locations(3,"You are inside a building, a well house for a small spring"));
        locations.put(4,new Locations(4,"You are in a valley beside a stream"));
        locations.put(5,new Locations(5,"You are in the forest"));



        locations.get(1).addExits("W" ,2);
        locations.get(1).addExits("E" ,3);
        locations.get(1).addExits("S" , 4);
        locations.get(1).addExits("N" , 5);

        locations.get(2).addExits("N",5);

        locations.get(3).addExits("W",1);

        locations.get(4).addExits("N",1);
        locations.get(4).addExits("W",2);

        locations.get(5).addExits("S",1);
        locations.get(5).addExits("W",2);

        int loc = 1;

        Map<String,String> vocabulary;vocabulary = new HashMap<>();

        vocabulary.put("EAST","E");
        vocabulary.put("WEST","W");
        vocabulary.put("NORTH","N");
        vocabulary.put("SOUTH","S");
        vocabulary.put("QUIT","Q");

        while(true){
            System.out.println(locations.get(loc).getLocation());

            if (loc == 0)
                break;

            HashMap<String, Integer> exits = locations.get(loc).getExits();

            System.out.println("Available exits are ");
            for(String exit : exits.keySet())
                System.out.print(exit + ", ");
            System.out.println();

            String directions = scanner.nextLine().toUpperCase();

            if(directions.length()>1){
                String[] word = directions.split(" ");
                for(String x:word){
                    if(vocabulary.containsKey(x)) {
                        directions = vocabulary.get(x);
                        break;
                    }
                }

            }

            if(exits.containsKey(directions))
                loc = exits.get(directions);
            else
                System.out.println("You cannot go in that direction");

        }

    }

}