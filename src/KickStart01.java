import java.util.HashMap;
import java.util.Map.Entry;
import java.util.PriorityQueue;
import java.util.Scanner;

public class KickStart01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		HashMap<Character, Integer> mp = new HashMap<Character, Integer>();
		for(char c : s.toCharArray()) {
			if(mp.containsKey(c)) {
				mp.put(c, mp.get(c)+1);
			}
			else {
				mp.put(c, 1);
			}
		}
		
		PriorityQueue<Entry<Character, Integer>> pq = new PriorityQueue<>((a,b) -> b.getValue() - a.getValue());
		String ret = "";
		for(Entry<Character, Integer> e : mp.entrySet()) {
			pq.add(e);
		}
		while(!pq.isEmpty()) {
			for(int i=0;i<pq.peek().getValue();i++) {
				ret += pq.peek().getKey();
			}
			pq.poll();
		}
		System.out.println(ret);
	}

}
