
public class DupilcateInSoretdList {

	public static void main(String[] args) {
		int nums[] = {1,1,2};
		int ret = 0;
        int len = nums.length;
        
        int prev = nums[0];
        int i=1;
        while(i<len){
            if(nums[i] != prev){
                nums[ret] = prev;
                prev = nums[i];
                ret++;
            }
            i++;
        }
        nums[ret] = prev;
        ret++;
        for(int j:nums) {
        	System.out.print(j);
        }
	}

}
