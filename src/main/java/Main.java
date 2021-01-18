import com.google.gson.Gson;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        BufferedReader br = new BufferedReader(new FileReader("toast.json"));
        Gson gson = new Gson();
        Coords coords = null;
        List<ModelJSON> model = new ArrayList<>();
        model.add(gson.fromJson(br, ModelJSON.class));
        System.out.println(model);


        try {
            coords = gson.fromJson(new FileReader("toast.json"), Coords.class);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println(coords);
    }
}
