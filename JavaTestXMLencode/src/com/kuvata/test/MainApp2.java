package com.kuvata.test;

import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

public class MainApp2 {
	
	
	public static void main(String args[]) throws Exception {
		
		
        File fileToBeModified = new File( "test02.xml" );

        String targetStr = "<object class=\"com.kuvata.kmf.presentation.HtmlPresentationNew\">";
        String altStr = "<object class=\"com.kuvata.kmf.presentation.HtmlPresentation\">";
        
        java.util.Scanner scanner = new Scanner(fileToBeModified);
        StringBuilder buffer = new StringBuilder();
        while(scanner.hasNext()){
          buffer.append(scanner.nextLine().replaceAll(targetStr, altStr));
          if(scanner.hasNext())buffer.append("\n");
        }
        scanner.close();
        java.io.PrintWriter printer = new PrintWriter(fileToBeModified);
        printer.print(buffer);
        printer.close();

        System.out.println("COMPLETED!!!");
		
	}

}
