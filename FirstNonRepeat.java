package Practice;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class FirstNonRepeat {
	
	public static void main(String[] args) {
		String str="hellojavadeveloper";
		System.out.println(check(str));
	}
    private static char check(String str) {
		Map<Character,Integer>mp=new HashMap<Character, Integer>();
		for(char c:str.toCharArray()) {
			mp.put(c, mp.containsKey(c)? mp.get(c)+1:1);
		}
		for(Entry<Character, Integer>entry:mp.entrySet()) {
			if(entry.getValue()==1) {
				return entry.getKey();
			}
		}
		return 0;
	}

}
