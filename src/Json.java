import org.json.*;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Json {
    //Pasar xml en json
    public static final String rutaarchivo="./nombrearchivo.xml";


public static void escArchivo(String Strjson) throws IOException {
    Path path = Paths.get("./ArchivoMatricula.json");
    Files.write(path, Strjson.getBytes());
    }

    public static void main(String[] args) {
        try {
            String strfixtexXML= new String(Files.readAllBytes(Paths.get(rutaarchivo)));
            System.out.println(strfixtexXML);
            JSONObject objJson = XML.toJSONObject(strfixtexXML);
            String strJson = objJson.toString(4);
            System.out.println(strJson);
            escArchivo(strJson);
        }
        catch (FileNotFoundException e){
            e.printStackTrace();
        }
        catch (Exception e){
            e.printStackTrace();
        }


    }


}





