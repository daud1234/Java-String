package string;
import junit.framework.*;
import java.util.Date;

public class i_simple_string extends TestCase {
	static String s="Welcome to the hotel california.";
	static char[] ch={'D','a','u','d',' ','K','h','a','n'};  
	static char hc[]={'D','a','u','d',' ','K','h','a','n'};
	
	// not preferred way, not good practice
	
	static String h=new String("Hey You!");
	static String m=new String(ch);
	static String d="Daud Khan";
	static String e="Daud Khan";
	static double[] d1= {1.2,2.2333331,92,9.003,5,99.00,06};

	public static void main(String[] args) {  
		System.out.println(ch);
		System.out.println(s);
		test();
		System.out.println(h);
		System.out.println(m);
		int a=s.length();  // function of string
		System.out.println(a);
		System.out.println(d.length());
		d=d.concat(" "+h); // adding space
		System.out.println(d);
		
		double c=0;
		double e=d1[0];
		for(int i=0;i<d1.length;i++)
		{
			System.out.println(d1[i]);
			c +=d1[i];
			if(d1[i]>e)
			{
				e=d1[i];
			}
		}
		System.out.println("Summation of Doules: "+c);
		System.out.println("Max: "+e);

		System.out.println("For Each Loop");
		for (double f:d1)
		{
			System.out.println(f);
		}
		//------
		System.out.println("new line");
		
		double[] k=new double[d1.length];
		for(int i=0,j=k.length-1;i<d1.length;i++,j--)
		{
			k[j]=d1[i];
		}
		
		for(int i=0;i<k.length;i++)
		{
			System.out.println(k[i]);
		}
	      Date date = new Date();
	      System.out.println(date.toString());

		
	}
	public static void test(){
	      //assertTrue(e == d);
	        assertEquals(e, d);

	   }
}
