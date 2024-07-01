import java.util.*;

public class duplicate_string {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

		String str = sc.next();
		count(str);
	}


	public static void count(String str){
		Map<Character, Integer> map = new HashMap<Character, Integer>();

		char[] charArray = str.toCharArray();

		for (char c : charArray) {

			if (map.containsKey(c)) {
				map.put(c, map.get(c) + 1);
			}
			else {
				map.put(c, 1);
			}
		}
		for (Map.Entry<Character, Integer> entry : map.entrySet()) {

			if (entry.getValue() > 1) {
				System.out.println(entry.getKey() + " : "	+ entry.getValue());
			}
		}
	}
	
}


