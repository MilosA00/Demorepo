public class HouseRoom {

    private Dimensions roomDimension;
    private int numberOfWindows;
    private Table roomTable;
    private Chair roomChair;
    private Windows roomWindows;

    public HouseRoom (Dimensions roomDimension,int numberOfWindows , Table roomTable,Chair roomChair,Windows roomWindows){
        this.roomDimension = roomDimension;
        this.numberOfWindows = numberOfWindows;
        this.roomTable = roomTable;
        this.roomChair = roomChair;
        this.roomWindows = roomWindows;
    }


        public  void showDiemnsions(){

            roomDimension.showDimensions();
        }

    public Dimensions getRoomDimension() {
        return roomDimension;
    }
}
