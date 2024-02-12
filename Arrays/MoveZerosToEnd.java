import java.util.Scanner;

public class MoveZerosToEnd {
    
    public static int[] moveZeros(int n, int []a) {
        
    }

    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        int n = 5;
        int arr [] = {1,2,0,0,3};
        // for (int i = 0; i < n; i++) {
        //     arr[i] = sc.nextInt();
        // }
        int moved [] = moveZeros(n, arr);
        for (int i = 0; i < moved.length; i++) {
            System.out.print(moved[i]+" ");
        }
    }
}
