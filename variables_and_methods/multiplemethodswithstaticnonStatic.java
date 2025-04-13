class Methods1{
	void display(float f){
	System.out.println(f);
	}
	static void displayNum(int num){
	System.out.println(num);
	}
	static void displayBool(boolean b){
	System.out.println(b);
	}
	
	public static void main(String[] args){
	Methods1 m1=new Methods1();
	//Methods1 m2=new Methods1();
	float flt=1.2f;
	int n=20;
	Boolean bl=true;
	m1.display(flt);
	displayNum(n);
	m1.displayBool(bl);
	}
}