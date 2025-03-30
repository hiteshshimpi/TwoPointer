package TwoPointer;


import java.util.HashMap;
import java.util.Map;

//Number of subarrays whose count of distinct number <= K
public class SubarrayDistinctProblem {
    public static void main(String[] args) {
int [] b ={1,2,3,4,5,6};
int k=2;
    int count = 0;
    int sum = 0;
    Map<Integer, Integer> g = new HashMap<>();
        for (int i = 0, j = 0; j < b.length; j++) {
        g.put(b[j], g.getOrDefault(b[j], 0) + 1);
        int d = g.size();
        while (d > k) {
            g.put(b[i], g.get(b[i]) - 1);
            if (g.get(b[i]) == 0) {
                g.remove(b[i]);
            }
            i++;
            d = g.size();
        }
        count += (j - i + 1);
    }
        System.out.println(count);
}
}

