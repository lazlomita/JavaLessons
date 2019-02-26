package accessModifiers.packageBase;

import accessModifiers.packageBase.BaseClass;

public class ExtendedClassSamePackage extends BaseClass {

	// Same class accessing class members
	public void testMethod() {
		//integerAttributeMember_private = 43; //Error
		//integerAttributeMember_default = 43; //Error
		integerAttributeMember_protected = 43;
		integerAttributeMember_public = 43;		
		//voidMethodMember_private(); //Error
		//voidMethodMember_default(); //Error
		voidMethodMember_protected();
		voidMethodMember_public();		
	}	
}
