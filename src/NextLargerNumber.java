import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class NextLargerNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder n = new StringBuilder(sc.next());
		int len = n.length();
		int i;
		for(i=len-2;i>=0;i--) {
			if(n.charAt(i) < n.charAt(i+1)) {
				break;
			}
		}
		int d1 = i;
		int d2 = i+1;
		for(int j=i+1;j<len;j++) {
			if(n.charAt(d1) > n.charAt(j) && n.charAt(j) < n.charAt(d2)) {
				d2 = j;
			}
		}
		int t = n.charAt(d2);
		n.setCharAt(d2, n.charAt(d1));
		n.setCharAt(d1, (char)t);
		StringBuilder r = new StringBuilder();
		for(int j=0;j<=d1;j++) {
			r.append(n.charAt(j));
		}
		char[] arr = n.substring(d1+1).toCharArray();
		Arrays.sort(arr);
		r.append(arr.toString());
		System.out.println(r);
	}

}
