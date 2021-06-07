package SimpleJavaCodesForInterview;

public class ConversionStringToIntOrIntToString {
	
	
	public static void StringToInt() {
		
		String s1="1234";
		
		int i = Integer.parseInt(s1);
		
		int j = Integer.valueOf(s1);
		
		System.out.println(i);
		System.out.println(j);
		
		
	}
	
	public static void IntToString() {
		
		int k = 100;
		
		String s2 = Integer.toString(k);
		
		String s3 = String.valueOf(k);
		
		System.out.println(s2);
		System.out.println(s3);
		
	}

	public static void main(String[] args) {
	
		StringToInt();
		IntToString();
		
		
	}

}
