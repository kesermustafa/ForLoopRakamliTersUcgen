package day08ForLoops;

public class ForLoopRakamliTersUcgen {
    public static void main(String[] args) {
        //        1 2 3 4 5 6
        //         2 3 4 5 6
        //          3 4 5 6
        //           4 5 6
        //            5 6
        //             6


        for(int i =1; i<=6; i++){

            for(int k = 1; k<i; k++){
                System.out.print(" " );
            }
            for(int m = i; m<=6; m++){
                System.out.print(m + " ");
            }
            System.out.println();
        }



    }
}
