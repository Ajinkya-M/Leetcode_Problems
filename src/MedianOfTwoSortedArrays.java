
public class MedianOfTwoSortedArrays {

	public static void main(String[] args) {
		int num1[] = {1,3};
		int num2[] = {2,4};
		int i=0, j=0;
		int cand = -1;
		Boolean even =  false;
		int mid = (num1.length + num2.length);
		if ( mid % 2 == 0) {
			even = true;
		};
		mid = (int) Math.ceil((float)mid / 2);
		int cnt = 0;
		int flag = Integer.MIN_VALUE;
		while(i<num1.length && j<num2.length) {
			cnt++;
			if(num1[i] < num2[j]) {
				cand = num1[i++];
			}else {
				cand = num2[j++];
			}
			if(flag != Integer.MIN_VALUE) {
				System.out.println((((float)cand+flag)/2));
				return;
			}
			if(cnt == mid && !even) {
				System.out.println(cand);
				return;
			}
			if(cnt == mid && even) {
				flag = cand;
			}
		}
		while(i<num1.length) {
			cnt++;
			cand = num1[i++];
			if(flag != Integer.MIN_VALUE) {
				System.out.println((((float)cand+flag)/2));
				return;
			}
			if(cnt == mid && !even) {
				System.out.println(cand);
				return;
			}
			if(cnt == mid && even) {
				flag = cand;
			}
			
		}
		while(j<num2.length) {
			cnt++;
			cand = num2[j++];
			if(flag != Integer.MIN_VALUE) {
				System.out.println((((float)cand+flag)/2));
				return;
			}
			if(cnt == mid && !even) {
				System.out.println(cand);
				return;
			}
			if(cnt == mid && even) {
				flag = cand;
			}
			
		}
		
	}

}
