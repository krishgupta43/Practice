package Practice;

import java.util.Stack;

public class Expression {

	static boolean check(String str) {
		Stack<Character> st = new Stack<>();
		int flag = 0;
		for (int i = 0; i < str.length(); i++) {
			char x = str.charAt(i);
			if (x == '(' || x == '{' || x == '[') {
				st.push(x);
			} else if (!st.isEmpty() && x == '}' && st.peek() == '{') {
				st.pop();
			} else if (!st.isEmpty() && x == ')' && st.peek() == '(') {
				st.pop();
			} else if (!st.isEmpty() && x == ']' && st.peek() == '[') {
				st.pop();
			} else {
				flag = 1;
				break;
			}
		}
		if (st.isEmpty() && flag == 0)
			return true;
		else
			return false;
	}

	public static void main(String[] args) {
		String str = "([{}])}";

		if (check(str)) {
			System.out.println("Balanced");
		} else {
			System.out.println("Not Balanced");
		}
	}

}
