import java.util.Scanner;

public class ArraysLists {

	public static void main(String[] args) {
		// Arraylist example:
		int n = 5;
		int d = 4;
		int[] arr = new int[n];
		int tmp[] = new int[n+2];
		tmp[0] = 0;
		tmp[tmp.length-1] = 0;
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		
		while(d > 0) {
			d--;
			for(int i=0;i<n;i++) {
				tmp[i+1] = arr[i];
			}
			
			for(int i=1;i<n+1;i++) {
				if(tmp[i-1] != tmp[i+1]) {
					arr[i-1] = 0;
				}else {
					arr[i-1] = 1;
				}
			}
		}
		
		for(int i : arr) {
			System.out.println(i);
		}
	}

}
