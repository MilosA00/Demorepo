package shmaz;

public class Sorter {



    public static void numberSorter0to1(int number []){

        for(int i = 0; i< number.length ; i++){

            for(int j = i + 1; j < number.length;j++){

                if(number[i] > number[j]){
                    int temp = 0;
                    temp= number[i];
                    number[i] = number[j];
                    number[j] = temp;
                }
            }

        }
        for(int x : number)
            System.out.println(x);
    }
    public static void numberSorter1to0(int number[]){
        for(int i = 0; i< number.length ; i++){

            for(int j = i + 1; j < number.length;j++){

                if(number[i] < number[j]){
                    int temp = 0;
                    temp= number[i];
                    number[i] = number[j];
                    number[j] = temp;
                }
            }

        }
        for(int x : number)
            System.out.println(x);
    }

}
