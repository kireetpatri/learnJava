package projectOne;
import java.io.File;

import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.FileReader;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;




public class jsonParser {

    public static void main(String[] args){

        Scanner file_name_reader = new Scanner(System.in);
        System.out.println("Please input the name of the JSON file");
        String jsonFilePath = System.getProperty("user.dir")+"\\"+file_name_reader.next();
        JSONParser parser = new JSONParser();
        try {

            //Read file as an object
            Object fileObj = parser.parse(new FileReader(jsonFilePath));
            //Convert this object into a jsonObject
            JSONObject testJsonObj = (JSONObject) fileObj;
            //Read the root and print it
            String grandfather = (String) testJsonObj.get("name");
            JSONArray fathers = (JSONArray) testJsonObj.get("children");
            for(Object father:fathers){
                JSONArray children = (JSONArray) father.get
            }
            //System.out.println("The path is "+jsonFilePath);
        }
        catch(FileNotFoundException fe) {

            fe.printStackTrace();
        }
        catch(Exception e) {

            e.printStackTrace();
        }


    }
}
