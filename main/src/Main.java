import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arrA = {1,2,3,5,6,9,8,7,4};
        System.out.println("A arrayindaki orginal melumatlar : "+Arrays.toString(arrA));
        int[] arrB = new int[9];

        for (int i=0;i<arrA.length;i++){
            arrB[i] = arrA[i];
        }

        System.out.println("B arrayinda`ki komyalanmis melumatlar : "+Arrays.toString(arrB));
    }
}