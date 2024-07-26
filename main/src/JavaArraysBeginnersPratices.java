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
    public static int pratices6(){
        int[] arrInt = {25,14,56,15,36};
        int findIndex = 56;
        for (int i=0;i<arrInt.length;i++){
            if (arrInt[i] == findIndex){
                return i;
            }
        }
        return -1;
    }
    public static void pratices7(){
        int[] arrA = {1,2,3,5,6,9,8,7,4};
        System.out.println("A arrayindaki orginal melumatlar : "+Arrays.toString(arrA));
        int[] arrB = new int[9];

        for (int i=0;i<arrA.length;i++){
            arrB[i] = arrA[i];
        }

        System.out.println("B arrayinda`ki komyalanmis melumatlar : "+Arrays.toString(arrB));
    }

    public static void pratices8(){
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
