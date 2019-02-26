package accessModifiers.allowCreation.classMember;

public class Class_with_protected_nestedClasses {
	
	// Attribute member with protected access modifier
	protected int integerAttributeMember;
	
	// Attribute member with protected access modifier
	protected String stringAttributeMember;
	
	// Method member with protected access modifier
	protected void noReturnMethodMember() {
		
	}

	// Method member with protected access modifier
	protected int integerReturnMethodMember() {
		return 42;
	}
	
	// Method member with protected access modifier
	protected String stringReturnMethodMember() {
		return "Vamos bien!";
	}
	
	
	
	public Class_with_protected_nestedClasses() {
		integerAttributeMember = 42;
		stringAttributeMember = "Vamos bien!";
		integerAttributeMember = integerReturnMethodMember();
		stringAttributeMember = stringReturnMethodMember();
		noReturnMethodMember();		
	} 

}
