import java.util.Arrays;
import java.util.Scanner;

public class TrainingKickstart {

	public static void main(String[] args) {
		Scanner sc  = new Scanner(System.in);
		int t = sc.nextInt();
		int cnt = 0;
		while(t != 0) {
			t--;
			int n = sc.nextInt();
			int[] arr = new int[n];
			int[] dp = new int[n];
			int p = sc.nextInt();
			int min = Integer.MAX_VALUE;
			for(int i=0;i<n;i++) {
				arr[i] = sc.nextInt();
			}
			if(n == 1 || p == 1) {
				System.out.println("Case #"+ (++cnt) +": "+0);
				continue;
			}
			Arrays.sort(arr);
			for(int i=1;i<n;i++) {
				dp[i] = (arr[i] - arr[i-1]) * i + dp[i-1];
				if(i >= p-1) {
					min = Math.min(min, dp[i] - dp[i-p+1]);
				}
			}
			System.out.println("Case #"+ (++cnt) +": "+min);
		}
	}

}
