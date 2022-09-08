package java8feauters.methodreferences;

interface ConstructorInterface{
	Hello display(String say);
}

class Hello{
	//constructor
	Hello(String say) {
	System.out.println("gud mrng...." + say);
	}
}

public class Constructormethodreference {

	public static void main(String[] args) {
		
		//method ref to constructor
		ConstructorInterface ref=Hello::new;
		
		ref.display("how r u doing...");
		

	}

}
