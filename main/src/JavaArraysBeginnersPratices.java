import java.util.Arrays;

public class JavaArraysBeginnersPratices {
    public static void pratices1(){
        int[] numberArr = {10,5,7,6,2,4,3,8,9,1};
        System.out.println("reqemlerin evvelki hali: " + Arrays.toString(numberArr));
        Arrays.sort(numberArr);
        System.out.println("reqemlerin sonraki hali: " + Arrays.toString(numberArr));
    }
    public static void pratices2(){
        int[] numberArr = {1,2,3,5};
        int cem = 0; //1 + 2 + 3 + 5

        for (int i=0;i<numberArr.length;i++){
            cem+=numberArr[i];
        }
        System.out.println(cem);
    }
    public static void pratices3(){
        int[][] arrInt = new int[5][5];

        for (int i=0;i<arrInt[0].length;i++){
            for (int j=0;j<arrInt[4].length;j++){
                System.out.print("=");
                if (j<arrInt[i].length - 1){
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
    }
}
