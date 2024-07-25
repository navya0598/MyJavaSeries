package Day3;

public class OperatorsDemo {

	public static void main(String[] args) {
		
		//Arithmetic
		
		int a=10, b=20;		
		System.out.println("Sum of a and b "+(a+b));
		System.out.println("Sum of a and b "+(b-a));
		System.out.println(a*b);
		System.out.println(a/b);//value
		System.out.println(a%b);//remainder
		int result = a+b;
		System.out.println(result);
		
		//Relational
		//they return boolean value
		System.out.println(a>b); //false
		System.out.println(a<b);//true
		System.out.println(a>=b);//false
		System.out.println(a<=b);
		b=10;
		System.out.println(a>=b);//false
		System.out.println(a<=b);
		System.out.println(a!=b);
		System.out.println(a==b);

		//Logical Operator
		//return boolean value - works between two boolean only 
		System.out.println("L0gical--------------------------------");
		boolean x =true;
		boolean y =false;
		System.out.println(x && y);
		System.out.println(x || y);
		System.out.println(!x);
		System.out.println(!y);
		System.out.println((10<20) && (20>10));
		
	}

}
