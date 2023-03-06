import java.util.HashMap;

public class Locations {

    private final String location;
    private final int locationID;

    private HashMap<String, Integer> exits;

    public Locations(int locationID, String location) {
        this.locationID = locationID;
        this.location = location;

        this.exits = new HashMap<>();
        this.exits.put("Q",0);

    }


    public String getLocation() {
        return location;
    }

    public int getLocationID() {
        return locationID;
    }

    public HashMap<String, Integer> getExits() {

        return new HashMap<String,Integer>(exits);
    }

    public void addExits(String location, int locationID) {
        this.exits.put(location,locationID);

    }



}
