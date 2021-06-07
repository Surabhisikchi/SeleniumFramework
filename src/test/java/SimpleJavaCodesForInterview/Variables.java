package SimpleJavaCodesForInterview;

public class Variables {
	
	
	int instanceVar=20;
	static int staticVar=30;
	
	public void localVariable() {
		
		int localVar=10;
		
		System.out.println("Local Variable Is:"+localVar);
		
	}
	
    public static void main(String[]args) {
    	
    	Variables obj= new Variables();
    	
    	obj.localVariable();
    	
    	System.out.println("Instance Variable Is:"+obj.instanceVar);
    	
    	System.out.println("Static Variable Is:"+staticVar);
    }
}