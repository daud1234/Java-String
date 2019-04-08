package methref;

import java.util.Arrays;
public class iv_arbitrary_obj {  

   public static void main(String[] args) {  
	String[] stringArray = { "Steve", "Rick", "Aditya", "Negan",
			"Lucy", "Sansa", "Jon"};
	Arrays.sort(stringArray, String::compareToIgnoreCase); 
	//String::compareToIgnoreCase 
	// only for this part, this method reference is created
	
	for(String str: stringArray){
		System.out.println(str);
	}
   }  
}