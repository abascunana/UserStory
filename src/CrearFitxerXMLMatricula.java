import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.*;

import java.io.*;


public class CrearFitxerXMLMatricula {
    public static final String archivo ="./nombrearchivo.xml";
    public static void main(String argv[])   throws ParserConfigurationException, TransformerException {
        try {
            DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder docBuilder = docFactory.newDocumentBuilder();
            Document doc = docBuilder.newDocument();
            doc.setXmlVersion("1.1");
//------------------------------------------------------------------------------------------------------------Curso
            Element rootElement = doc.createElement("Cicle");
            doc.appendChild(rootElement);

            Element modul1 = doc.createElement("modul");
            rootElement.appendChild(modul1);

            Attr codi = doc.createAttribute("codi");
            codi.setValue("IFC32");
            rootElement.setAttributeNode(codi);

            Attr tipus = doc.createAttribute("tipus");
            tipus.setValue("CFGS");
            rootElement.setAttributeNode(tipus);

            Attr sigles = doc.createAttribute("sigles");
            sigles.setValue("DAM");
            rootElement.setAttributeNode(sigles);

            Attr nom = doc.createAttribute("nom");
            nom.setValue("Desenvolupament aplicacions multiplataforma");
            rootElement.setAttributeNode(sigles);
//-------------------------------------------------------------------------------------------------------------------------------Acceso datos
            Element nom1 = doc.createElement("nom");
            nom1.appendChild(doc.createTextNode("Accés a dades"));
            modul1.appendChild(nom1);

            Attr codii = doc.createAttribute("codi");
            codii.appendChild(doc.createTextNode("0486"));
            modul1.setAttributeNode(codii);

            Attr curs = doc.createAttribute("curs");
            curs.appendChild(doc.createTextNode("2"));
            modul1.setAttributeNode(curs);

            Element nombredores = doc.createElement("Nombredhores");
            nombredores.appendChild(doc.createTextNode("125"));
            modul1.appendChild(nombredores);

//_______________________________________________________________________________________________________________________________
            Element modul2 = doc.createElement("modul");
            rootElement.appendChild(modul2);

            Element nom2 = doc.createElement("nom");
            nom2.appendChild(doc.createTextNode("Sistemas informaticos"));
            modul2.appendChild(nom2);

            Attr codi2 = doc.createAttribute("codi");
            codi2.appendChild(doc.createTextNode("0483"));
            modul2.setAttributeNode(codi2);

            Attr curs2 = doc.createAttribute("curs");
            curs2.appendChild(doc.createTextNode("1"));
            modul2.setAttributeNode(curs2);

            Element nombredores2 = doc.createElement("Nombredhores");
            nombredores2.appendChild(doc.createTextNode("170"));
            modul2.appendChild(nombredores2);

//____________________________________________________________________________________________________________________________________
            Element modul4 = doc.createElement("modul");
            rootElement.appendChild(modul4);

            Element nom4 = doc.createElement("nom");
            nom4.appendChild(doc.createTextNode("Base de datos"));
            modul4.appendChild(nom4);

            Attr codi4 = doc.createAttribute("codi");
            codi4.appendChild(doc.createTextNode("0484"));
            modul4.setAttributeNode(codi4);

            Attr curs4 = doc.createAttribute("curs");
            curs4.appendChild(doc.createTextNode("1"));
            modul4.setAttributeNode(curs4);

            Element nombredores4 = doc.createElement("Nombredhores");
            nombredores4.appendChild(doc.createTextNode("170"));
            modul4.appendChild(nombredores4);


//______------------------------------------------------------------------------------------------------------------------------------

            Element modul5 = doc.createElement("modul");
            rootElement.appendChild(modul5);

            Element nom5 = doc.createElement("nom");
            nom5.appendChild(doc.createTextNode("Programacion"));
            modul5.appendChild(nom5);

            Attr codi5 = doc.createAttribute("codi");
            codi5.appendChild(doc.createTextNode("0485"));
            modul5.setAttributeNode(codi5);

            Attr curs5 = doc.createAttribute("curs");
            curs5.appendChild(doc.createTextNode("1"));
            modul5.setAttributeNode(curs5);

            Element nombredores5 = doc.createElement("Nombredhores");
            nombredores5.appendChild(doc.createTextNode("230"));
            modul5.appendChild(nombredores5);
//-----------------------------------------------------------------------------------------------------------------------------------------------------------







//---------------------------------------------------------------------------------------------------------------------------------------------------------
            TransformerFactory tf = TransformerFactory.newInstance();
            Transformer transformer =tf.newTransformer();
            transformer.setOutputProperty(OutputKeys.METHOD,"xml");
            transformer.setOutputProperty(OutputKeys.ENCODING,"UTF-8");
            transformer.setOutputProperty(OutputKeys.INDENT,"yes");


            DOMSource domresultado = new DOMSource(doc);
            StreamResult streamResult = new StreamResult(new File(archivo));
            transformer.transform(domresultado,streamResult);

            System.out.println("creado");





        }
        catch (Exception exception){
            exception.printStackTrace();
        }







    }
}