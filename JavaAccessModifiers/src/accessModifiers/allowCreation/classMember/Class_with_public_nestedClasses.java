package accessModifiers.allowCreation.classMember;

public class Class_with_public_nestedClasses {
	
	// Attribute member with public access modifier
	public int integerAttributeMember;
	
	// Attribute member with public access modifier
	public String stringAttributeMember;
	
	// Method member with public access modifier
	public void noReturnMethodMember() {
		
	}

	// Method member with public access modifier
	public int integerReturnMethodMember() {		
		return 42;
	}
	
	// Method member with public access modifier
	public String stringReturnMethodMember() {		
		return "Vamos Bien!";
	}
	
	
	
	public Class_with_public_nestedClasses() {
		integerAttributeMember = 42;
		stringAttributeMember = "Vamos bien!";
		integerAttributeMember = integerReturnMethodMember();
		stringAttributeMember = stringReturnMethodMember();
		noReturnMethodMember();	
	} 

}
