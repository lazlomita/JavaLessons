package accessModifiers.packageBase;

public class OtherClassSamePackage {
	
	BaseClass myBaseClass = new BaseClass();
	

	// Access to other class in the same package members
	public void testMethod() {
		//myBaseClass.integerAttributeMember_private = 43; //Error
		myBaseClass.integerAttributeMember_default = 43;
		myBaseClass.integerAttributeMember_protected = 43;
		myBaseClass.integerAttributeMember_public = 43;		
		//myBaseClass.voidMethodMember_private(); //Error
		myBaseClass.voidMethodMember_default();
		myBaseClass.voidMethodMember_protected();
		myBaseClass.voidMethodMember_public();		
	}	

}
