public class Main {
    public static void main(String[] args) {

        int player1Score = 1500;
        int player2Score = 900;
        int player3Score = 400;
        int player4Score = 50;

        int player1 = calculateHighScorePosition(player1Score);
        int player2 = calculateHighScorePosition(player2Score);
        int player3 = calculateHighScorePosition(player3Score);
        int player4 = calculateHighScorePosition(player4Score);

        displayHighScorePosition(player1, player2, player3, player4);

    }

    public static int calculateHighScorePosition (int score){

        if (score > 1000)
            return 1;
        else if(score > 500 && score < 1000)
            return 2;
        else if (score > 100 && score < 500)
            return 3;
        else
            return 4;

    }

    public  static void displayHighScorePosition(int x1 ,int x2 , int x3, int x4 ){

        System.out.println("Score position:" + x1);
        System.out.println("Score position:" + x2);
        System.out.println("Score position:" + x3);
        System.out.println("Score position:" + x4);
    }
