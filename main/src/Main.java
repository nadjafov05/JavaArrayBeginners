import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
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