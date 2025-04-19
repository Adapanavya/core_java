

import java.util.Scanner;
class Ab{
	static Scanner sc = new Scanner(System.in);
	int m1(String a){
	System.out.println(a);
	System.out.println("Enter int for m1 return");
	return sc.nextInt();
	}

	static float m2(boolean a){
	System.out.println(a);
	System.out.println("Enter float for m2 return");
	return sc.nextFloat();
	}

	double m3(char a){
	System.out.println(a);
	System.out.println("Enter double for m3 return");
	return sc.nextDouble();
	}
	public static void main(String[] args){
	System.out.println("Enter Boolean number");
	Boolean b = sc.nextBoolean();
	System.out.println(m2(b));
	Ab obj = new Ab();
	System.out.println("Enter String for m1 parameter");
	System.out.println(obj.m1(sc.next()));
	System.out.println("Enter character for m3 parameter");
	System.out.println(obj.m3(sc.next().charAt(0)));
	}
}