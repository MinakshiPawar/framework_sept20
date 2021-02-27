package tcs;

import java.util.HashMap;
import java.util.Set;

public class sample {

	public static void main(String[] args) {
		

			String str = "Sun rises in the east. Sun provides light to us. Sun is the source of Vitamin D";

			String ar[] = str.split(" "); 
		HashMap<String, Integer> map = new HashMap<String, Integer>();

			for (int i = 0; i <= ar.length - 1; i++) {
				String s1 = ar[i];
				if (map.containsKey(s1)) {
					map.put(s1, map.get(s1) + 1);
				} else {
					map.put(s1, 1);
				}

			}

			Set<String> str2 = map.keySet(); 
			for (String st : str2) {

	                    if(map.get(st)>1)
	                 {
				System.out.println(st + ": " + map.get(st));
			}}

		}
	}
