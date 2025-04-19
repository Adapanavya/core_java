class A{
	int a=10;;
	String s="hello";
	static int b=50;
	static A obj = new A();
	static void display(String str){
	System.out.println(str);
	System.out.println(obj.a);
	System.out.println(obj.s);
	System.out.println(b);
	}
	static void displayNum(int num){
	System.out.println(num);
	System.out.println(obj.a);
	System.out.println(obj.s);
	System.out.println(b);
	}
	
	public static void main(String[] args){
	display("hii");
	displayNum(20);
	System.out.println(obj.a);
	System.out.println(obj.s);
	System.out.println(b);
	}
}
//create a ja where we have a class it contains one static var and a local variable inside the main method having same variable name,having same name print both the methods under main method;