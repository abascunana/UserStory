import org.json.JSONArray;
import org.json.JSONObject;
import org.json.XML;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;

public class LeerJson{
    public static final String ruta ="./ArchivoMatricula.json";
    public static void main(String[] args) {
        try {
            String strfixterJSON= new String(Files.readAllBytes(Paths.get(ruta)));
            System.out.println(strfixterJSON);
            JSONObject objJson = new JSONObject(strfixterJSON);
            System.out.println(objJson);
           System.out.println("Keyset "+ objJson.keySet());
            JSONObject ciclevalue = objJson.getJSONObject("Cicle");

            System.out.println("Cicle sigles " +ciclevalue.getString("sigles") );
            System.out.println("Cicle tipus " +ciclevalue.getString("tipus") );
            System.out.println("Cicle codi " +ciclevalue.getString("codi") );


            JSONArray curs1 = ciclevalue.getJSONArray("curs1");
            System.out.println("curs1");
            for (int i = 0; i <curs1.length() ; i++) {
                System.out.print(curs1.get(i));
            }

            JSONArray curs2 = ciclevalue.getJSONArray("curs2");

            System.out.println("curs2");
            for (int i = 0; i <curs2.length() ; i++) {
                System.out.print(curs2.get(i));
            }


        }
        catch (FileNotFoundException e){
            e.printStackTrace();
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
    /*{"Cicle": {
    "sigles": "DAM",
    "tipus": "CFGS",
    "codi": "IFC32",
    "curs1": [
        "moduls", [{
            "Nombredhores": 125,
            "nom": "Sistemas Informáticos",
            "codi": "0483"
        }, {
            "Nombredhores": 170,
            "nom": "Base de datos",
            "codi": "0484"
        },
            {
                "Nombredhores": 230,
                "nom": "Programacion",
                "codi": "0485"
            }]

    ],
    "curs2":[
        "moduls", [{
            "Nombredhores": 125,
            "nom": "Desarrollo de interfaces",
            "codi": "0488"}
        ], [{
            "Nombredhores": 125,
            "nom": "Accés a dades",
            "codi": "0486"}
        ]

    ]

}}*/
}
