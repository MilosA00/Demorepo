public class Main {

    public static void main(String[] args) {

        Dimensions roomDimension = new Dimensions(400,400,500);
        Dimensions windowDimension = new Dimensions(100,10,150);
        Dimensions tableDimensions = new Dimensions(80,120,5);
        Dimensions chairDimension = new Dimensions(30,45,2);

        Windows roomWindows = new Windows(windowDimension ,"Glass windows","Brown");
        Chair roomChair = new Chair(chairDimension,4,"black");
        Table roomTable = new Table(tableDimensions,4,"Brown");

        HouseRoom myRoom = new HouseRoom(roomDimension,4,roomTable,roomChair,roomWindows);

        myRoom.getRoomDimension().showDimensions();
    }
}