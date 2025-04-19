import java.util.Scanner;
class Example1{
	static Scanner sc = new Scanner(System.in);
	void m1(int a){
	System.out.println(a);

	}
	void m2(String str){
	System.out.println(str);
	System.out.println("enter int value");
	m1(sc.nextInt());
	}
	void m3(float f){
	System.out.println(f);
	System.out.println("enter string value");
	m2(sc.next());
	}
	void m4(boolean b){
	System.out.println(b);
	System.out.println("enter float value");
	m3(sc.nextFloat());
	}
	void m5(double d){
	System.out.println(d);
	System.out.println("enter boolean value");
	m4(sc.nextBoolean());
	}
	public static void main(String[] args){
	Example1 obj = new Example1();
	System.out.println("enter double value");
	obj.m5(obj.sc.nextDouble());
	}
}