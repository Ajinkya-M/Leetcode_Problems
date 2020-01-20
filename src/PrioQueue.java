
import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class PrioQueue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> files = new ArrayList<Integer>();
		files.add(1);
		files.add(2);
		files.add(5);
		files.add(10);
		files.add(35);
		files.add(89);
		
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
        for(Integer i : files) {
            pq.add(i);
        }
        int ret = 0;
        int f = 0, s = 0;
        if(files.size() == 1) return ;
        while(pq.size() > 1) {
            f = pq.poll();
             
            s = pq.poll();
            
            ret += (f+s);
             
            pq.add(f+s);
        }
        if(pq.size() == 1) System.out.println(ret);
        return;
		

	}

}
