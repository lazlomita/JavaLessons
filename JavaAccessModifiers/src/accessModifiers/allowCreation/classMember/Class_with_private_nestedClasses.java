package accessModifiers.allowCreation.classMember;

public class Class_with_private_nestedClasses {
	
	// Attribute member with private access modifier
	private int integerAttributeMember;
	
	// Attribute member with private access modifier
	private String stringAttributeMember;
	
	// Method member with private access modifier
	private void noReturnMethodMember() {
		
	}

	// Method member with private access modifier
	private int integerReturnMethodMember() {
		return integerAttributeMember;
	}
	
	// Method member with private access modifier
	private String stringReturnMethodMember() {
		return stringAttributeMember;
	}
	
	
	
	public Class_with_private_nestedClasses() {
		integerAttributeMember = 42;
		stringAttributeMember = "Vamos bien!";
		integerAttributeMember = integerReturnMethodMember();
		stringAttributeMember = stringReturnMethodMember();
		noReturnMethodMember();	
	} 
	
}
