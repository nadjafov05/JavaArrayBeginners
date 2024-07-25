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
    public static void pratices4(){
        int[] arrInt = {1,2,3,4,5};

        int cem = 0;
        for (int i=0;i<arrInt.length;i++){
            cem+=arrInt[i];
        }
        double ortaHesabiTapmaq = cem / arrInt.length;
        System.out.println(ortaHesabiTapmaq);
    }
    public static String pratices5(){
        int[] intArr = {1,2,3,4,5,6};
        int findNumbers = 11;
        for (int i=0;i<intArr.length;i++){
            if (findNumbers == intArr[i]){
                return findNumbers + " - deyeri massivde tapildi";
            }
        }
        return findNumbers + " - deyeri massivde tapilmadi";
    }
    public static int pratices(){
        int[] arrInt = {25,14,56,15,36};
        int findIndex = 56;
        for (int i=0;i<arrInt.length;i++){
            if (arrInt[i] == findIndex){
                return i;
            }
        }
        return -1;
    }
}
