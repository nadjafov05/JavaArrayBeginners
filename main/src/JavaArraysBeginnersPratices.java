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
}
