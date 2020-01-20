import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;

public class ArraysTest {

	public static void main(String[] args) {
		List<Interval> l = new ArrayList<Interval>();
		l.add(new Interval(2, 4));
		l.add(new Interval(7, 10));
		//l.add(new Interval(15, 20));
		Collections.sort(l, (a, b) -> a.start - b.start);
		
		PriorityQueue<Interval> pq = new PriorityQueue<Interval>((a, b) -> a.end - b.end);
		for(Interval i : l) {
			if(pq.isEmpty()) {
				pq.add(i);
			}else {
				Interval t = pq.poll();
				if(i.start <= t.end) {
					
				}
			}
		}
		System.out.println(pq.size());
		
	}

}

class Interval{
	int start;
	int end;
	public Interval(int start, int end) {
		super();
		this.start = start;
		this.end = end;
	}
	
}