import java.util.function.*;
interface Program2{
	public static void main(String args[]){
		int arr[]={11,22,33,44,55,66,77,88,99};
		Predicate<Integer>p1=(x)-> x%2 ==0;
		Predicate<Integer>p2= (x)->x>50;
		
		process(p1,arr);
		process(p1.negate(),arr);
		process(p2,arr);
		process(p1.negate().and(p2),arr);

		process(p1.negate().or(p2),arr);
	}

	public static void process(Predicate<Integer>p,int arr[]){
		for(int x:arr){
			if(p.test(x)){
				System.out.println(x);
			}
		}
		System.out.println("--------------------");
	}

}