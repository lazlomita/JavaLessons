package accessModifiers.packageBase;

public class BaseClass {
	
	// Attribute member with private access modifier
	private int integerAttributeMember_private;
	// Attribute member with default access modifier
	int integerAttributeMember_default;
	// Attribute member with protected access modifier
	protected int integerAttributeMember_protected;
	// Attribute member with public access modifier
	public int integerAttributeMember_public;	
	// Method member with private access modifier
	private void voidMethodMember_private() { }
	// Method member with default access modifier
	void voidMethodMember_default() { }
	// Method member with protected access modifier
	protected void voidMethodMember_protected() { }
	// Method member with public access modifier
	public void voidMethodMember_public() { }
	
	
	
	
	// Same class accessing class members
	public void testMethod() {
		integerAttributeMember_private = 43;
		integerAttributeMember_private = integerAttributeMember_private++;
		integerAttributeMember_default = 43;
		integerAttributeMember_protected = 43;
		integerAttributeMember_public = 43;		
		voidMethodMember_private();
		voidMethodMember_default();
		voidMethodMember_protected();
		voidMethodMember_public();		
	}	
}
