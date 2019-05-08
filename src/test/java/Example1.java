import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class Example1 {
    public static void main(String[] args) {

        JSONParser parser = new JSONParser();

        try {
            Object obj = parser.parse(new FileReader("example1.json"));

            JSONObject jsonObject =  (JSONObject) obj;

            ArrayList<Map<String, String>> listPlatforms= (ArrayList<Map<String, String>>) jsonObject.get("platforms");

            System.out.println("platform names:");
            for ( Map<String, String> map : listPlatforms)
            {
               System.out.println (map.get("name"));
            }

           //write code here to parse the json

            //print all the platforms


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (org.json.simple.parser.ParseException e) {
            e.printStackTrace();
        }
    }
}