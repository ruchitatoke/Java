import java.util.*;
public class count_maxfre {
    public static void main(String[] args) {
        int nums[]={1,2,3,2,4,4};
        System.out.println(max_fun(nums));

       
    }
    public static int max_fun(int nums[]){
        Map<Integer, Integer> hmap = new HashMap<>();
        for(int a : nums){
            hmap.put(a,hmap.getOrDefault(a,0)+1);
        }

        int max=0;
        for(int b : hmap.values()){
            max=Math.max(max, b);
        }

        int max_freq=0;
        for(int f : hmap.values()){
            if(f==max){
                max_freq++;
            }
        }
        return max_freq * max;
    }
}
