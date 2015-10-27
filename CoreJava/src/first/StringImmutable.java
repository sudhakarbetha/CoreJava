package first;

public class StringImmutable {
	 public static void main(String[] args)
	    {
		   //Creates object on String Literal Pool
	        String one = "someString";
	        
	        //Creates a new Object
	        String two = new String("someString");
	        
	        
	        System.out.println(one.equals(two));
	        System.out.println(one == two);
	    }
	
}
