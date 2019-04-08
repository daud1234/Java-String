package methref;


interface doadd{  
    int dothis(int a,int b);  
}  
public class i_staticmethod {  
//    public static void doaddSomething(){  
//        System.out.println("Hello, this is static method.");  
//    } 
//    private int operate(int a, int b, doadd fobj) 
//	{ 
//		return fobj.dothis(a, b); 
//	}
    public static void main(String[] args) {  
    	doadd doaddobj = (int a,int b)->a+b;  
    	System.out.println("Add Result: "+doaddobj.dothis(6, 3));
    }  
}

