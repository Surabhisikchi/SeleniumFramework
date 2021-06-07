


package SimpleJavaCodesForInterview;



public class ReverseTheString {

	public static void main(String[] args) {
		
		StaticAndNonStatic obj = new StaticAndNonStatic();
		
		obj.StaticMethod();

		String name = "ABC";
		
		char[] ch = name.toCharArray();
		
		for(int i=name.length()-1 ; i>=0 ; i--) {
			
			System.out.print(ch[i]);
			
		}
		
		


	}

}


