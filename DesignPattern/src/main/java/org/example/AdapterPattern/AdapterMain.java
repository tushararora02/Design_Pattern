package org.example.AdapterPattern;

import org.example.AbstractFactoryPattern.AbstractLoggerFactory;
import org.example.AbstractFactoryPattern.ConsoleAbstractLoggerFactory;
import org.example.AbstractFactoryPattern.FileAbstractLoggerFactory;
import org.example.AbstractFactoryPattern.Logger;

public class AdapterMain {
    public static void main(String[] args) {
        String TEST_XML_STRING =

                "<?xml version=\"1.0\" ?><test attrib=\"moretest\">Turn this to JSON</test>";
       XmlData xmlData=new XmlData();
       xmlData.setXml_text(TEST_XML_STRING);
       AdapterXmlToJson adapterXmlToJson=new AdapterXmlToJson(xmlData);
       System.out.println(adapterXmlToJson.getJson());




    }
}