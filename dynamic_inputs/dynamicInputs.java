import java.util.Scanner;
class DynamicInpt{
	static int a;
	static String str;

	public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
	System.out.println("enter num");
	a=sc.nextInt();
	sc.nextLine();
	
	System.out.println("enter name");
	str=sc.nextLine();

	System.out.println("You entered:");
	System.out.println(a);
	System.out.println(str);
	sc.close();
	}
}
