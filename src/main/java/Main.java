import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {

        BufferedReader br = new BufferedReader(new FileReader("YOUR JSON NAME HERE"));
        JsonObject jsonObject = new JsonParser().parse(br).getAsJsonObject();
        String jsonToString = jsonObject.toString();
        jsonToString = jsonToString
                .replace(":", ": ")
                .replace(",", ", ")
                .replace("\"coord\":", "")
                .replace("  ", " ")
                .replace("{\"l", "\"l")
                .replace("}}", "}");
        System.out.println(jsonToString);
    }
}
