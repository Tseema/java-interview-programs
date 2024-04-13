package com.example.demo;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.StringReader;
import java.util.Collection;
import java.util.LinkedList;
import org.w3c.dom.Node;

public class Folders {
    public static Collection<String> folderNames(String xml, char startingLetter) throws Exception {

        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
        DocumentBuilder db = dbf.newDocumentBuilder();

        Document doc = db.parse(new InputSource(new StringReader(xml)));

        doc.getDocumentElement().normalize();
        NodeList folders = doc.getElementsByTagName("folder");

        Collection<String> list = new LinkedList<String>();

        for(int i = 0; i < folders.getLength(); i++) {
            Node folder = folders.item(i);
            if(folder.getNodeType() == Node.ELEMENT_NODE) {

                Element folderElement = (Element) folder;

                String nameAttr = folderElement.getAttribute("name");
                if (nameAttr.charAt(0) == startingLetter) {
                    list.add(nameAttr);
                }

            }
        }
        return list;

        //throw new UnsupportedOperationException("Waiting to be implemented.");
    }

    public static void main(String[] args) throws Exception {
        String xml =
                "<?xml version=\"1.0\" encoding=\"UTF-8\"?>" +
                        "<folder name=\"c\">" +
                        "<folder name=\"program files\">" +
                        "<folder name=\"uninstall information\" />" +
                        "</folder>" +
                        "<folder name=\"users\" />" +
                        "</folder>";

        Collection<String> names = folderNames(xml, 'u');
        for(String name: names)
            System.out.println(name);
    }

}
