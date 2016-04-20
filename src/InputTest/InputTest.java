package InputTest;
import java.util.Scanner;

public class InputTest {
	
   public static String binary;
   protected static String binary1 = "Hello";
   protected static String binary2 = "xyz";
    
    
	public static void main(String[] args){
        
		if(test(null)==true){
			System.out.println("You match");
		}
		else{
			System.out.println("Who are you?");
		}
       
	}
	
	public static boolean test(String input){
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Enter the correct phrase (This program is caps sensitive):");
        
		if(input == null){
		binary = keyboard.nextLine(); 
		}
		else{
			binary = input;
		}
		
        char[] textArray = binary.toCharArray();
        char[] textArray1 = binary1.toCharArray();
        char[] textArray2 = binary2.toCharArray();
       
        if (xor(textArray, textArray2).equals(xor(textArray1, textArray2))) {
        	return true;
        }
        else {
        	return false;
        }
        
	}
	
	public static String xor ( char[] a, char[] b )
    {
    int length = Math.min (a.length, b.length );
    int[] result = new int[length];
    String str="";
    for ( int i=0; i<length ; i++ )
       {
       result[i] = ( a[i] ^ b[i] );
       str=str+""+result[i];
        }
      return str;
    }

}
