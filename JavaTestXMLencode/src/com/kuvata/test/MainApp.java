package com.kuvata.test;

import java.beans.ExceptionListener;
import java.beans.XMLDecoder;
import java.beans.XMLEncoder;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import com.kuvata.kmf.presentation.HtmlPresentation;
import com.kuvata.kmf.presentation.HtmlPresentationNew;
import com.kuvata.kmf.presentation.ReferencedFile;

public class MainApp {
	
    public static void main(String[] args) throws IOException
    {
        
		System.out.println("*************************************");
		HtmlPresentation myHtmlPresentation = new HtmlPresentation();
		myHtmlPresentation.setChromeDisableGpu(true);
		myHtmlPresentation.setHtml5Hwaccel(true);
		myHtmlPresentation.setOpacity(100);
		myHtmlPresentation.setUseChrome(false);
		myHtmlPresentation.setStartPage("index.html");
		
         
        //Before
        System.out.println(myHtmlPresentation);
        serializeToXMLHtmlPresentation ( myHtmlPresentation );
        HtmlPresentation loadedHtmlPresentation = deserializeFromXMLHtmlPresentation();
        //After
        System.out.println(loadedHtmlPresentation);
        
        
        
		System.out.println("*************************************");
		HtmlPresentationNew myHtmlPresentationNew = new HtmlPresentationNew();
		myHtmlPresentationNew.setChromeDisableGpu(true);
		myHtmlPresentationNew.setHtml5Hwaccel(true);
		myHtmlPresentationNew.setOpacity(100);
		myHtmlPresentationNew.setUseChrome(false);
		myHtmlPresentationNew.setStartPage("index.html");
		
		ReferencedFile myReferencedFile = new ReferencedFile("html/753223-html-3003651763.zip");
		myReferencedFile.setFilesize(new Long(5423));
		
		
		myHtmlPresentationNew.setReferencedFile(myReferencedFile);
		
		
		
		
         
        //Before
        System.out.println(myHtmlPresentationNew);
        serializeToXMLHtmlPresentationNew ( myHtmlPresentationNew );
        HtmlPresentationNew loadedHtmlPresentationNew = deserializeFromXMLHtmlPresentationNew();
        //After
        System.out.println(loadedHtmlPresentationNew);
    }

    
    private static void serializeToXMLHtmlPresentationNew (HtmlPresentationNew settings) throws IOException
    {
        FileOutputStream fos = new FileOutputStream("test02.xml");
        XMLEncoder encoder = new XMLEncoder(fos);
        encoder.setExceptionListener(new ExceptionListener() {
                public void exceptionThrown(Exception e) {
                    System.out.println("Exception! :"+e.toString());
                }
        });
        encoder.writeObject(settings);
        encoder.close();
        fos.close();
    }
     
    private static HtmlPresentationNew deserializeFromXMLHtmlPresentationNew() throws IOException {
        FileInputStream fis = new FileInputStream("test02.xml");
        XMLDecoder decoder = new XMLDecoder(fis);
        HtmlPresentationNew decodedSettings = (HtmlPresentationNew) decoder.readObject();
        decoder.close();
        fis.close();
        return decodedSettings;
    }
    
   private static void serializeToXMLHtmlPresentation (HtmlPresentation settings) throws IOException
   {
       FileOutputStream fos = new FileOutputStream("test01.xml");
       XMLEncoder encoder = new XMLEncoder(fos);
       encoder.setExceptionListener(new ExceptionListener() {
               public void exceptionThrown(Exception e) {
                   System.out.println("Exception! :"+e.toString());
               }
       });
       encoder.writeObject(settings);
       encoder.close();
       fos.close();
   }
    
   private static HtmlPresentation deserializeFromXMLHtmlPresentation() throws IOException {
       FileInputStream fis = new FileInputStream("test01.xml");
       XMLDecoder decoder = new XMLDecoder(fis);
       HtmlPresentation decodedSettings = (HtmlPresentation) decoder.readObject();
       decoder.close();
       fis.close();
       return decodedSettings;
   }
     
}
