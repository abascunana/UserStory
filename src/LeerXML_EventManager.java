

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class LeerXML_EventManager extends DefaultHandler {
//objeto pasado en LeerXML

    //Constructor
    public LeerXML_EventManager(){}


    @Override
    public void startDocument(){}


    @Override
    public void startElement(String uri, String nombreLocal, String nombreCualificativo, Attributes atributos) throws SAXException {

        //Recorrer los atributos de un elemento y imprimirlos
        System.out.print("<"+nombreCualificativo+"");
        for (int i = 0; i < atributos.getLength(); i++) {
            System.out.print(" "+atributos.getLocalName(i)+"="+atributos.getValue(i));
        }
        System.out.println(">");
    }

    @Override
    public void endElement(String uri, String nombreLocal, String nombreCualificativo) throws SAXException {
        System.out.println("\n</"+nombreCualificativo+">");

    }



    @Override
    public void characters(char[] ch, int start, int length) throws SAXException {
        String texto = new String(ch, start, length);

        if(texto.trim().length() == 0) return;
        System.out.print(texto);
    }
}
