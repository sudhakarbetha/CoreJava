package first;

public class StringImmutable {
	 public static void main(String[] args)
	    {
		   //Creates object on String Literal Pool
	        String one = "someString";
	        
	        //Creates a new Object
	        String two = new String("someString");
	        
	        //Two strings are equal if they are having same character sequence
	        System.out.println(one.equals(two));
	        
	        //Two objects are equal if they are of same type and reference to same object on heap
	        System.out.println(one == two);
	    }
	
}
