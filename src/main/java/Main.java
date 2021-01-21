import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) throws FileNotFoundException, IllegalStateException {

        FileReader fileReader = new FileReader("YOUR JSON FILE PATH");
        Gson gson = new Gson();
        City jsonList = gson.fromJson(fileReader, City.class);

        JsonParser jsonParser = new JsonParser();
        JsonObject jsonObject = (JsonObject) jsonParser.parse(new FileReader("YOUR JSON FILE PATH"));
        JsonElement jsonElement = jsonObject.get("coord");


        String[] test = jsonElement.toString().split(",");
        String[] str = jsonList.toString().split(", ");

        List<String> list;
        List<String> list1;


        list1 = Arrays.asList(str);
        System.out.print(list1.toString().replace("]", ""));

        list = Arrays.asList(test);
        System.out.print(list.toString().replace("{", "")
                .replace("}", "").replace("[", ", ")
                .replace("\":", "\": "));

    }
}