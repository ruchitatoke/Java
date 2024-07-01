import java.util.*;
public class duplicate {
    public static void main(String[] args) {
        
        int arr[] = {4,2,3,5,6,1,3,4,5,6,7,8,1,2,3,41,11,45};
        String str = "RruchuchitaManishToke";
        
        str = str.toLowerCase();
        Map <Integer, Integer> hmap = new HashMap<>();
        for(int i : arr){
            System.out.println(hmap);
            System.out.println(hmap.getOrDefault(i, 0));
            hmap.put(i, hmap.getOrDefault(i, 0)+1);
        }

        Map <Character, Integer> hmap2 = new HashMap<>();
        for(char i : str.toCharArray()){
            hmap2.put(i, hmap.getOrDefault(i, 0)+1);
        }
        System.out.println(hmap);
        
        for(Map.Entry <Integer,Integer> entry : hmap.entrySet()){
            if(entry.getValue() > 1){
            System.out.println(entry.getKey());
        }
    }
    System.out.println(hmap2);
    }
    
}
