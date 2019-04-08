package methref;

import methref.ii_instanceMethod2;
import methref.ii_instanceMethod2.FuncInter1;
import methref.ii_instanceMethod2.FuncInter2;

public class ii_instanceMethod2 
{ 
	interface FuncInter1 
	{ 
		int operation(int a, int b); 
	} 
	interface FuncInter2 
	{ 
		void sayMessage(String message); 
	} 
	private int operate(int a, int b, FuncInter1 fobj) 
	{ 
		return fobj.operation(a, b); 
	} 
	public static void main(String args[]) 
	{ 
		FuncInter1 add = (int x, int y) -> x + y;  
		FuncInter1 multiply = (int x, int y) -> x * y; 
		ii_instanceMethod2 tobj = new ii_instanceMethod2(); 
		System.out.println("Addition: " + tobj.operate(6, 3, add)); 
		System.out.println("Multiplication: " + tobj.operate(6, 3, multiply)); 
		FuncInter2 fobj = message ->System.out.println("Wow! "+ message); 
		fobj.sayMessage("secret message"); 
	} 
}