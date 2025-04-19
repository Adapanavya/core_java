import java.util.Scanner;
class Abc{
	int a = 10;
	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	int b = sc.nextInt();
	System.out.println(b);
	Abc obj = new Abc();
	System.out.println(obj.a);
	}
}