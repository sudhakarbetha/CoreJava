package inherit;

public class MultInherit implements InterfaceDad,InterfaceMom {
		
	public static void main(String[] args) {

		MultInherit m=new MultInherit();
		m.display();
		//A class can implement 2 interfaces having same variables name,
		//But if you try to use the variable,it gives you compile time error.
		//System.out.println("X="+m.x);
	}
	
	public void display()
	{
		System.out.println("Method is implemented");
	}

}
