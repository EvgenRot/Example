package Example;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Iterator;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class Test_JSON {
    public static void main(String[] args) {
        String fileName = "Example/example1.txt";

        JSONObject obj = new JSONObject();
        obj.put("Novel Name", "Godaan");
        obj.put("Author", "Munshi Premchand");

        JSONArray novelDetails = new JSONArray();
        novelDetails.add("Language: Hindi");
        novelDetails.add("Year of Publication: 1936");
        novelDetails.add("Publisher: Lokmanya Press");

        obj.put("Novel Details", novelDetails);
        System.out.print(obj);


        try {
            FileWriter writer = new FileWriter(fileName);
            writer.write(String.valueOf(obj));
            writer.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        // ready
        try {
            // читаем json файл
            FileReader reader = new FileReader(fileName);
            JSONParser jsonParser = new JSONParser();
            JSONObject jsonObject = (JSONObject) jsonParser.parse(reader);

            // берем данные из json объекта
            Long id =  (Long) jsonObject.get("id");
            System.out.println("The id is: " + id);

            String type = (String) jsonObject.get("type");
            System.out.println("The type is: " + type);

            String name = (String) jsonObject.get("name");
            System.out.println("The name is: " + name);

            Double ppu =  (Double) jsonObject.get("ppu");
            System.out.println("The PPU is: " + ppu);

            // извлекаем массив
            System.out.println("Batters:");
            JSONArray batterArray= (JSONArray) jsonObject.get("batters");
            Iterator i = batterArray.iterator();

            // проходимся по всем элементам массива
            while (i.hasNext()) {
                JSONObject innerObj = (JSONObject) i.next();
                System.out.println("ID "+ innerObj.get("id") +
                        " type " + innerObj.get("type"));
            }

            System.out.println("Topping:");
            JSONArray toppingArray= (JSONArray) jsonObject.get("topping");
            Iterator j = toppingArray.iterator();
            while (j.hasNext()) {
                JSONObject innerObj = (JSONObject) j.next();
                System.out.println("ID "+ innerObj.get("id") +
                        " type " + innerObj.get("type"));
            }
        } catch (IOException | ParseException | NullPointerException ex) {
            ex.printStackTrace();
        }
    }
}

