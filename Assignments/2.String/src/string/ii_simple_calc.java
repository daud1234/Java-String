package string;
import junit.framework.*;

public class ii_simple_calc extends TestCase{
	static int a=5;
	static int b=6;
	static int c=a+b;
	public static void main(String[] args) {
		
		System.out.println(c);
		System.out.println("Hi");
		test();
		System.out.println("Hi");

	}
	public static void test(){
	      double c = a + b;
	      assertTrue(c == 11);
	   }
}
