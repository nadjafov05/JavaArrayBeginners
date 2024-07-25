import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] numberArr = {1,2,3,5};
        int cem = 0; //1 + 2 + 3 + 5

        for (int i=0;i<numberArr.length;i++){
            cem+=numberArr[i];
        }
        System.out.println(cem);

    }
}