class Main {
    public static void main(String[] args) {
        String[][] arr = new String[3][3];
        arr[0][0] = "O";
        arr[0][1] = "X";
        arr[0][2] = "X";

        arr[1][0] = "O";
        arr[1][1] = "X";
        arr[1][2] = "O";

        arr[2][0] = "X";
        arr[2][1] = "O";
        arr[2][2] = "X";


        for (String[] strings : arr) {
            for (int j = 0; j < arr.length; j++) {
                if(j == arr.length-1)
                    System.out.print(strings[j]);
                else
                    System.out.print(strings[j] + " ");
            }
            System.out.println();
        }
    }
}
