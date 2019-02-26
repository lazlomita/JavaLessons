package accessModifiers.allowCreation.nestedClass;

public class Class_with_protected_nestedClasses {
	
	public Class_with_protected_nestedClasses() {
		
		nestedClass1 myNestedClass1 = new nestedClass1();
		myNestedClass1.nestedClassMethod();
		nestedClass2 myNestedClass2 = new nestedClass2();
		myNestedClass2.nestedClassMethod();
		nestedClass3 myNestedClass3 = new nestedClass3();
		myNestedClass3.nestedClassMethod();
		
	}
	
	// This is the protected access modifier in a nested class
	protected class nestedClass1{
		
		public void nestedClassMethod() {
			System.out.println("Vamos Bien!");	
		}
		
	}
	
	// This is the protected access modifier in a nested class	
	protected class nestedClass2{
		public void nestedClassMethod() {
			System.out.println("Vamos Bien!");	
		}
	}
	
	// This is the protected access modifier in a nested class
	protected class nestedClass3{
		public void nestedClassMethod() {
			System.out.println("Vamos Bien!");	
		}		
	}

}
