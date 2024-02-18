import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class SingleNumber {
    
    public int singleNumber(int[] nums) {
        int result = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i : nums) {
            map.put(i, map.getOrDefault(i, 0)+1);
        }
        for(int j : map.keySet()) {
            if(map.get(j) == 1) {
                result = j;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int nums [] = {1, 1, 2, 2, 3};
        SingleNumber s1 = new SingleNumber();
        System.out.println(s1.singleNumber(nums));
    }
}
