package SimpleJavaCodesForInterview;

public class DataTypeConversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double d = 45.5d;

		int i = (int) d;

		System.out.println(i);

		String s = "233";

		int j = Integer.parseInt(s);
		System.out.println(j);

		// OR

		int k = Integer.valueOf(s);

		System.out.println(k);
		
		// AND 
		
		int in=45;
		
		String s2 = Integer.toString(in);
		System.out.println(s2);
		
		// OR 
		
		String s3 = String.valueOf(in);
		System.out.println(s3);
		

	}

}
