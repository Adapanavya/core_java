class Method4{
	int a;
	String str;
	
	static float f;
	static boolean b;
	public static void main(String[] args){
	Method4 forAccess=new Method4();
	forAccess.a=10;
	forAccess.str="Hello";
	f = 1.8f;
	b = true;
	System.out.println(forAccess.a);
	System.out.println(forAccess.str);
	System.out.println(f);
	System.out.println(b);
	}
} 