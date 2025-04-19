//create a java where we have a class it contains one static var 
//and a local variable inside the main method having same variable name 
//print both the methods under main method;


class MethodWithSameVariable{
	static String str = "hi navya";

	public static void main(String[] args){
	String str = "hello";
	System.out.println(str);
	System.out.println(MethodWithSameVariable.str);
	}
}