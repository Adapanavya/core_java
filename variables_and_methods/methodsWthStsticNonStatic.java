class Methods{
	void display(String str){
	System.out.println(str);
	}
	static void displayNum(int num){
	System.out.println(num);
	}
	
	public static void main(String[] args){
	Methods m1=new Methods();
	String s="hii";
	int n=20;
	m1.display(s);
	displayNum(n);
	}
}