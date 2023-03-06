public class Main {
    public static void main(String[] args) {

        byte x = 127;
        short y = 3_550;
        int z = 1_000_000;
        long f = 50_000 + 10*(x + y + z);

        System.out.println(f);
    }
}