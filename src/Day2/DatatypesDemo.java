package Day2;

public class DatatypesDemo {

	public static void main(String[] args) {
		

		//Numeric
		int a=100, b=200;
		System.out.println("the value of a is :"+a);
		System.out.println("the value of b is :"+b);
		System.out.println("Sum of a&b i s:"+a+b);//String gets concatenated by a
		System.out.println("Sum of a&b is :"+(a+b));
		
		byte c = 125;
		short d = 3535;
		long e = 634678927654l;
		System.out.println("the value of c is :"+c);
		System.out.println("the value of d is :"+d);
		System.out.println("the value of e is :"+e);
		
		//Decimal
		float item_price = 15.675f;
		System.out.println(item_price);
		double dbl = 35.765445678;
		System.out.println(dbl);
		
		char ch = 'n';
		System.out.println(ch);
		
		//Non-Primitive
		String name ="Navya";
		System.out.println(name);
		
//		char ch1 = 'abc' //invalid
//	    String str1 = 'abc' //invalid
//	    System.out.println(str1);
		
		boolean bool = true;
		boolean bool2 =false;
		
//		boolean bl ="true"; //invalid- it is treated a sstring ;
		
	}

}
