import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Stack;

public class ValidParenthesis {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		Stack<Character> st = new Stack<Character>();
		HashMap<Character, Character> mp = new HashMap<Character, Character>();
		mp.put('}', '{');
		mp.put(')', '(');
		mp.put(']', '[');
		for(int i=0; i<s.length();i++ ) {
			Character c = s.charAt(i);
			if(c == '(' || c == '{' || c == '[') {
				st.push(c);
			}
			else {
				if(st.empty() || mp.get(c) != st.pop()) {
					System.out.println(false);
					return;
				}
			}
		}
		if(!st.empty()) System.out.println("false");
		else System.out.println("true");
		return;
	}

}
