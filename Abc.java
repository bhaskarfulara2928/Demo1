interface I{
	public void abc();

}

class Abc{
	public static void main(String args[]){
		I i1= () -> 
			System.out.println("From Lambda experession 1");
			System.out.println("From Lambda experession 2");
			System.out.println("From Lambda experession 3");
		i1.abc();
	}

}