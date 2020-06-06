class test1{
	public void testing(){
	System.out.println("objectFile");
	}
}

class test2 extends test1{
	
			 int javanum(int a,int b){
				 int c=a+b;
				  return c;
			 }
}
class Testjava {
		public static void main ( String[] args) {
		    test2 tester = new test2();
			tester.testing();
			System.out.println("Addition of two numbers "  +tester.javanum(5,6));
	   System.out.println ("TestJavaFile");
}
}

