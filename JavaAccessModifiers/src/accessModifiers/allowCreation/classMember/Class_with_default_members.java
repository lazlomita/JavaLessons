package accessModifiers.allowCreation.classMember;

public class Class_with_default_members {
	
	// Attribute member with default access modifier
	int integerAttributeMember;
	
	// Attribute member with default access modifier
	String stringAttributeMember;
	
	// Method member with default access modifier
	void noReturnMethodMember() {
		
	}

	// Method member with default access modifier
	int integerReturnMethodMember() {		
		return 42;
	}
	
	// Method member with default access modifier
	String stringReturnMethodMember() {		
		return "Vamos Bien!";
	}
	
	
	
	public Class_with_default_members() {
		integerAttributeMember = 42;
		stringAttributeMember = "Vamos bien!";
		integerAttributeMember = integerReturnMethodMember();
		stringAttributeMember = stringReturnMethodMember();
		noReturnMethodMember();	
	} 

}
