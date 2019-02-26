package accessModifiers.allowCreation.nestedClass;

public class Class_with_public_nestedClasses {
	
	public Class_with_public_nestedClasses() {
		
		nestedClass1 myNestedClass1 = new nestedClass1();
		myNestedClass1.nestedClassMethod();
		nestedClass2 myNestedClass2 = new nestedClass2();
		myNestedClass2.nestedClassMethod();
		nestedClass3 myNestedClass3 = new nestedClass3();
		myNestedClass3.nestedClassMethod();
		
	}
	
	// This is the public access modifier in a nested class
	public class nestedClass1{
		
		public void nestedClassMethod() {
			System.out.println("Vamos Bien!");	
		}
		
	}
	
	// This is the public access modifier in a nested class	
	public class nestedClass2{
		public void nestedClassMethod() {
			System.out.println("Vamos Bien!");	
		}
	}
	
	// This is the public access modifier in a nested class
	public class nestedClass3{
		public void nestedClassMethod() {
			System.out.println("Vamos Bien!");	
		}		
	}

}
