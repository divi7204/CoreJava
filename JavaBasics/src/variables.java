//Variable - it is the name of the memory location where we store the value
//types - local , instance and static
public class variables {
static int var1=10;//static variable
void display() {
	int var2=20;//local variable
	System.out.println("Local variable value "+var2);
	System.out.println("Static variable value inside the display method "+var1);
}
	public static void main(String[] args) {
		int var3=30;//Instance variable
		System.out.println("Printing static variable value "+var1);
		System.out.println("Static variable value inside the main method "+var1);
		//The below line gives error because the main method doesn't know var2
		//System.out.println("Printing local variable value "+var2);
		variables obj=new variables();
		obj.display();
		//Even though you create the object of the class you can't access the local variable value
		//System.out.println("Printing local variable value "+obj.var2);
		//No need to create object for the instance variable since the method is static and value available inside the method
		System.out.println("Printing Instance variable value "+var3);
	
		

	}

}
