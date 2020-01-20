import java.util.PriorityQueue;
import java.util.Scanner;

public class MaxKElements {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t != 0) {
		    t--;
		    PriorityQueue<Integer> pq = 
                          new PriorityQueue<Integer>();
		    int n, k, val = -1;
		    n = sc.nextInt();
		    k = sc.nextInt();
		    
		    for(int i=0;i<n;i++){
		        val = sc.nextInt();
		    
			    if(pq.size() < k) {
			        pq.add(val);
			    }else {
			        if(pq.peek() < val){
			            pq.poll();
			            pq.add(val);
			        }
			    }
		    }
		    while(!pq.isEmpty()) {
		        System.out.print(pq.poll() + " ");
		    }
		    
		}

	}

}
