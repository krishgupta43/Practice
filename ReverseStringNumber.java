package Practice;

public class ReverseStringNumber {
	public static void main(String[] args) {
		String str="12 4";
		String res= check(str);
		System.out.println(res);
	}

	private static String check(String str) {
//		StringBuffer sb=new  StringBuffer();
//		for(int i=str.length()-1;i>=0;i--) {
//			if(str.charAt(i)!=' ') {
//				sb.append(str.charAt(i));
//			}
//		}
//		return sb.toString();
		
		String res="";
		for(int i=str.length()-1;i>=0;i--) {
			if(str.charAt(i)!=' ') {
				res+=str.charAt(i);
			}
		}
		return res.toString();
	}

}
