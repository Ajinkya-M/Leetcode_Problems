import java.util.Scanner;

public class Mural {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		int c = 0;
		while(t!=0) {
			t--;
			int n = sc.nextInt();
			int arr[] = new int[n];
			for(int i=0;i<n;i++) {
				arr[i] = sc.nextInt();
			}
			int wl = (int)Math.ceil((float) n / 2);
			int sum = 0;
			int cnt = 0;
			int max = Integer.MIN_VALUE;
			for(int i=0;i<n;i++) {
				cnt++;
				sum += arr[i];
				if(cnt > wl) {
					sum -= arr[cnt-wl-1];
				}
				max = Math.max(sum, max);
			}
			System.out.println("Case #" + (++c) + ": " + max);
		}
	}

}
