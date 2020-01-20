
public class MinJumpsToReachEnd {

	public static void main(String[] args) {
		int nums[] = {2,3,1,1,4};
		int len = nums.length;
        if(len == 0 || len == 1) 
        	System.out.println(0);
        int arr[] = new int[len];
        
        for(int j=0;j<len;j++){
            arr[j] = Integer.MAX_VALUE;
        }
        arr[0] = 0;
        for(int i=0;i<len;i++){
            for(int j=i+1;j<=i+nums[i] && j<len;j++){
                arr[j] = min(arr[j], arr[i]+1);
            }
        }
        System.out.println( arr[len-1] );
	}
	public static int min(int a, int b){
        return a<=b?a:b;
    }

}
