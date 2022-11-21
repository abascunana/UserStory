import java.io.File;
import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.*;
import org.xml.sax.SAXException;


public class Leer {

    public static void main(String argv[])
            throws ParserConfigurationException, SAXException, IOException {

        String xmlFilePathname = "./nombrearchivo.xml";
        File xmlFile = new File(xmlFilePathname);

        DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder();
        Document document = documentBuilder.parse(xmlFile);

        NodeList nodeList = document.getElementsByTagName("modul");

        for (int i = 0; i <= nodeList.getLength() - 1; i++) {

            Node node = nodeList.item(i);
            Element element = (Element) node;
            System.out.println("---- Element: " + (i + 1) + " ----");
            System.out.println("Nombre de modul: " + getElementText(element, "nom"));
            System.out.println("nombre de hores: " + getElementText(element, "Nombredhores"));


        }

    }

    public static String getElementText(Element element, String tagName) {
        return element.getElementsByTagName(tagName).item(0).getTextContent();
    }

}