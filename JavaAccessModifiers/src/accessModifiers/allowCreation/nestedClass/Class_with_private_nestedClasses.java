package accessModifiers.allowCreation.nestedClass;

public class Class_with_private_nestedClasses {
	
	public Class_with_private_nestedClasses() {
		
		nestedClass1 myNestedClass1 = new nestedClass1();
		myNestedClass1.nestedClassMethod();
		nestedClass2 myNestedClass2 = new nestedClass2();
		myNestedClass2.nestedClassMethod();
		nestedClass3 myNestedClass3 = new nestedClass3();
		myNestedClass3.nestedClassMethod();
		
	}
	
	// This is the private access modifier in a nested class
	private class nestedClass1{
		
		public void nestedClassMethod() {
			System.out.println("Vamos Bien!");	
		}
		
	}
	
	// This is the private access modifier in a nested class	
	private class nestedClass2{
		public void nestedClassMethod() {
			System.out.println("Vamos Bien!");	
		}
	}
	
	// This is the private access modifier in a nested class
	private class nestedClass3{
		public void nestedClassMethod() {
			System.out.println("Vamos Bien!");	
		}		
	}
	
}
