package projectOne;
import java.io.File;

import java.util.Iterator;
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
            //Loop the child of the root node
            JSONArray fathers = (JSONArray) testJsonObj.get("children");
            Iterator<String> iterator = fathers.iterator();
            //put a for loop for length of array
            while (iterator.hasNext()){

                JSONArray children = (JSONArray) fathers.get(0);



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
