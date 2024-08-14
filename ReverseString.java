package Practice;

public class ReverseString {
	public static boolean isAlpha(char x) {
		return (x>='a' && x<='z')||(x>='A' && x<='Z');
	}
	private static void Reverse(char[] str) {
		 int l=0,r=str.length-1;
			
		 while(l<r) {
				if(!isAlpha(str[l])) {
					l++;
					
				}
				else if(!isAlpha(str[r])) {
					r--;
					
				}
				else {
					char temp=str[l];
					str[l]=str[r];
					str[r]=temp;
					l++;
					r--;
				}
					
			}
		
	}
	
	public static void main(String[] args) {
	       String str="A&x#";
	       System.out.println("String: "+str);
	       char[] charArray=str.toCharArray();
	       Reverse(charArray);
	       String str_1=new String(charArray);
	       System.out.println("OutPut String :"+str_1);
		}

	

}
