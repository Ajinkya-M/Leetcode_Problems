import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CircularArray {

	public static void main(String[] args) {
		Map<String, List<String>> mp = new HashMap<String, List<String>>();
		String[] strs = {
				"eat","tea","tan","ate","nat","bat"
		};
		for(String a : strs) {
            char[] ch = a.toCharArray();
            Arrays.sort(ch);
            String key = new String(ch);
            if(mp.containsKey(key)) {
            	List<String> l = mp.get(key);
            	l.add(a);
                mp.put(key, l);
            }else {
                List<String> l = new ArrayList<>();
                l.add(a);
                mp.put(key, l);
            }
        }
        List<List<String>> ret = new ArrayList<>();
        for(Map.Entry<String, List<String>> e : mp.entrySet()) {
            ret.add(e.getValue());
        }
        System.out.println(ret);
        String s = "anik";
        if(s.substring(3) == "k") {
        	System.out.println(true);
        }else {
        	System.out.println(false);
        }
        System.out.println(s.substring(s.length()).length());
	}

}
