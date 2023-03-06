public class Dimensions {

    private int width;
    private int length;
    private int height;


    public Dimensions (int width, int length, int height){
        this.width = width;
        this.length = length;
        this.height = height;
    }

    public void showDimensions(){

        System.out.println("The width is:" + width + ".\n" + "The length is:" + length + ".\n" + "The height is:" + height);


    }


}
