package accessModifiers.packageOther;

import accessModifiers.packageBase.BaseClass;

public class NonExtendedClassOtherPackage {

	BaseClass myBaseClass = new BaseClass();
	

	// Access to other class in the same package members
	public void testMethod() {
		//myBaseClass.integerAttributeMember_private = 43; //Error
		//myBaseClass.integerAttributeMember_default = 43; //Error
		//myBaseClass.integerAttributeMember_protected = 43; //Error
		myBaseClass.integerAttributeMember_public = 43;		
		//myBaseClass.voidMethodMember_private(); //Error
		//myBaseClass.voidMethodMember_default(); //Error
		//myBaseClass.voidMethodMember_protected(); //Error
		myBaseClass.voidMethodMember_public();		
	}		
}
