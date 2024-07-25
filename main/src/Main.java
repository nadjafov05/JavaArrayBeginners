import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String ss = foo();
        System.out.println(ss);
    }

    public static String foo(){
        int[] intArr = {1,2,3,4,5,6};
        int findNumbers = 11;
        for (int i=0;i<intArr.length;i++){
            if (findNumbers == intArr[i]){
                return findNumbers + " - deyeri massivde tapildi";
            }
        }
        return findNumbers + " - deyeri massivde tapilmadi";
    }
}