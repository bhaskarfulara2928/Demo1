interface I{
	public void abc(){
		System.out.println("From I.interface()");
	}

}
interface J{
	public void abc(){
		System.out.println("From J.interface()");
	}

}

class A implements I,J{
	public void abc(){
		System.out.println("From A class");
		I.super.abc();
		J.super.abc();
	}

}

interface Demo{
	public static void main(String args[]){
		A a1=new A();
		a1.abc();
	}

}