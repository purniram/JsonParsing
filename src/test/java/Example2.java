import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Example2 {
    public static void main(String[] args) {

        JSONParser parser = new JSONParser();

        try {
            Object obj = parser.parse(new FileReader("example2.json"));

          //write code here to print all the cars for each person

            List<Map<String,?>> listOfUserInfo = (List<Map<String, ?>>) obj;
            for (Map<String, ?> user : listOfUserInfo)
            {
                System.out.println("Cars with "+ user.get("name"));
                ArrayList<String> carsWithUser = (ArrayList<String>) user.get("cars");
                for ( String car : carsWithUser)
                    System.out.println(car);
                System.out.println();
            }


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (org.json.simple.parser.ParseException e) {
            e.printStackTrace();
        }
    }
}