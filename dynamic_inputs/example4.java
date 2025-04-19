
//Create a Java Application where we have one class, it contains methods like static m1 //having parameter Boolean which is going to return a Boolean value. non-static //method m2 //having parameter character which is going to return character value. static method m3 //having parameter double which is going to return a double value. //non-static method m4 //having parameter long which is going to return a long value. static method m5 having //parameter float which is going to return float value //non-/static method m6 having //parameter //String which is going to return String value. then invoke all these methods //under the main method by //providing dynamic inputs

import java.util.Scanner;
class Dynamic{
	static Scanner sc = new Scanner(System.in);
	
	static boolean m1(boolean b){
	System.out.println(b);
	return sc.nextBoolean();
	}
	
	char m2(char c){
	System.out.println(c);
	return sc.next().charAt(0);
	}
	
	static double m3(double b){
	System.out.println(b);
	return sc.nextDouble();
	}

	long m4(long l){
	System.out.println(l);
	return sc.nextLong();
	}
	
	static float m5(float f){
	System.out.println(f);
	return sc.nextFloat();
	}

	String m6(String str){
	System.out.println(str);
	return sc.next();
	}

	public static void main(String[] args){
	Dynamic obj = new Dynamic();
	System.out.println("Enter a boolean value");
	System.out.println(m1(obj.sc.nextBoolean()));

	System.out.println("Enter double value");
	System.out.println(m3(obj.sc.nextDouble()));

	System.out.println("Enter a float value");
	System.out.println(m5(obj.sc.nextFloat()));

	System.out.println("Enter character");
	System.out.println(obj.m2(sc.next().charAt(0)));

	System.out.println("enter long value");
	System.out.println(obj.m4(sc.nextLong()));

	System.out.println("Enter the String");
	System.out.println(obj.m6(sc.next()));
	
	}
}