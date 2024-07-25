import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int netice = foo();
        System.out.println(netice);
    }
    public static int foo(){
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