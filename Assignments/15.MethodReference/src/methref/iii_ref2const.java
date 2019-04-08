package methref;


interface interfclass{  
	type getMessage(String msg);  
}  
  
class type
{
	type(String str){
		System.out.println(str);
	}
}
public class iii_ref2const {  
    public static void main(String[] args) {  
    	interfclass hello = type::new;  
        hello.getMessage("Hello");  
    }  
}
