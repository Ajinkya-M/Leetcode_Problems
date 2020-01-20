import java.util.Scanner;
import java.util.Stack;

public class ValidStringabc1003 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		if(s.length() < 3) return; //false;
		StringBuilder str = new StringBuilder(s);
		
		for(int i=2;i<str.length();) {
			if(str.charAt(i) == 'c') {
				if(i >=2 && str.charAt(i-1) == 'b' && str.charAt(i-2) == 'a') {
					str.deleteCharAt(i-2);
					str.deleteCharAt(i-2);
					str.deleteCharAt(i-2);
					i -= 2;
				}else {
					System.out.println(false);
					return;
				}
			}else {
				i++;
			}
		}
		if(str.length() == 0) {
			System.out.println(true);
			return;
		}
		System.out.println(false);
		return;
	}

}
