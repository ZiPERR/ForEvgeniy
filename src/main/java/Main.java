import com.google.gson.Gson;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        BufferedReader br = new BufferedReader(new FileReader("YOUR JSON NAME HERE"));
        Gson gson = new Gson();
        ModelJSON model = gson.fromJson(br, ModelJSON.class);
        System.out.println(model);
    }
}
