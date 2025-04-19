//Create a Java Application where we have one class, it contains one non-static method m1 //with parameter int and returns a Boolean value, and a static method m2 with parameter float //and returns a character value, then invoke both the methods under the main method by //providing dynamic inputs

import java.util.Scanner;
class M2 {
    Scanner sc = new Scanner(System.in);

    boolean m1(int a) {
        System.out.println(a);
        return sc.nextBoolean();
    }

    static char m2(float a) {
        Scanner sc = new Scanner(System.in);
        System.out.println(a);
        return sc.next().charAt(0);
    }
	public static void main(String[] args){
	M2 obj = new M2();
	System.out.println("enter float number");
	System.out.println(m2(obj.sc.nextFloat()));
	System.out.println("enter int number");
	System.out.println(obj.m1(obj.sc.nextInt()));
	
	}
}

