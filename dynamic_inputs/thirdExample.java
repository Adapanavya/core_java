import java.util.Scanner;
class ThirdExample{
	static Scanner sc =  new Scanner(System.in);

	float m1(String a){
	
	System.out.println(a);
	//System.out.println("Enter float value");
	return sc.nextFloat();
	}

	static boolean m2(char a){
	System.out.println(a);
	System.out.println("Enter string value");
	ThirdExample obj = new ThirdExample();
	obj.m1(sc.next());
	return sc.nextBoolean();
	}

	double m3(int a){
	System.out.println(a);
	System.out.println("Enter character");
	m2(sc.next().charAt(0));
	return sc.nextDouble();
	}
	
	static int m4(double a){
	System.out.println(a);
	System.out.println("Enter int value");
	ThirdExample obj = new ThirdExample();
	obj.m3(sc.nextInt());
	return sc.nextInt();
	}

	
	public static void main(String[] args){
	ThirdExample obj = new ThirdExample();
	System.out.println("Enter double value");
	System.out.println(m4(sc.nextDouble()));
	}
}