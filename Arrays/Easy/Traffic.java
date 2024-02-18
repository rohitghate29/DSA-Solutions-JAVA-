public class Traffic {
    
    public static int traffic(int n, int m, int []vehicle) {
        int count = 0;
        int result = 0;
        for (int i = 0; i < n; i++) {
            if(count == m) {
                break;
            }
            if(vehicle[i] == 0) {
                vehicle[i] = 1;
                count++; 
            }
        }

        for (int i = 0; i < n; i++) {
            if(vehicle[i] == 1) {
                result ++;
            }
        }
        return result;
    }
    
    public static void main(String[] args) {
        int n = 6;
        int m = 3;
        int Vehicle [] = {0, 1, 0, 0, 1, 0};
        System.out.println(traffic(n, m, Vehicle));
    }
}
