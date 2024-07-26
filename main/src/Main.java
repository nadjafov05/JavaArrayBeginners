import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arrInt = {-1,5,11,9};
        int max = arrInt[0];
        int min = arrInt[0];

        for (int i = 1;i<arrInt.length;i++){
            if (arrInt[i] > max){
                max = arrInt[i];
            }
            if (arrInt[i] < min ){
                min = arrInt[i];
            }
        }
        System.out.println("max deyer :" + max);
        System.out.println("min deyer :" + min);
    }
}