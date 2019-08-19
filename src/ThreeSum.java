import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class ThreeSum {

	public static void main(String[] args) {
		int arr[] = {-1, 0, 1, 2, -1, -4};
		int sum = 0;
		ArrayList<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>();
		HashSet<ArrayList<Integer>> hs = new HashSet<ArrayList<Integer>>();
		int len = arr.length;
		Arrays.sort(arr);
		int f=0,l=0,r=0;
		for(int i=0;i<len-2;i++) {
			f = arr[i];
			l = i+1;
			r = len -1;
			while(l<r) {
				if(f+arr[l]+arr[r] == sum) {
					ArrayList<Integer> al = new ArrayList<Integer>();
					al.add(f);
					al.add(arr[l]);
					al.add(arr[r]);
					if(!hs.contains(al)) {
						list.add(al);
						hs.add(al);
					}
					l++;
					r--;
				}
				else if(f+arr[l]+arr[r] < sum) {
					l++;
				}else {
					r--;
				}
			}
		}
		System.out.println(list);
	}

}
