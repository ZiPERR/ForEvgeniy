import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import com.google.gson.reflect.TypeToken;

import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IllegalStateException, IOException {
        FileReader fileReader = new FileReader("toast.json");
        Gson gson = new Gson();
        JsonParser jsonParser = new JsonParser();
        JsonArray jsonArray = (JsonArray) jsonParser.parse(new FileReader("toast.json"));

        Type listType = new TypeToken<ArrayList<City>>() {
        }.getType();

        List<City> listCity = gson.fromJson(jsonArray, listType);

        for (int i = 0; i < listCity.size(); i++) {
            JsonElement lonElement = jsonArray.getAsJsonArray().get(i).getAsJsonObject().get("coord").getAsJsonObject().get("lon");
            JsonElement latElement = jsonArray.getAsJsonArray().get(i).getAsJsonObject().get("coord").getAsJsonObject().get("lat");
            for(City c : listCity){
                c.setLat(latElement.getAsDouble());
                c.setLon(lonElement.getAsDouble());
            }
            System.out.println(listCity.get(i));
        }
    }
}