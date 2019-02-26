package com.kuvata.test;

public class HtmlPresentation extends Presentation {
	
	private Boolean addExtraFields = false;
	
	public HtmlPresentation(Boolean useExtraFields){
		
		if(useExtraFields) {
			addExtraFields = true;
		} else {
			addExtraFields = false;
		}
		
	}

	public void xmlEncode() {
		System.out.println("XML encoding done on HtmlPresentation Class");
		
		if(addExtraFields) {
			System.out.println("Adding extra fields on HtmlPresentation Class");			
		}
	}

}
