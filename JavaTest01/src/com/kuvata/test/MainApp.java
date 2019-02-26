package com.kuvata.test;

public class MainApp {
	
	public static void main(String args[]) {
		System.out.println("Begin test..............");
		
		System.out.println("");
		System.out.println("Presentation 1");
		Presentation presentation = null;		
		presentation = new HtmlPresentation( new Boolean(true) );				
		presentation.xmlEncode();
		

		System.out.println("");
		System.out.println("Presentation 3");
		Presentation presentation2 = null;		
		presentation2 = new HtmlPresentation( new Boolean(false) );				
		presentation2.xmlEncode();
		

		System.out.println("");
		System.out.println("Presentation 3");
		Presentation presentation3 = null;		
		presentation3 = new Presentation();				
		presentation3.xmlEncode();
		

		System.out.println("");
		System.out.println("Presentation 4");
		Presentation presentation4 = null;		
		presentation4 = new UrlPresentation();				
		presentation4.xmlEncode();

		System.out.println("");
		System.out.println("End test..............");
	}

}
