package SimpleJavaCodesForInterview;

 class StaticAndNonStatic {
	 
	 
	  static int InstanceVar=10;

	 private void nonStaticMethod() {
		 
		 
		 

		System.out.println("This is NON STATIC METHOD");
	}

	public static void StaticMethod() {
		
	

		System.out.println("This is STATIC METHOD");

	}

	public static void main(String[] args) {

		StaticAndNonStatic obj = new StaticAndNonStatic();
		InstanceVar=11;

		obj.nonStaticMethod();

		StaticMethod();

	}

}
